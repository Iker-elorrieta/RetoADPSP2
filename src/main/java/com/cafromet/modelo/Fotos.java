package com.cafromet.modelo;
// Generated 22 ene. 2021 19:54:49 by Hibernate Tools 5.4.21.Final

/**
 * Fotos generated by hbm2java
 */
public class Fotos implements java.io.Serializable {

	private Integer idFoto;
	private Cliente cliente;
	private EspacioNatural espacioNatural;

	public Fotos() {
	}

	public Fotos(Cliente cliente, EspacioNatural espacioNatural) {
		this.cliente = cliente;
		this.espacioNatural = espacioNatural;
	}

	public Integer getIdFoto() {
		return this.idFoto;
	}

	public void setIdFoto(Integer idFoto) {
		this.idFoto = idFoto;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public EspacioNatural getEspacioNatural() {
		return this.espacioNatural;
	}

	public void setEspacioNatural(EspacioNatural espacioNatural) {
		this.espacioNatural = espacioNatural;
	}

}
