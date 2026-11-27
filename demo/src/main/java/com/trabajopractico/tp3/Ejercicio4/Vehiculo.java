package com.trabajopractico.tp3.Ejercicio4;

public abstract class Vehiculo {
    private String nombre;
    private String marca;
    private String patente;
    private Vendedor vendedor; // el vendedor de cabecera

    public Vehiculo(String nombre, String marca, String patente) {
        this.nombre = nombre;
        this.marca = marca;
        this.patente = patente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getPatente() {
        return patente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public abstract void mostrar();
}
