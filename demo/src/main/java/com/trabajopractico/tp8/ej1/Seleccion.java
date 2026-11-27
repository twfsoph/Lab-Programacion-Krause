package com.trabajopractico.tp8.ej1;

public class Seleccion {
    private String nombre;
    private String continente;
    private int puntos;
    private int convocados;
    private String estadoClasificacion;
    private DirectorTecnico dt;

    public Seleccion(String nombre, String continente, int puntos, int convocados, String estadoClasificacion, DirectorTecnico dt) throws IllegalArgumentException {
        this.nombre = nombre;
        this.continente = continente;
        this.puntos = puntos;
        validarConvocados(convocados); 
        this.convocados = convocados;
        this.estadoClasificacion = estadoClasificacion;
        this.dt = dt;
    }

    private void validarConvocados(int convocados) {
        if (convocados < 1 || convocados > 26) {
            throw new IllegalArgumentException("Error: La cantidad de convocados para " + nombre + " debe estar entre 1 y 26 (Ingresado: " + convocados + ").");
        }
    }

    public void disputarPartido() throws JugadoresInsuficientesException {
        if (this.convocados < 11) {
            throw new JugadoresInsuficientesException("La selección de " + nombre + " no puede jugar: Solo tiene " + convocados + " jugadores (mínimo requerido: 11).");
        }
        System.out.println(""+ nombre + " puede disputar sus partidos");
    }

    public String getNombre() { return nombre; }
    public String getContinente() { return continente; }
    public int getPuntos() { return puntos; }
    public void setPuntos(int puntos) { this.puntos = puntos; }
    public int getConvocados() { return convocados; }
    public String getEstadoClasificacion() { return estadoClasificacion; }
    public DirectorTecnico getDt() { return dt; }

    @Override
    public String toString() {
        return "Selección: " + nombre + " Continente: " + continente + " Puntos: " + puntos + " Convocados: " + convocados + " Estado: " + estadoClasificacion;
    }
}
