package com.trabajopractico.tp8.ej1;

public class DirectorTecnico {
    private String nombre;
    private int edad;

    public DirectorTecnico(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Director Técnico: " + nombre + " (Edad: " + edad + ")";
    }
}
