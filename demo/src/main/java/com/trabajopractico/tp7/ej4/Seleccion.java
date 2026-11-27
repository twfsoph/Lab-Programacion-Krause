package com.trabajopractico.tp7.ej4;

import java.util.ArrayList;

public class Seleccion {
    private ArrayList<Jugador> plantel = new ArrayList<Jugador>();

    public void agregarJugador(Jugador j) {
        plantel.add(j);
    }
    public void eliminarJugador(String nombre) {
        Jugador aEliminar = null;
        for (Jugador j : plantel) {
            if (j.getNombreCompleto().equalsIgnoreCase(nombre)) {
                aEliminar = j;
                break;
            }
        }
        if (aEliminar != null) {
            plantel.remove(aEliminar);
            System.out.println("Jugador " + nombre + " eliminado correctamente.");
        } else {
            System.out.println("No se encontró al jugador: " + nombre);
        }
    }
    public void buscarPorPosicion(String posicion) {
        System.out.println("--- Jugadores en la posición: " + posicion + " ---");
        for (Jugador j : plantel) {
            if (j.getPosicion().equalsIgnoreCase(posicion)) {
                System.out.println(j);
            }
        }
    }
    public void mostrarConvocados() {
        System.out.println("--- JUGADORES CONVOCADOS ---");
        for (Jugador j : plantel) {
            if (j.isEstaConvocado()) {
                System.out.println(j);
            }
        }
    }
    
    public void mostrarNoConvocados() {
        System.out.println("--- JUGADORES NO CONVOCADOS ---");
        for (Jugador j : plantel) {
            if (!j.isEstaConvocado()) {
                System.out.println(j);
            }
        }
    }

    public void contarPorSeleccion() {
        int argentina = 0;
        int francia = 0;
        for (Jugador j : plantel) {
            if (j.getSeleccion().equalsIgnoreCase("Argentina")) {
                argentina++;
            } else if (j.getSeleccion().equalsIgnoreCase("Francia")) {
                francia++;
            }
        }
        System.out.println("--- Cantidad de Jugadores por Selección ---");
        System.out.println("Argentina: " + argentina + " jugadores | Francia: " + francia + " jugadores");
    }

    public Jugador jugadorMasJoven() {
        if (plantel.size() == 0) return null;
        Jugador joven = plantel.get(0);
        for (Jugador j : plantel) {
            if (j.getEdad() < joven.getEdad()) {
                joven = j;
            }
        }
        return joven;
    }
    public Jugador jugadorMasVeterano() {
        if (plantel.size() == 0) return null;
        Jugador veterano = plantel.get(0);
        for (Jugador j : plantel) {
            if (j.getEdad() > veterano.getEdad()) {
                veterano = j;
            }
        }
        return veterano;
    }
    public void buscarPorEquipo(String club) {
        System.out.println("--- Jugadores que juegan en: " + club + " ---");
        for (Jugador j : plantel) {
            if (j.getClubActual().equalsIgnoreCase(club)) {
                System.out.println(j);
            }
        }
    }
    public void ordenarPorEdad() {
        int n = plantel.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (plantel.get(j).getEdad() > plantel.get(j + 1).getEdad()) {
                    Jugador temp = plantel.get(j);
                    plantel.set(j, plantel.get(j + 1));
                    plantel.set(j + 1, temp);
                }
            }
        }
        System.out.println("--- Plantel ordenado por edad (Menor a Mayor) ---");
        for (Jugador j : plantel) {
            System.out.println(j);
        }
    }
    public void contarPorPosicion() {
        int arq = 0, def = 0, med = 0, del = 0;
        for (Jugador j : plantel) {
            switch (j.getPosicion().toLowerCase()) {
                case "arquero": arq++; break;
                case "defensor": def++; break;
                case "mediocampista": med++; break;
                case "delantero": del++; break;
            }
        }
        System.out.println("--- Cantidad por Posición ---");
        System.out.println("Arqueros: " + arq + " | Defensores: " + def + " | Mediocampistas: " + med + " | Delanteros: " + del);
    }
    public void estaConvocado(String nombre) {
        boolean encontrado = false;
        for (Jugador j : plantel) {
            if (j.getNombreCompleto().equalsIgnoreCase(nombre)) {
                encontrado = true;
                if (j.isEstaConvocado()) {
                    System.out.println(nombre + " SÍ figura como convocado.");
                } else {
                    System.out.println(nombre + " NO figura como convocado.");
                }
                break;
            }
        }
        if (!encontrado) System.out.println(nombre + " no se encuentra en el plantel.");
    }

    public double promedioEdad() {
        if (plantel.size() == 0) return 0;
        int sumaEdades = 0;
        for (Jugador j : plantel) {
            sumaEdades += j.getEdad();
        }
        return (double) sumaEdades / plantel.size();
    }
}
