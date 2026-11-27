package com.trabajopractico.tp3.Ejercicio1;

abstract class Herramientas {
    protected int codigo;
    protected String marca;

    public Herramientas(int codigo, String marca){
        this.codigo = codigo;
        this.marca = marca;
    }

    public void usar() {
        System.out.println("Usando la herramienta " + marca + " (codigo " + codigo + ")");
    }

    public void devolver() {
        System.out.println("Devolviendo la herramienta " + marca + " (codigo " + codigo + ")");
    }
}
