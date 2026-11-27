package com.trabajopractico.tp3.Ejercicio3;

public class Gato extends Animal {

    public Gato(String nombre, String fechaNacimiento) {
        super(nombre, fechaNacimiento);
    }

    public void maullar() {
        System.out.println("  " + getNombre() + " dice: miau!");
    }

    @Override
    public void atender() {
        super.atender();
        maullar();
    }
}
