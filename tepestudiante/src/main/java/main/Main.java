package main;

import java.util.List;

import Model.Estudiante;
import Service.EstudianteService;

public class Main {

    public static void main(String[] args) {
        EstudianteService service = new EstudianteService();

        service.registrar("Sophia", "Uribe", 31584726, "5° 1°");
        service.registrar("Ludmila", "Rebequi", 29843617, "4° 3°");
        service.registrar("Nissa", "Bonelli", 32791584, "6° 2°");
        service.registrar("Ignacio", "Perez", 30176429, "4° 1°");
        service.registrar("Bruno", "Aguilo", 28953176, "5° 3°");
        service.registrar("Junior", "Lavado", 33421895, "6° 1°");
        service.registrar("Luisana", "Martinez", 27645931, "5° 2°");
        service.registrar("Kira", "Perrite", 31872546, "6° 3°");
        service.registrar("Milo", "Gatite", 29163857, "4° 2°");
        service.registrar("Simba", "Gatite", 32547183, "4° 3°");

        System.out.println("\n--- Listado completo ---");
        listar(service);

        System.out.println("\n--- Eliminando id 4 ---");
        service.eliminar(4);

        System.out.println("\n--- Actualizando id 6 ---");
        service.actualizar(6, "Junior", "Lavado", 33421895, "5° 1°");

        System.out.println("\n--- Actualizando id 8 ---");
        service.actualizar(8, "Kira", "Perrite", 31872546, "6° 1°");

        System.out.println("\n--- Listado luego de los cambios ---");
        listar(service);
    }

    private static void listar(EstudianteService service) {
        List<Estudiante> estudiantes = service.listarTodo();
        for (Estudiante e : estudiantes) {
            System.out.println(e.getId() + " - " + e.getNombre() + " " + e.getApellido()
                    + " - DNI: " + e.getDni() + " - Curso: " + e.getCurso());
        }
    }
}