package com.trabajopractico.tp7.ej1;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> inventario = new ArrayList<Producto>();

    public void agregarProducto(Producto p) {
        inventario.add(p);
    }

    public void listarProductos() {
        System.out.println("LISTA DE PRODUCTOS EN INVENTARIO");
        for (Producto p : inventario) {
            System.out.println("Código:" + p.getCodigo() + " Producto:" + p.getNombre() + " Precio:" + p.getPrecio());
        }
    }

    public int obtenerCantidadProductos() {
        return inventario.size();
    }
}
