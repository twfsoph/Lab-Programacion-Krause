package com.trabajopractico.tp3.Ejercicio4;

public class Moto extends Vehiculo {

    public Moto(String nombre, String marca, String patente) {
        super(nombre, marca, patente);
    }

    @Override
    public void mostrar() {
        System.out.println("  Moto: " + getNombre() + " | " + getMarca() + " | " + getPatente());
    }
}
