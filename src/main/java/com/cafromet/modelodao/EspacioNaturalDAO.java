package com.cafromet.modelodao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.cafromet.modelo.EspacioNatural;
import com.cafromet.util.HibernateUtil;

@SuppressWarnings("deprecation")
public class EspacioNaturalDAO {
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
	
	public static boolean duplicado(EspacioNatural espacio) {
		EspacioNatural registro = consultarRegistroPorNombre(espacio.getNombre());
		if(consultarRegistroPorNombre(espacio.getNombre()) != null) {
			return true;
		}else if(espacio.equals(registro)) {
			return true;
		}
		return false;
	}
	
	public static boolean insertarRegistro(EspacioNatural espacio) {
		if(duplicado(espacio)) {
			return false;
		}
		SESSION.beginTransaction();		
		SESSION.save(espacio);
		SESSION.getTransaction().commit();	
		return true;
	}
		
	public static EspacioNatural consultarRegistroPorNombre(String nombre) {
		HQL = "from EspacioNatural as esp where esp.nombre = :nombre";
		QUERY = SESSION.createQuery(HQL);
		QUERY.setParameter("nombre", nombre);
		EspacioNatural espacio = (EspacioNatural) QUERY.uniqueResult(); 
		return espacio;
	}
	
	public static List<EspacioNatural> consultarRegistros() {
		HQL = "from EspacioNatural";
		QUERY = SESSION.createQuery(HQL);
		List<EspacioNatural> espacioNatural = QUERY.list(); 
        return espacioNatural;
	}
	
	public static boolean borrarRegistro(String nombre) {
		SESSION.beginTransaction();	
		HQL = "from EspacioNatural where nombre = :nombre";
		QUERY = SESSION.createQuery(HQL);
		QUERY.setParameter("nombre", nombre);	
		EspacioNatural espacioNat =  (EspacioNatural) QUERY.uniqueResult(); 
		SESSION.delete(espacioNat);		
		SESSION.getTransaction().commit();
		System.out.println("\n >> REGISTRO BORRADO");
		return true;
	}
}
