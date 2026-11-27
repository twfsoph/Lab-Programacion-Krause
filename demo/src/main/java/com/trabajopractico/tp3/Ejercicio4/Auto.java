package com.trabajopractico.tp3.Ejercicio4;

public class Auto extends Vehiculo {

    public Auto(String nombre, String marca, String patente) {
        super(nombre, marca, patente);
    }

    @Override
    public void mostrar() {
        System.out.println("  Auto: " + getNombre() + " | " + getMarca() + " | " + getPatente());
    }
}
