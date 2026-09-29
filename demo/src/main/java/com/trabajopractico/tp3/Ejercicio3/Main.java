package main.java.com.trabajopractico.tp3.Ejercicio3;



public class Main {
    public static void main(String[] args) {

        Animal comun = new Animal("Kira");

        Veterinario uan = new Veterinario("doctora juguetes");
        Veterinario chu = new Veterinario("barbie");
        Veterinario tri = new Veterinario("moana");

        uan.agregarAnimal(comun);
        uan.agregarAnimal(new Animal("kira"));
        uan.agregarAnimal(new Animal("milo"));

        chu.agregarAnimal(comun);
        chu.agregarAnimal(new Animal("harry"));
        chu.agregarAnimal(new Animal("ozzie"));

        tri.agregarAnimal(comun);
        tri.agregarAnimal(new Animal("cuasimodo"));
        tri.agregarAnimal(new Animal("flander"));
    }
}

import java.util.ArrayList;
import java.util.List;

class Veterinario {
    String nombre;
    List<Animal> animales;

    public Veterinario(String nombre) {
        this.nombre = nombre;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal a) {
        animales.add(a);
    }
}

class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
}
