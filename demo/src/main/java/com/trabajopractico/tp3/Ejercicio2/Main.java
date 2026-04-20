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
