package com.cafromet.modelo;
// Generated 22 ene. 2021 19:54:49 by Hibernate Tools 5.4.21.Final

import java.util.Date;

/**
 * MedicionId generated by hbm2java
 */
public class MedicionId implements java.io.Serializable {

	private int idCentroMet;
	private Date fecha;
	private Date hora;

	public MedicionId() {
	}

	public MedicionId(int idCentroMet, Date fecha, Date hora) {
		this.idCentroMet = idCentroMet;
		this.fecha = fecha;
		this.hora = hora;
	}

	public int getIdCentroMet() {
		return this.idCentroMet;
	}

	public void setIdCentroMet(int idCentroMet) {
		this.idCentroMet = idCentroMet;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getHora() {
		return this.hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MedicionId))
			return false;
		MedicionId castOther = (MedicionId) other;

		return (this.getIdCentroMet() == castOther.getIdCentroMet())
				&& ((this.getFecha() == castOther.getFecha()) || (this.getFecha() != null
						&& castOther.getFecha() != null && this.getFecha().equals(castOther.getFecha())))
				&& ((this.getHora() == castOther.getHora()) || (this.getHora() != null && castOther.getHora() != null
						&& this.getHora().equals(castOther.getHora())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCentroMet();
		result = 37 * result + (getFecha() == null ? 0 : this.getFecha().hashCode());
		result = 37 * result + (getHora() == null ? 0 : this.getHora().hashCode());
		return result;
	}

}
