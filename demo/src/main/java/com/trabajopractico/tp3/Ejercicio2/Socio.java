package com.trabajopractico.tp3.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Socio {
    private String nombre;
    private int id;
    private List<Libro> libros;

    public Socio(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarLibro(Libro l) {
        // un libro solo puede estar en manos de un socio
        if (l.getSocio() != null) {
            System.out.println(nombre + ": el libro " + l.getNombre() + " ya esta prestado");
            return;
        }
        // un socio puede tener hasta 3 libros
        if (libros.size() >= 3) {
            System.out.println(nombre + " ya tiene 3 libros, no puede llevarse " + l.getNombre());
            return;
        }
        libros.add(l);
        l.setSocio(this);
    }

    public void mostrarSocio() {
        System.out.println("\nSocio: " + nombre + " (nro " + id + ")");
        for (Libro l : libros) {
            l.mostrar();
        }
    }
}
