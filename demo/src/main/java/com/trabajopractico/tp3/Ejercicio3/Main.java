package com.trabajopractico.tp3.Ejercicio3;

public class Main {
    public static void main(String[] args) {

        Animal comun = new Animal("Kira", "2019");

        Veterinario uan = new Veterinario("doctora juguetes");
        Veterinario chu = new Veterinario("barbie");
        Veterinario tri = new Veterinario("moana");

        uan.agregarAnimal(comun);
        uan.agregarAnimal(new Perro("kira", "2022"));
        uan.agregarAnimal(new Gato("milo", "2021"));

        chu.agregarAnimal(new Perro("harry", "2020"));
        chu.agregarAnimal(new Gato("ozzie", "2023"));

        tri.agregarAnimal(new Perro("cuasimodo", "2018"));
        tri.agregarAnimal(new Gato("flander", "2024"));
        tri.agregarAnimal(comun); // no entra, ya es de la doctora juguetes

        uan.atenderAnimales();
        chu.atenderAnimales();
        tri.atenderAnimales();
    }
}
