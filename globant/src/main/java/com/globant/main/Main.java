package com.globant.main;

import com.globant.excepciones.*;
import com.globant.model.Empleado;
import com.globant.service.EmpleadoService;

public class Main {

    public static void main(String[] args) {

        EmpleadoService service = new EmpleadoService();

        System.out.println("1) registrar un empleado valido");
        try {
            service.registrar("Ana", "Gomez", 30111222, "Analista", 500000);
            System.out.println("se registro bien");
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }

        System.out.println("\n2) registrar con dni repetido");
        try {
            service.registrar("Ana", "Otra", 30111222, "Soporte", 400000);
        } catch (DniDuplicadoException e) {
            System.out.println("error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error raro: " + e.getMessage());
        }

        System.out.println("\n3) registrar con dni invalido");
        try {
            service.registrar("Juan", "Perez", 12345, "Analista", 500000);
        } catch (DniInvalidoException e) {
            System.out.println("error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error raro: " + e.getMessage());
        }

        System.out.println("\n4) registrar con cargo invalido");
        try {
            service.registrar("Luis", "Diaz", 33444555, "Pasante", 400000);
        } catch (CargoInvalidoException e) {
            System.out.println("error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error raro: " + e.getMessage());
        }

        System.out.println("\n5) registrar con salario invalido");
        try {
            service.registrar("Sofia", "Ruiz", 35666777, "Gerente", 1000);
        } catch (SalarioInvalidoException e) {
            System.out.println("error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error raro: " + e.getMessage());
        }

        System.out.println("\n6) actualizar un id que no existe");
        try {
            service.actualizar(9999, "Nombre", "Apellido", 30111222, "Analista", 500000);
        } catch (EmpleadoNoEncontradoException e) {
            System.out.println("error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error raro: " + e.getMessage());
        }

        System.out.println("\n7) eliminar al empleado que registramos en el paso 1");
        try {
            // busco el id del empleado que creamos antes, recorriendo la lista a mano
            Empleado encontrado = null;
            for (Empleado emp : service.listarTodo()) {
                if (emp.getDni() == 30111222) {
                    encontrado = emp;
                }
            }

            if (encontrado != null) {
                service.eliminar(encontrado.getId());
                System.out.println("se elimino el empleado con id " + encontrado.getId());

                System.out.println("\n8) eliminar dos veces al mismo empleado");
                service.eliminar(encontrado.getId());
            } else {
                System.out.println("no lo encontre, raro");
            }
        } catch (EmpleadoYaInactivoException e) {
            System.out.println("error: " + e.getMessage());
        } catch (EmpleadoNoEncontradoException e) {
            System.out.println("error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error raro: " + e.getMessage());
        }

        System.out.println("\n9) listar todos los activos");
        for (Empleado e : service.listarTodo()) {
            System.out.println(e);
        }
    }
}
