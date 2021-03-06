package com.cafromet.server;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.ScrollPaneConstants;
import javax.swing.text.DefaultCaret;


public class Logger extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	static JTextField mensaje = new JTextField();

	private JFrame ventana;
	private JScrollPane scrollpane1;
	static JTextArea textarea1;
	JButton botonEnviar = new JButton("Enviar");
	JButton botonSalir = new JButton("Salir");
	Servidor s = null;

	
	public Logger() {		
		super(" VENTANA SERVIDOR ");
		
		setBounds(750, 300, 500, 450);
		setResizable(false);
		setAlwaysOnTop(true);
		getContentPane().setLayout(null);

		mensaje.setBounds(10, 10, 400, 30);
		getContentPane().add(mensaje);
		mensaje.setEditable(false);
		textarea1 = new JTextArea();

		textarea1.setLineWrap(true);
		DefaultCaret caret = (DefaultCaret)textarea1.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
	
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10, 50, 400, 300);
		getContentPane().add(scrollpane1);
		botonSalir.setBounds(206, 370, 100, 30);
		getContentPane().add(botonSalir);

		textarea1.setEditable(false);
		botonEnviar.addActionListener(this);
		botonSalir.addActionListener(this);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setVisible(true);

		
	}
	
	public boolean iniciarSesion() {
		s = new Servidor(textarea1,mensaje);
		s.start();
		return true;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonSalir) { 
			s.desconectar();
		}
	}
	
	public JFrame getVentana() {
		return ventana;
	}
}
