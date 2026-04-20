package main.java.com.trabajopractico.tp3.Ejercicio4;

public class Main2 {
    public static void main(String[] args) {

        Vendedor uan = new Vendedor("sopia");
        Vendedor chu = new Vendedor("brune");
        Vendedor tri = new Vendedor("nache");

        uan.vehiculos[0] = "aute1";
        uan.vehiculos[1] = "aute2";
        chu.vehiculos[2] = "aute3";
        chu.vehiculos[3] = "aute4";

        tri.vehiculos[0] = "aute5";
        tri.vehiculos[1] = "aute6";
        tri.vehiculos[2] = "aute7";

        tri.vehiculos[0] = "aute8";
        tri.vehiculos[1] = "aute9";
        tri.vehiculos[2] = "aute10";
    }
}

class Vendedor {
    String nombre;
    String[] vehiculos = new String[4];

    public Vendedor(String nombre) {
        this.nombre = nombre;
    }
}