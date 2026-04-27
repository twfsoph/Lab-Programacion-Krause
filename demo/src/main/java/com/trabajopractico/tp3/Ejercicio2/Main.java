package main.java.com.trabajopractico.tp3.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Socio uan = new Socio("pepito", 1);
        Socio chu = new Socio("kira", 2);
        Socio tri = new Socio("milo", 3);

        Libro l1 = new Libro("1", "fsofgray");
        Libro l2 = new Libro("2", "el principito");
        Libro l3 = new Libro("3", "atdmv");
        Libro l4 = new Libro("4", "ranita");
        Libro l5 = new Libro("5", "nose");

        uan.agregarLibro(l1);
        uan.agregarLibro(l2);

        chu.agregarLibro(l3);
        chu.agregarLibro(l4);

        tri.agregarLibro(l5);
    }
}

import java.util.ArrayList; 
import java.util.List;

class Socio {
    private String nombre;
    private int id;
    private List<Libro> libros;

    public Socio(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro l) {
        libros.add(l);
    }
}

class Libro {
    private String id;
    private String nombre;

    public Libro(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
