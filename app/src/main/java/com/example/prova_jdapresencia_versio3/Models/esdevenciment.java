package com.example.prova_jdapresencia_versio3.Models;

public class esdevenciment {
    private String nombre;
    private String sala;
    private String organizador;
    private String aforo;
    private String precio;
    private String lugar;
    private String fecha;
    private String descripcion;

    public esdevenciment(){}

    public esdevenciment(String nombre,String sala, String organizador, String aforo, String precio, String lugar, String fecha, String descripcion) {
        this.nombre = nombre;
        this.sala = sala;
        this.organizador = organizador;
        this.aforo = aforo;
        this.precio =precio;
        this.lugar = lugar;
        this.fecha =fecha;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public String getAforo() {
        return aforo;
    }

    public void setAforo(String aforo) {
        this.aforo = aforo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}


