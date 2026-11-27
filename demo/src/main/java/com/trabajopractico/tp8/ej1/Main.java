package com.trabajopractico.tp8.ej1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mundial mundial = new Mundial();
        Scanner scanner = new Scanner(System.in);
        
        DirectorTecnico dt1 = new DirectorTecnico("Lionel Scaloni", 48);

        try {
            Seleccion s1 = new Seleccion("Argentina", "América", 3, 26, "Clasificado", dt1);
            mundial.agregarSeleccion(s1);
            System.out.println("Selección creada: " + s1.getNombre());

            Seleccion s2 = new Seleccion("Camerún", "África", 1, 8, "Fase de Grupos", null); // Sin DT
            mundial.agregarSeleccion(s2);
            System.out.println("Selección creada: " + s2.getNombre());

            System.out.println("\nRegistrando selección con 30 convocados:");
            Seleccion s3 = new Seleccion("Francia", "Europa", 0, 30, "Clasificado", null);
            mundial.agregarSeleccion(s3);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada al registrar: " + e.getMessage());
        }

        System.out.println("\nConsultando posición válida (0):");
        mundial.consultarSeleccionPorPosicion(0);

        System.out.println("\nConsultando posición inválida (5):");
        mundial.consultarSeleccionPorPosicion(5);

        System.out.println("\nIngrese los nuevos puntos para la selección en la posición 0 (Argentina):");
        String entradaPuntos = scanner.nextLine();
        mundial.actualizarPuntosSeleccion(0, entradaPuntos);
        
        System.out.println("\nConsultando DT de Argentina (Tiene DT):");
        mundial.consultarDirectorTecnico(0);

        System.out.println("\nConsultando DT de Camerún (No tiene DT asignado):");
        mundial.consultarDirectorTecnico(1);

        System.out.println("\nIntentando disputar partido con Argentina (26 convocados):");
        try {
            Seleccion arg = mundial.getSeleccion(0);
            if (arg != null) {
                arg.disputarPartido();
            }
        } catch (JugadoresInsuficientesException e) {
            System.out.println("Excepción capturada en Main: " + e.getMessage());
        }

        System.out.println("\nIntentando disputar partido con Camerún (8 convocados):");
        try {
            Seleccion camerun = mundial.getSeleccion(1);
            if (camerun != null) {
                camerun.disputarPartido();
            }
        } catch (JugadoresInsuficientesException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        } finally {
            System.out.println("terminado.");
        }

        scanner.close();
    }
}
