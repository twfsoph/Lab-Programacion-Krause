package com.trabajopractico.tp4.ej6;

public abstract class Unidades {
    protected String id_interno;
    protected int capacidadpasajeros;

    public Unidades(String id_interno, int capacidadpasajeros) {
        this.id_interno = id_interno;
        this.capacidadpasajeros = capacidadpasajeros;
    }

    public abstract void arrancar();
    public abstract void frenar();
}