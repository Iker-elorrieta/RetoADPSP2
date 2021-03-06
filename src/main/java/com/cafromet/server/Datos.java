package com.cafromet.server;

import java.io.Serializable;

public class Datos implements Serializable {

    private static final long serialVersionUID = 1L;

    private String idConexion;
    private String contenido;
    private Peticiones peticion;
    private Object objeto;

    public Datos() {}

    public Datos(Peticiones peticion) {
        this.peticion = peticion;
    }

    public String getIdConexion() {
        return idConexion;
    }

    public void setIdConexion(String idConexion) {
        this.idConexion = idConexion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Peticiones getPeticion() {
        return this.peticion;
    }

    public void setPeticion(Peticiones peticion) {
        this.peticion = peticion;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}