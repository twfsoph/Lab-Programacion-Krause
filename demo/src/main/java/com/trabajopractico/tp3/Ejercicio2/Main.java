package main.java.com.trabajopractico.tp3.Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Libro s = new Libro("1", "libro a");
        Libro n = new Libro("2", "libro b");
        Libro b = new Libro("3", "libro c");
        Libro m = new Libro("4", "libro d");
        Libro j = new Libro("5", "libro e");

        Socio uan = new Socio("pepito", 1);
        Socio chu = new Socio("kira", 2);
        Socio tri = new Socio("milo", 3);

        uan.agregarLibro(s);
        uan.agregarLibro(n);

        chu.agregarLibro(b);
        chu.agregarLibro(m);

        tri.agregarLibro(j);
    }
}

class Socio {
    String nombre;
    int id;

    Libro libro1;
    Libro libro2;
    Libro libro3;
    Libro libro4;
    Libro libro5;

    int contador = 0;

    public Socio(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public void agregarLibro(Libro libro) {
        if (contador == 0) {
            libro1 = libro;
        } else if (contador == 1) {
            libro2 = libro;
        } else if (contador == 2) {
            libro3 = libro;
        } else if (contador == 3) {
            libro4 = libro;
        } else if (contador == 4) {
            libro5 = libro;
        }
        contador++;
    }
}

class Libro {
    String id;
    String nombre;

    public Libro(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
