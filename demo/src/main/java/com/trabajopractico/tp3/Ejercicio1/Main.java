package com.trabajopractico.tp3.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Herramientasmanual martillo = new Herramientasmanual(1, "Stanley", "madera");
        Herramientasmanual destornillador = new Herramientasmanual(2, "Bosch", "plástico");
        Herramientasmanual llave = new Herramientasmanual(3, "Metabo", "goma");
        Herramientaselectricas taladro = new Herramientaselectricas(4, "Makita", 220);
        Herramientaselectricas sierra = new Herramientaselectricas(5, "DeWalt", 220);

        // todas se usan y se devuelven
        Herramientas[] herramientas = {martillo, destornillador, llave, taladro, sierra};
        for (int i = 0; i < herramientas.length; i++) {
            System.out.println("\nHERRAMIENTA " + (i + 1));
            herramientas[i].usar();
            herramientas[i].devolver();
        }

        // solo las electricas se conectan
        System.out.println();
        taladro.conectar();
        sierra.conectar();

        System.out.println("\nEmpuñadura del martillo: " + martillo.getTipoEmpuñadura());
    }
}
