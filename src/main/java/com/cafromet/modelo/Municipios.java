package com.cafromet.modelo;
// Generated 19 dic. 2020 1:10:31 by Hibernate Tools 5.4.18.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Municipios generated by hbm2java
 */
public class Municipios implements java.io.Serializable {

	private int idMunicipio;
	private String nombre;
	private Set centrosMeteorologicoses = new HashSet(0);

	public Municipios() {
	}

	public Municipios(int idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public Municipios(int idMunicipio, String nombre, Set centrosMeteorologicoses) {
		this.idMunicipio = idMunicipio;
		this.nombre = nombre;
		this.centrosMeteorologicoses = centrosMeteorologicoses;
	}

	public int getIdMunicipio() {
		return this.idMunicipio;
	}

	public void setIdMunicipio(int idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set getCentrosMeteorologicoses() {
		return this.centrosMeteorologicoses;
	}

	public void setCentrosMeteorologicoses(Set centrosMeteorologicoses) {
		this.centrosMeteorologicoses = centrosMeteorologicoses;
	}

}
