package com.trabajopractico.tp3;

public class Herramientaselectricas extends Herramientas {

    private int voltaje;

    public Herramientaselectricas(int codigo, String marca, int voltaje) {
        super(codigo, marca);
        this.voltaje = voltaje;

    }
    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }
    public int getVoltaje() {
        return voltaje;
    }

}
 