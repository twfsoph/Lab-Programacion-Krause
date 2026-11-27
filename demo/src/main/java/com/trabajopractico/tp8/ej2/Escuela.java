package com.trabajopractico.tp8.ej2;
import java.util.ArrayList;

public class Escuela {
    private ArrayList<Alumno> alumnos;
    private int limiteInasistencias;

    public Escuela(int limiteInasistencias) {
        this.alumnos = new ArrayList<>();
        this.limiteInasistencias = limiteInasistencias;
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void inscribirAExamenEspecial(Alumno alumno) throws AlumnoLibreException {
        if (alumno.getInasistencias() > this.limiteInasistencias) {
            alumno.setEstadoAcademico("Libre");
            throw new AlumnoLibreException("Operación rechazada: El alumno " + alumno.getNombreApellido() + 
                    " está LIBRE por exceder las " + this.limiteInasistencias + " inasistencias.");
        }
        System.out.println("Inscripción exitosa al examen especial para: " + alumno.getNombreApellido());
    }
}
