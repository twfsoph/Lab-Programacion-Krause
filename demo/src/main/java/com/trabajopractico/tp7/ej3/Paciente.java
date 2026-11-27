package com.trabajopractico.tp7.ej3;

public class Paciente {
    private String nombre;
    private String dni;
    private int edad;
    private double peso;
    private boolean estaHospitalizado;

    public Paciente(String nombre, String dni, int edad, double peso, boolean estaHospitalizado) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.estaHospitalizado = estaHospitalizado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isEstaHospitalizado() {
        return estaHospitalizado;
    }
}
