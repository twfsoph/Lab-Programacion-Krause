package com.trabajopractico.tparraylist;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("5°2°");

        Estudiante e1 = new Estudiante("pepito", "45123456", 8.5);
        Estudiante e2 = new Estudiante("kira", "46789123", 9.2);
        Estudiante e3 = new Estudiante("milo", "44556677", 7.0);

        curso.inscribir(e1);
        curso.inscribir(e2);
        curso.inscribir(e3);

        System.out.println("Cantidad de alumnos: " + curso.cantidadAlumnos());

        curso.darDeBaja(1);
        System.out.println("Se dio de baja al segundo alumno");

        curso.darDeBaja(10); // esta posicion no existe

        curso.listarAlumnos();

        System.out.println("Cantidad final de alumnos: " + curso.cantidadAlumnos());
    }
}
