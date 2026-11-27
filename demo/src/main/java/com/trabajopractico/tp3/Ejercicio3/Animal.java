package com.trabajopractico.tp3.Ejercicio3;

public class Animal {
    private String nombre;
    private String fechaNacimiento;
    private Veterinario veterinario; // el veterinario de cabecera

    public Animal(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public void atender() {
        System.out.println("Animal: " + nombre + " | nacimiento: " + fechaNacimiento);
    }
}
