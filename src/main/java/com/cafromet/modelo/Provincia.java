package com.cafromet.modelo;
// Generated 20 ene. 2021 17:05:37 by Hibernate Tools 5.4.21.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Provincia generated by hbm2java
 */
public class Provincia implements java.io.Serializable {

	private int idProvincia;
	private String nombre;
	private Set municipios = new HashSet(0);

	public Provincia() {
	}

	public Provincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}

	public Provincia(int idProvincia, String nombre, Set municipios) {
		this.idProvincia = idProvincia;
		this.nombre = nombre;
		this.municipios = municipios;
	}

	public int getIdProvincia() {
		return this.idProvincia;
	}

	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set getMunicipios() {
		return this.municipios;
	}

	public void setMunicipios(Set municipios) {
		this.municipios = municipios;
	}

}
