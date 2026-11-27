package com.trabajopractico.tp9;

public class Cantante implements Contratable {
 private String nombre;
 private String generoMusical;
 private int cachet;
 private int cantidadCanciones;
 private String manager;

 public Cantante(String nombre, String generoMusical, int cachet, int cantidadCanciones, String manager) {
     this.nombre = nombre;
     this.generoMusical = generoMusical;
     this.cachet = cachet;
     this.cantidadCanciones = cantidadCanciones;
     this.manager = manager;
 }

 public String getNombre() { return nombre; }
 public int getCantidadCanciones() { return cantidadCanciones; }
 public String getManager() { return manager; }

 @Override
 public void liquidarHonorarios(double impuestos) throws IllegalArgumentException {
     if (impuestos < 0 || impuestos > 100) {
         throw new IllegalArgumentException("El porcentaje de impuestos debe estar entre 0% y 100%.");
     }
     double totalDescontado = this.cachet * (impuestos / 100);
     double neto = this.cachet - totalDescontado;
     System.out.println(" Honorarios de " + nombre + ": Neto a pagar $" + neto + " Impuestos: " + impuestos + "%");
 }

 @Override
 public void asignarEscenario(String nombreEscenario) throws NullPointerException {
     if (nombreEscenario == null) {
         throw new NullPointerException("El escenario asignado no puede ser nulo.");
     }
     System.out.println(" " + nombre + " asignado al escenario: " + nombreEscenario);
 }
}
