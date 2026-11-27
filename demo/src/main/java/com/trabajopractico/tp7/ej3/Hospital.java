package com.trabajopractico.tp7.ej3;

import java.util.ArrayList;

public class Hospital {
    private ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();

    public void registrarPaciente(Paciente p) {
        listaPacientes.add(p);
    }

    public void listarPacientes() {
        System.out.println("--- LISTADO COMPLETO DE PACIENTES ---");
        for (Paciente p : listaPacientes) {
            String hospitalizadoTxt = p.isEstaHospitalizado() ? "SÍ" : "NO";
            System.out.println("DNI: " + p.getDni() + " | Nombre: " + p.getNombre() + 
                               " | Edad: " + p.getEdad() + " | Peso: " + p.getPeso() + "kg" +
                               " | Hospitalizado: " + hospitalizadoTxt);
        }
    }

    public int obtenerCantidadPacientes() {
        return listaPacientes.size();
    }
}
