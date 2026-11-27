package com.trabajopractico.tparraylist;

import java.util.ArrayList;

public class Curso {
    private String nombre;
    private ArrayList<Estudiante> alumnos;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    public void inscribir(Estudiante e) {
        alumnos.add(e);
    }

    public void darDeBaja(int indice) {
        if (indice >= 0 && indice < alumnos.size()) {
            alumnos.remove(indice);
        } else {
            System.out.println("No hay ningun alumno en la posicion " + indice);
        }
    }

    public void listarAlumnos() {
        System.out.println("Lista de alumnos del curso " + nombre + ":");
        for (Estudiante e : alumnos) {
            e.mostrarFicha();
        }
    }

    public int cantidadAlumnos() {
        return alumnos.size();
    }
}
