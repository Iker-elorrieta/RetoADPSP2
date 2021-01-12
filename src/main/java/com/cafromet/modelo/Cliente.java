package com.cafromet.modelo;
// Generated 11 ene. 2021 18:47:26 by Hibernate Tools 5.4.21.Final

/**
 * Cliente generated by hbm2java
 */
public class Cliente implements java.io.Serializable {

	private Integer idCliente;
	private String usuario;
	private String passwd;

	public Cliente() {
	}

	public Cliente(String usuario, String passwd) {
		this.usuario = usuario;
		this.passwd = passwd;
	}

	public Integer getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public boolean isNull(Cliente cliente) {
		
		if(cliente.getUsuario() == null)
			return true;
		return false;
	}

	public boolean isNull(Cliente cliente) {
		if (cliente.getUsuario() == null || cliente.getPasswd() == null)
			return true;
		return false;
	}

}