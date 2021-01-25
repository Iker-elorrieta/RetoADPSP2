package com.cafromet.modelodto;
// Generated 22 ene. 2021 19:54:49 by Hibernate Tools 5.4.21.Final

import java.util.HashSet;
import java.util.Set;

import com.cafromet.modelo.EspacioNatural;

/**
 * EspacioNatural generated by hbm2java
 */
public class EspacioNaturalDTO implements java.io.Serializable {

    private Integer idEspacio;
    private String nombre;
    private String descripcion;
    private String tipo;
    private String categoria;
    private Double latitud;
    private Double longitud;
    private Set favoritoses = new HashSet(0);


    public EspacioNaturalDTO() {
    }

    public EspacioNaturalDTO(String nombre, String descripcion, String tipo, String categoria, Double latitud,
                             Double longitud, Set favoritoses, Set fotoses, Set municipio_EspacioNaturals) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.categoria = categoria;
        this.latitud = latitud;
        this.longitud = longitud;
        this.favoritoses = favoritoses;

    }
    public EspacioNaturalDTO(EspacioNatural espacioNatural) {

        this.idEspacio = espacioNatural.getIdEspacio();
        this.nombre = espacioNatural.getNombre();
        this.descripcion = espacioNatural.getDescripcion();
        this.tipo = espacioNatural.getTipo();
        this.categoria = espacioNatural.getCategoria();
        this.latitud = espacioNatural.getLatitud();
        this.longitud = espacioNatural.getLongitud();

    }

    public Integer getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(Integer idEspacio) {
        this.idEspacio = idEspacio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Set getFavoritoses() {
        return favoritoses;
    }

    public void setFavoritoses(Set favoritoses) {
        this.favoritoses = favoritoses;
    }



}
