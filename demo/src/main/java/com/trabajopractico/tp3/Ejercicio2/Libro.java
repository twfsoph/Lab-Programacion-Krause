package com.trabajopractico.tp3.Ejercicio2;

public class Libro {
    private String id;
    private String nombre;
    private Socio socio; // null = no esta prestado

    public Libro(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public void mostrar() {
        System.out.println("  Libro: " + nombre + " (id " + id + ")");
    }
}
