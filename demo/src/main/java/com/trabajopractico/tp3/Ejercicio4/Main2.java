package main.java.com.trabajopractico.tp3.Ejercicio4;

public class Main2 {
    public static void main(String[] args) {

        Vendedor uan = new Vendedor("sopia");
        Vendedor chu = new Vendedor("brune");
        Vendedor tri = new Vendedor("nache");

        Vehiculo v1 = new Vehiculo("aute1");
        Vehiculo v2 = new Vehiculo("aute2");
        Vehiculo v3 = new Vehiculo("aute3");
        Vehiculo v4 = new Vehiculo("aute4");
        Vehiculo v5 = new Vehiculo("aute5");
        Vehiculo v6 = new Vehiculo("aute6");
        Vehiculo v7 = new Vehiculo("aute7");
        Vehiculo v8 = new Vehiculo("aute8");
        Vehiculo v9 = new Vehiculo("aute9");
        Vehiculo v10 = new Vehiculo("aute10");

        uan.vehiculo1 = v1;
        uan.vehiculo2 = v2;

        chu.vehiculo1 = v3;
        chu.vehiculo2 = v4;

        tri.vehiculo1 = v5;
        tri.vehiculo2 = v6;
        tri.vehiculo3 = v7;
    }
}

class Vendedor {
    String nombre;

    Vehiculo vehiculo1;
    Vehiculo vehiculo2;
    Vehiculo vehiculo3;
    Vehiculo vehiculo4;

    public Vendedor(String nombre) {
        this.nombre = nombre;
    }
}

class Vehiculo {
    String nombre;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }
}
