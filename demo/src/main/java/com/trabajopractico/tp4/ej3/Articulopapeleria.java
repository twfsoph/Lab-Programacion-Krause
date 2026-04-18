package com.trabajopractico.tp4.ej3;

    public class Articulopapeleria extends Producto {
    private String tipomaterial;

    public Articulopapeleria(String codigo, double precio, String tipomaterial) {
        super(codigo, precio);
        this.tipomaterial = tipomaterial;
    }
}