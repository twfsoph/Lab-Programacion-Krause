package com.trabajopractico.tp7.ej1;

public class Main {
    public static void main(String[] args) {
        String[][] matriz = {
            {"Mouse inalámbrico Logitech M185", "M101", "18500"},
            {"Teclado mecánico Redragon K552", "TE102", "54900"},
            {"Monitor Samsung 24\" Full HD", "MO103", "248000"},
            {"Auriculares HyperX Cloud Stinger", "A104", "89500"},
            {"Teclado inalámbrico Logitech MK270", "TE105", "41200"},
            {"Mouse gamer Redragon M607", "M106", "27800"},
            {"Disco SSD Kingston 480 GB", "D101", "87000"},
            {"Disco SSD NVMe Samsung 1 TB", "D102", "189000"},
            {"Pendrive Kingston 64 GB USB 3.0", "P103", "12400"},
            {"Disco rígido Seagate 1 TB 3.5\"", "D104", "54000"},
            {"Webcam Logitech C920 Full HD", "CAM101", "118000"}
        };

        Producto[] productos = new Producto[matriz.length];
        
        Inventario inventario = new Inventario();

        for (int i = 0; i < matriz.length; i++) {
            String nombre = matriz[i][0];
            String codigo = matriz[i][1];
            int precio = Integer.parseInt(matriz[i][2]);

            productos[i] = new Producto(nombre, codigo, precio);
        }

        for(Producto p : productos) {
            inventario.agregarProducto(p);
        }

        inventario.listarProductos();
        System.out.println("Cantidad total de productos: " + inventario.obtenerCantidadProductos());
    }
}
