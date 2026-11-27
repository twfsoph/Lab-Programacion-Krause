package com.trabajopractico.tp3.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Veterinario {
    private String nombre;
    private List<Animal> animales;

    public Veterinario(String nombre) {
        this.nombre = nombre;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal a) {
        // cada animal tiene un solo veterinario de cabecera
        if (a.getVeterinario() != null) {
            System.out.println(a.getNombre() + " ya tiene veterinario, no lo puede atender " + nombre);
            return;
        }
        animales.add(a);
        a.setVeterinario(this);
    }

    public void atenderAnimales() {
        System.out.println("\nVeterinario: " + nombre);
        for (Animal a : animales) {
            a.atender();
        }
    }
}
