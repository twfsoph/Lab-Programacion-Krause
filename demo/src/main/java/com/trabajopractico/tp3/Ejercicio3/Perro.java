package com.trabajopractico.tp3.Ejercicio3;

public class Perro extends Animal {

    public Perro(String nombre, String fechaNacimiento) {
        super(nombre, fechaNacimiento);
    }

    public void ladrar() {
        System.out.println("  " + getNombre() + " dice: guau!");
    }

    @Override
    public void atender() {
        super.atender();
        ladrar();
    }
}
