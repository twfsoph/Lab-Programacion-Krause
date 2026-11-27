package com.globant.service;

import java.util.Arrays;
import java.util.List;

import com.globant.dao.EmpleadoDao;
import com.globant.dao.daoimpl.EmpleadoDaoImpl;
import com.globant.excepciones.CargoInvalidoException;
import com.globant.excepciones.DniDuplicadoException;
import com.globant.excepciones.DniInvalidoException;
import com.globant.excepciones.EmpleadoNoEncontradoException;
import com.globant.excepciones.EmpleadoYaInactivoException;
import com.globant.excepciones.SalarioInvalidoException;
import com.globant.model.Empleado;

public class EmpleadoService {

    private EmpleadoDao empleadoDao = new EmpleadoDaoImpl();

    double salarioMinimo = 300000.0;
    List<String> cargosPermitidos = Arrays.asList("Analista", "Desarrollador", "Gerente", "Soporte");

    public void registrar(String nombre, String apellido, int dni, String cargo, double salario)
            throws DniInvalidoException, DniDuplicadoException, SalarioInvalidoException, CargoInvalidoException {

        validarDni(dni);

        if (empleadoDao.buscarPorDni(dni) != null) {
            throw new DniDuplicadoException("ya existe un empleado con ese dni");
        }

        validarSalario(salario);
        validarCargo(cargo);

        Empleado nuevo = new Empleado(nombre, apellido, dni, cargo, salario, true);
        empleadoDao.crear(nuevo);
    }

    public void actualizar(int id, String nombre, String apellido, int dni, String cargo, double salario)
            throws DniInvalidoException, DniDuplicadoException, SalarioInvalidoException,
            CargoInvalidoException, EmpleadoNoEncontradoException {

        Empleado existente = empleadoDao.listarPorId(id);
        if (existente == null) {
            throw new EmpleadoNoEncontradoException("no existe un empleado con id " + id);
        }

        validarDni(dni);

        if (dni != existente.getDni() && empleadoDao.buscarPorDni(dni) != null) {
            throw new DniDuplicadoException("ya existe un empleado con ese dni");
        }

        validarSalario(salario);
        validarCargo(cargo);

        existente.setNombre(nombre);
        existente.setApellido(apellido);
        existente.setDni(dni);
        existente.setCargo(cargo);
        existente.setSalario(salario);
        empleadoDao.actualizar(existente);
    }

    public void eliminar(int id) throws EmpleadoNoEncontradoException, EmpleadoYaInactivoException {
        Empleado existente = empleadoDao.listarPorId(id);
        if (existente == null) {
            throw new EmpleadoNoEncontradoException("no existe un empleado con id " + id);
        }
        if (!existente.isActivo()) {
            throw new EmpleadoYaInactivoException("el empleado con id " + id + " ya esta inactivo");
        }
        empleadoDao.eliminar(id);
    }

    public Empleado listarPorId(int id) throws EmpleadoNoEncontradoException {
        Empleado e = empleadoDao.listarPorId(id);
        if (e == null) {
            throw new EmpleadoNoEncontradoException("no existe un empleado con id " + id);
        }
        return e;
    }

    public List<Empleado> listarTodo() {
        return empleadoDao.listarTodo();
    }

    private void validarDni(int dni) throws DniInvalidoException {
        int largo = String.valueOf(dni).length();
        if (largo < 7 || largo > 8) {
            throw new DniInvalidoException("el dni tiene que tener 7 u 8 digitos");
        }
    }

    private void validarSalario(double salario) throws SalarioInvalidoException {
        if (salario <= salarioMinimo) {
            throw new SalarioInvalidoException("el salario tiene que ser mayor a " + salarioMinimo);
        }
    }

    private void validarCargo(String cargo) throws CargoInvalidoException {
        if (!cargosPermitidos.contains(cargo)) {
            throw new CargoInvalidoException("el cargo tiene que ser uno de estos: " + cargosPermitidos);
        }
    }
}
