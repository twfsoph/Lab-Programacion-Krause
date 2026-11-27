package com.trabajopractico.tp3.Ejercicio4;

public class Main2 {
    public static void main(String[] args) {

        Vendedor uan = new Vendedor("sopia");
        Vendedor chu = new Vendedor("brune");
        Vendedor tri = new Vendedor("nache");

        Vehiculo v1 = new Auto("aute1", "Ford", "AB123CD");
        Vehiculo v2 = new Auto("aute2", "Ford", "AC456DE");
        Vehiculo v3 = new Auto("aute3", "Chevrolet", "AD789EF");
        Vehiculo v4 = new Auto("aute4", "Ferrari", "AE012FG");
        Vehiculo v5 = new Auto("aute5", "Fiat", "AF345GH");
        Vehiculo v6 = new Moto("aute6", "Yamaha", "123ABC");
        Vehiculo v7 = new Moto("aute7", "Honda", "456DEF");
        Vehiculo v8 = new Moto("aute8", "Honda", "789GHI");
        Vehiculo v9 = new Moto("aute9", "Suzuki", "012JKL");
        Vehiculo v10 = new Moto("aute10", "Ducati", "345MNO");

        uan.agregarVehiculo(v3);
        uan.mostrarVehiculosVendedor();
        uan.borrarVehiculo(v3);
        uan.mostrarVehiculosVendedor();
        uan.agregarVehiculo(v2);
        uan.agregarVehiculo(v1);

        chu.agregarVehiculo(v4);
        chu.agregarVehiculo(v5);
        chu.agregarVehiculo(v6);

        tri.agregarVehiculo(v7);
        tri.agregarVehiculo(v8);
        tri.agregarVehiculo(v9);
        chu.agregarVehiculo(v10);

        tri.agregarVehiculo(v1); // no entra, ya es de sopia

        uan.mostrarVehiculosVendedor();
        chu.mostrarVehiculosVendedor();
        tri.mostrarVehiculosVendedor();
    }
}
