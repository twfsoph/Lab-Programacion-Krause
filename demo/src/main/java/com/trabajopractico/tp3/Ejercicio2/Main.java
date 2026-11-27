package com.trabajopractico.tp3.Ejercicio2;

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
        Libro l6 = new Libro("6", "momo");
        Libro l7 = new Libro("7", "el hobbit");

        uan.agregarLibro(l1);
        uan.agregarLibro(l2);
        uan.agregarLibro(l6);
        uan.agregarLibro(l7); // este no entra, el maximo es 3

        chu.agregarLibro(l3);
        chu.agregarLibro(l4);

        tri.agregarLibro(l5);
        tri.agregarLibro(l1); // este no entra, ya lo tiene pepito

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarSocio(uan);
        biblioteca.agregarSocio(chu);
        biblioteca.agregarSocio(tri);

        biblioteca.mostrarTodo();
    }
}
