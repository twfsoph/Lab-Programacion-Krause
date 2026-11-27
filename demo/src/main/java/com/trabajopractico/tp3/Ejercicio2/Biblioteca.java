package com.trabajopractico.tp3.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Socio> socios;

    public Biblioteca() {
        this.socios = new ArrayList<>();
    }

    public void agregarSocio(Socio s) {
        socios.add(s);
    }

    public void mostrarTodo() {
        for (Socio s : socios) {
            s.mostrarSocio();
        }
    }
}
