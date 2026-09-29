package com.globant.dao.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.globant.dao.EmpleadoDao;
import com.globant.model.Empleado;

public class EmpleadoDaoImpl implements EmpleadoDao {

    String url = "jdbc:mysql://localhost:3306/globant_db";
    String usuario = "root";
    String clave = "";

    public Connection conexionBd() {
        try {
            return DriverManager.getConnection(url, usuario, clave);
        } catch (SQLException e) {
            throw new RuntimeException("no se pudo conectar a la bd: " + e.getMessage());
        }
    }

    public void crear(Empleado e) {
        try {
            Connection con = conexionBd();
            String sql = "INSERT INTO empleados (nombre, apellido, dni, cargo, salario, activo) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getDni());
            ps.setString(4, e.getCargo());
            ps.setDouble(5, e.getSalario());
            ps.setBoolean(6, e.isActivo());
            ps.executeUpdate();
            con.close();
        } catch (SQLException e2) {
            throw new RuntimeException("error al crear empleado: " + e2.getMessage());
        }
    }

    public void actualizar(Empleado e) {
        try {
            Connection con = conexionBd();
            String sql = "UPDATE empleados SET nombre=?, apellido=?, dni=?, cargo=?, salario=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getDni());
            ps.setString(4, e.getCargo());
            ps.setDouble(5, e.getSalario());
            ps.setInt(6, e.getId());
            ps.executeUpdate();
            con.close();
        } catch (SQLException e2) {
            throw new RuntimeException("error al actualizar empleado: " + e2.getMessage());
        }
    }

    public void eliminar(int id) {
        // baja logica, no se borra la fila
        try {
            Connection con = conexionBd();
            String sql = "UPDATE empleados SET activo=false WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException("error al eliminar empleado: " + e.getMessage());
        }
    }

    public Empleado listarPorId(int id) {
        try {
            Connection con = conexionBd();
            String sql = "SELECT * FROM empleados WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Empleado emp = null;
            if (rs.next()) {
                emp = armarEmpleado(rs);
            }
            con.close();
            return emp;
        } catch (SQLException e) {
            throw new RuntimeException("error al buscar empleado: " + e.getMessage());
        }
    }

    public List<Empleado> listarTodo() {
        List<Empleado> lista = new ArrayList<>();
        try {
            Connection con = conexionBd();
            String sql = "SELECT * FROM empleados WHERE activo=true";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(armarEmpleado(rs));
            }
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException("error al listar empleados: " + e.getMessage());
        }
        return lista;
    }

    public Empleado buscarPorDni(int dni) {
        try {
            Connection con = conexionBd();
            String sql = "SELECT * FROM empleados WHERE dni=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            Empleado emp = null;
            if (rs.next()) {
                emp = armarEmpleado(rs);
            }
            con.close();
            return emp;
        } catch (SQLException e) {
            throw new RuntimeException("error al buscar por dni: " + e.getMessage());
        }
    }

    private Empleado armarEmpleado(ResultSet rs) throws SQLException {
        return new Empleado(
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getInt("dni"),
                rs.getString("cargo"),
                rs.getDouble("salario"),
                rs.getBoolean("activo")
        );
    }
}
