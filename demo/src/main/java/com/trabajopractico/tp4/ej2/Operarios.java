package main.java.com.trabajopractico.tp4.ej2;

public class Operarios extends Empleados {
    private double valorhoraextra;

    public Operarios(int legajo, double sueldoBase, double valorhoraextra) {
        super(legajo, sueldoBase);
        this.valorhoraextra = valorhoraextra;
    }
}