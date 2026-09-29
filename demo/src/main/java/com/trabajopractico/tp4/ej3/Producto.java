package main.java.com.trabajopractico.tp4.ej3;  

public abstract class Producto {
    protected String codigo;
    private double precio;

    public Producto(String codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public abstract double preciototal();
}