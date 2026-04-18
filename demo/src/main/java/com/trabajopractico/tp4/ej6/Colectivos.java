package main.java.com.trabajopractico.tp4.ej6;

public class colectivos extends Unidades {
    private int numerolinea;

    public colectivos(String id_interno, int capacidadpasajeros, int numerolinea) {
        super(id_interno, capacidadpasajeros);
        this.numerolinea = numerolinea;
    }

    public void arrancar() {
    }

    public void frenar() {}
    }
