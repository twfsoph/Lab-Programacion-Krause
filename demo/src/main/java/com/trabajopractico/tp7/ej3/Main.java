package com.trabajopractico.tp7.ej3;

public class Main {
    public static void main(String[] args) {
        String[][] matriz = {
            {"Aaron", "40111222", "22", "72.5", "true"},
            {"Samuel", "47999111", "19", "58.0", "false"},
            {"Valentino", "56222333", "12", "81.3", "true"},
            {"Sasha ", "48888777", "19", "64.7", "false"},
            {"Jazmin", "50000555", "17", "90.1", "true"},
            {"Sophia ", "96777111", "17", "55.9", "false"},
            {"Octavio", "51333999", "17", "70.4", "true"},
            {"Julieta", "36666444", "15", "62.2", "false"},
            {"Benjamin", "38555111", "35", "85.0", "true"},
            {"Daniel", "50111999", "17", "59.6", "false"},
            {"Kim", "51888222", "16", "77.8", "true"},
            {"Eric", "51222666", "16", "54.3", "false"},
            {"Benito", "51999444", "16", "88.5", "true"},
            {"Gustavo", "26444777", "43", "61.1", "false"},
            {"Jose", "23777888", "54", "92.4", "true"}
        };

        Paciente[] pacientes = new Paciente[matriz.length];
        
        Hospital hospital = new Hospital();

        for (int i = 0; i < matriz.length; i++) {
            String nombre = matriz[i][0];
            String dni = matriz[i][1];
            int edad = Integer.parseInt(matriz[i][2]);
            double peso = Double.parseDouble(matriz[i][3]);
            boolean hospitalizado = Boolean.parseBoolean(matriz[i][4]);

            pacientes[i] = new Paciente(nombre, dni, edad, peso, hospitalizado);
        }

        for (Paciente p : pacientes) {
            hospital.registrarPaciente(p);
        }

        hospital.listarPacientes();
        System.out.println("Cantidad total de pacientes registrados: " + hospital.obtenerCantidadPacientes());

        informarPacienteIndice(pacientes, 4);
        informarPacienteIndice(pacientes, 12);
    }
    public static void informarPacienteIndice(Paciente[] arreglo, int indice) {
        if (indice >= 0 && indice < arreglo.length) {
            Paciente p = arreglo[indice];
            String hosp = p.isEstaHospitalizado() ? "se encuentra hospitalizado/a" : "no está hospitalizado/a";
            System.out.println("Paciente del índice (" + indice + "): " + p.getNombre() + 
                               " | Edad: " + p.getEdad() + " años | Estado: " + hosp + ".");
        }
    }
}
