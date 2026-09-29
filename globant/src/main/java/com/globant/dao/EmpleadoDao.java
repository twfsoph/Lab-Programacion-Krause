package com.globant.dao;

import com.globant.model.Empleado;
import java.util.List;

public interface EmpleadoDao {

    void crear(Empleado e);
    void actualizar(Empleado e);
    void eliminar(int id);
    Empleado listarPorId(int id);
    List<Empleado> listarTodo();
    Empleado buscarPorDni(int dni);
}
