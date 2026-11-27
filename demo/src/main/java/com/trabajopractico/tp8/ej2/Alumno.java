package com.trabajopractico.tp8.ej2;

public class Alumno {
    private String dni;
    private String nombreApellido;
    private String curso;
    private int inasistencias;
    private String estadoAcademico;
    private Tutor tutor;

    public Alumno(String dni, String nombreApellido, String curso, Tutor tutor) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.curso = curso;
        this.inasistencias = 0;
        this.estadoAcademico = "Regular";
        this.tutor = tutor;
    }

    public void registrarInasistencias(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad de inasistencias no puede ser negativa.");
        }
        this.inasistencias += cantidad;
    }

    public String getNombreApellido() { return nombreApellido; }
    public int getInasistencias() { return inasistencias; }
    public String getEstadoAcademico() { return estadoAcademico; }
    public void setEstadoAcademico(String estadoAcademico) { this.estadoAcademico = estadoAcademico; }
    public Tutor getTutor() { return tutor; }

    @Override
    public String toString() {
        return "Alumno: " + nombreApellido + "  DNI: " + dni + "  Curso: " + curso + 
               "  Inasistencias: " + inasistencias + "  Estado: " + estadoAcademico;
    }
}
