package com.trabajopractico.tp7.ej4;

public class Main {
    public static void main(String[] args) {
        String[][] matriz = {
            // Argentina
            {"Emiliano Martinez", "Arquero", "33", "Aston Villa", "Argentina", "true"},
            {"Cristian Romero", "Defensor", "28", "Tottenham", "Argentina", "true"},
            {"Nicolas Otamendi", "Defensor", "38", "Benfica", "Argentina", "true"},
            {"Nahuel Molina", "Defensor", "28", "Atletico Madrid", "Argentina", "true"},
            {"Enzo Fernandez", "Mediocampista", "25", "Chelsea", "Argentina", "true"},
            {"Rodrigo De Paul", "Mediocampista", "32", "Inter Miami", "Argentina", "true"},
            {"Alexis Mac Allister", "Mediocampista", "27", "Liverpool", "Argentina", "true"},
            {"Lionel Messi", "Delantero", "39", "Inter Miami", "Argentina", "true"},
            {"Julian Alvarez", "Delantero", "26", "Atletico Madrid", "Argentina", "true"},
            {"Lautaro Martinez", "Delantero", "29", "Inter Milan", "Argentina", "true"},
            {"Paulo Dybala", "Delantero", "33", "Roma", "Argentina", "false"},
            // Francia
            {"Mike Maignan", "Arquero", "31", "Milan", "Francia", "true"},
            {"William Saliba", "Defensor", "25", "Arsenal", "Francia", "true"},
            {"Theo Hernandez", "Defensor", "29", "Milan", "Francia", "true"},
            {"Jules Kounde", "Defensor", "28", "Barcelona", "Francia", "true"},
            {"Aurelien Tchouameni", "Mediocampista", "26", "Real Madrid", "Francia", "true"},
            {"Eduardo Camavinga", "Mediocampista", "24", "Real Madrid", "Francia", "true"},
            {"Adrien Rabiot", "Mediocampista", "31", "Marseille", "Francia", "true"},
            {"Kylian Mbappe", "Delantero", "28", "Real Madrid", "Francia", "true"},
            {"Ousmane Dembele", "Delantero", "29", "PSG", "Francia", "true"},
            {"Marcus Thuram", "Delantero", "29", "Inter Milan", "Francia", "true"},
            {"Antoine Griezmann", "Delantero", "35", "Atletico Madrid", "Francia", "false"}
        };
        Jugador[] jugadores = new Jugador[matriz.length];
        Seleccion seleccion = new Seleccion();

        for (int i = 0; i < matriz.length; i++) {
            String nombre = matriz[i][0];
            String posicion = matriz[i][1];
            int edad = Integer.parseInt(matriz[i][2]);
            String club = matriz[i][3];
            String pais = matriz[i][4];
            boolean convocado = Boolean.parseBoolean(matriz[i][5]);

            jugadores[i] = new Jugador(nombre, posicion, edad, club, pais, convocado);
        }
        for (Jugador j : jugadores) {
            seleccion.agregarJugador(j);
        }
        System.out.println("                    GESTIÓN DEL PLANTEL - MUNDIAL                         ");

        seleccion.mostrarConvocados();
        System.out.println();
        seleccion.mostrarNoConvocados();

        seleccion.contarPorPosicion();
        seleccion.contarPorSeleccion();
        System.out.printf("Promedio de edad del plantel: %.2f años\n", seleccion.promedioEdad());

        System.out.println("Jugador más Joven: " + seleccion.jugadorMasJoven());
        System.out.println("Jugador más Veterano: " + seleccion.jugadorMasVeterano());

        seleccion.buscarPorPosicion("Arquero");
        seleccion.buscarPorEquipo("Real Madrid");
        seleccion.estaConvocado("Lionel Messi");
        seleccion.estaConvocado("Paulo Dybala");
        seleccion.eliminarJugador("Antoine Griezmann");
        seleccion.ordenarPorEdad();
    }
}
