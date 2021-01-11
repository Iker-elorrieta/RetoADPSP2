package com.cafromet.modeloDAO;

import org.hibernate.Query;
import org.hibernate.Session;

import com.cafromet.modelo.Provincia;
import com.cafromet.util.HibernateUtil;

@SuppressWarnings("deprecation")
public class ProvinciaDAO {
	public static Session SESSION;
	private static String HQL;
	@SuppressWarnings("rawtypes")
	private static Query QUERY;
	
	public static void iniciarSesion() { 
		SESSION = HibernateUtil.getSessionFactory().openSession();

	}
	
	public static void cerrarSesion() {
		SESSION.close();
	}
	
	public static boolean duplicado(Provincia provincia) {
		Provincia registro = consultarRegistro(provincia.getIdProvincia());
		if(registro != null) {
			return true;
		}else if(provincia.equals(registro)) {
			return true;
		}
		return false;
	}
	
	public static boolean insertarRegistro(Provincia provincia) {
		if(duplicado(provincia)) {
			return false;
		}
		SESSION.beginTransaction();
		SESSION.save(provincia);
		SESSION.getTransaction().commit();

		return true;
	}
		
	public static Provincia consultarRegistro(int id) {
		HQL = "from Provincia  where idProvincia = :id";
		QUERY = SESSION.createQuery(HQL);
		QUERY.setParameter("id", id);
		Provincia provincia = (Provincia) QUERY.uniqueResult(); 
		if (provincia == null) {
			return null;
		}
        return provincia;
	}
	
	public static void borrarRegistro(int id) {
		SESSION.beginTransaction();	
		HQL = "from Provincia  where idProvincia = :id";
		QUERY = SESSION.createQuery(HQL);
		QUERY.setParameter("id", id);
		
		Provincia provincia = (Provincia) QUERY.uniqueResult(); 

		SESSION.delete(provincia);
		
		SESSION.getTransaction().commit();
		System.out.println("\n FILA(S) BORRADA(S)\n");
	}
}
