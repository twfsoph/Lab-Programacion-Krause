package main.java.com.trabajopractico.tp4.ej2;

public class Gerente extends Empleados {
    private double bonoresponsabilidad;

    public Gerente (int legajo, double sueldoBase, double bonoresponsabilidad) {
        super(legajo, sueldoBase);
        this.bonoresponsabilidad = bonoresponsabilidad;
    }
}