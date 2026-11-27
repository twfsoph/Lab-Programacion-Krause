package com.trabajopractico.tp7.ej4;

public class Jugador {
    private String nombreCompleto;
    private String posicion;
    private int edad;
    private String clubActual;
    private String seleccion;
    private boolean estaConvocado;

    public Jugador(String nombreCompleto, String posicion, int edad, String clubActual, String seleccion, boolean estaConvocado) {
        this.nombreCompleto = nombreCompleto;
        this.posicion = posicion;
        this.edad = edad;
        this.clubActual = clubActual;
        this.seleccion = seleccion;
        this.estaConvocado = estaConvocado;
    }
    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public String getPosicion() { return posicion; }
    public void setPosicion(String posicion) { this.posicion = posicion; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getClubActual() { return clubActual; }
    public void setClubActual(String clubActual) { this.clubActual = clubActual; }

    public String getSeleccion() { return seleccion; }
    public void setSeleccion(String seleccion) { this.seleccion = seleccion; }

    public boolean isEstaConvocado() { return estaConvocado; }
    public void setEstaConvocado(boolean estaConvocado) { this.estaConvocado = estaConvocado; }

    @Override
    public String toString() {
        String convocadoTxt = estaConvocado ? "Convocado" : "No Convocado";
        return "Jugador: " + nombreCompleto + " | Posición: " + posicion + " | Edad: " + edad + " | Club: " + clubActual + " | Selección: " + seleccion + " | Estado: " + convocadoTxt;
    }
}
