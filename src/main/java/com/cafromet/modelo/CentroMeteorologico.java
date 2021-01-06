package com.cafromet.modelo;
// Generated 6 ene. 2021 20:21:45 by Hibernate Tools 5.4.21.Final

import java.util.HashSet;
import java.util.Set;

/**
 * CentroMeteorologico generated by hbm2java
 */
public class CentroMeteorologico implements java.io.Serializable {

	private Integer idCentroMet;
	private Municipio municipio;
	private String nombre;
	private String direccion;
	private Double latitud;
	private Double longitud;
	private Set medicions = new HashSet(0);

	public CentroMeteorologico() {
	}

	public CentroMeteorologico(Municipio municipio, String nombre, String direccion, Double latitud, Double longitud,
			Set medicions) {
		this.municipio = municipio;
		this.nombre = nombre;
		this.direccion = direccion;
		this.latitud = latitud;
		this.longitud = longitud;
		this.medicions = medicions;
	}

	public Integer getIdCentroMet() {
		return this.idCentroMet;
	}

	public void setIdCentroMet(Integer idCentroMet) {
		this.idCentroMet = idCentroMet;
	}

	public Municipio getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Double getLatitud() {
		return this.latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return this.longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public Set getMedicions() {
		return this.medicions;
	}

	public void setMedicions(Set medicions) {
		this.medicions = medicions;
	}

}
