package com.trabajopractico.tp3.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    private String nombre;
    private List<Vehiculo> vehiculos;

    public Vendedor(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v){
        // cada vehiculo tiene un solo vendedor de cabecera
        if (v.getVendedor() != null) {
            System.out.println(v.getNombre() + " ya tiene vendedor, no lo puede vender " + nombre);
            return;
        }
        vehiculos.add(v);
        v.setVendedor(this);
    }

    public void borrarVehiculo(Vehiculo v){
        if (vehiculos.remove(v)) {
            v.setVendedor(null);
        }
    }

    public void mostrarVehiculosVendedor() {
        System.out.println("\nVendedor: " + nombre);
        if (vehiculos.isEmpty()) {
            System.out.println("  (no tiene vehiculos)");
        }
        for (Vehiculo v : vehiculos) {
            v.mostrar();
        }
    }
}
