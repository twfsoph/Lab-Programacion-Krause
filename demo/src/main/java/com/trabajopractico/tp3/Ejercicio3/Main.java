package main.java.com.trabajopractico.tp3.Ejercicio3;

public class Main {
    public static void main(String[] args) {

        Animal comun = new Animal("Kira");

        Veterinario uan = new Veterinario("doctora juguetes");
        Veterinario chu = new Veterinario("barbie");
        Veterinario tri = new Veterinario("moana");

        uan.animales[0] = comun;
        uan.animales[1] = new Animal("kira");
        uan.animales[2] = new Animal("milo");

        chu.animales[0] = comun;
        chu.animales[1] = new Animal("harry");
        chu.animales[2] = new Animal("ozzie");

        tri.animales[0] = comun;
        tri.animales[1] = new Animal("cuasimodo");
        tri.animales[2] = new Animal("flander");
    }
}

class Veterinario {
    String nombre;
    Animal[] animales = new Animal[3];

    public Veterinario(String nombre) {
        this.nombre = nombre;
    }
}

class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
}