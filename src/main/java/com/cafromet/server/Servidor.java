package com.cafromet.server;
import java.io.File;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.cafromet.util.GestorFicheros;
import com.cafromet.util.HibernateUtil;

public class Servidor extends Thread {

	private int PUERTO = 44444;
	protected static int MAX_CONEXIONES = 3;
	private JTextArea textArea = null;
	private JTextField texto = null;
	private boolean continuar = true;
	private ServerSocket servidor = null;

	public Servidor(JTextArea textArea, JTextField texto) {
		this.texto = texto;
		this.textArea = textArea;
		texto.setText("0");
	}

	public void run() {

		try {
			
			servidor = new ServerSocket(PUERTO);

			System.out.println("\n **SERVIDOR INICIADO**");
			Socket socket = new Socket();
			
			texto.setText("Numero de consultas realizadas (sesion actual): " + IOListenerSrv.NUM_CONSULTAS);
			iniciarSesionHibernate();
			while (continuar) {
				Thread.sleep(200);
				if (GestorConexiones.getInstance().getNumUsuarios() < Servidor.MAX_CONEXIONES)
					textArea.append(" Esperando conexiones...\n");
				else
					textArea.append(" Servidor lleno\n");
				socket = servidor.accept();

				if (GestorConexiones.getInstance().getNumUsuarios() < MAX_CONEXIONES) {
					IOListenerSrv hilo = new IOListenerSrv(socket, textArea, texto);
					hilo.start();
					GestorConexiones.getInstance().registrarConexion(hilo);
					System.out.println("\n #CONEXION " + hilo.getIdConexion() + " -> Conectado");
					texto.setText("Numero de consultas realizadas (sesion actual): " + IOListenerSrv.NUM_CONSULTAS);
				}
				else
					socket.close();
			}
			socket.close();			
			System.out.println("\n **SERVIDOR TERMINADO**");
		} catch (IOException e) {
			System.out.println("\n **SERVIDOR CERRADO**");
			System.exit(0);
		} catch (InterruptedException e) {
			System.out.println("\n !ERROR: Servidor -> InterruptedException");
		}
	}
	
	public static boolean iniciarSesionHibernate() {
		System.out.println("\n ** CONECTADO A LA BBDD **\n"
		 		 + " -------------------------"); 
		HibernateUtil.getSessionFactory().openSession();
		return true;
 
	}
	
	public boolean cerrarSesionHibernate() {
		System.out.println("\n ** DESCONECTADO DE LA BBDD **\n"
		 		 + " -----------------------------"); 
		HibernateUtil.getSessionFactory().close();
		return true;		
	}
	
	public void desconectar() {
		continuar = false;
		try {			
			
			cerrarSesionHibernate();
			GestorConexiones.getInstance().mensajeDeDifusion("*");			
			servidor.close();
			GestorFicheros.eliminarDirectorio(new File(Updater.RUTA_TEMP));
			System.out.println("\n FICHEROS TEMPORALES BORRADOS => " + Updater.RUTA_TEMP);

		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
