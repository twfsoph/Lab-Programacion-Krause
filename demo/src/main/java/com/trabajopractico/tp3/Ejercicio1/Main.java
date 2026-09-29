package com.trabajopractico.tp3;

public class Main {
    public static void main(String[] args) {
    
        Herramientasmanual martillo = new Herramientasmanual(1, "Stanley", "madera");
        Herramientasmanual destornillador = new Herramientasmanual(2, "Bosch", "plástico");
        Herramientasmanual llave = new Herramientasmanual(3, "Metabo", "goma");
        Herramientaselectricas taladro = new Herramientaselectricas(4, "Makita", 220);
        Herramientaselectricas sierra = new Herramientaselectricas(5, "DeWalt", 220);

    }
}
