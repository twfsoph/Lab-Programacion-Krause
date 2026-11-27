package com.globant.dao.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.globant.dao.EmpleadoDao;
import com.globant.model.Empleado;

public class EmpleadoDaoImpl implements EmpleadoDao {

    String url = "jdbc:mysql://localhost:3306/globant_db?useSSL=false&serverTimezone=UTC";
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
        String sql = "INSERT INTO empleados (nombre, apellido, dni, cargo, salario, activo) VALUES (?,?,?,?,?,?)";
        try (Connection con = conexionBd();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getDni());
            ps.setString(4, e.getCargo());
            ps.setDouble(5, e.getSalario());
            ps.setBoolean(6, e.isActivo());
            ps.executeUpdate();

            // me guardo el id que le puso la base
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    e.setId(rs.getInt(1));
                }
            }
        } catch (SQLException e2) {
            throw new RuntimeException("error al crear empleado: " + e2.getMessage());
        }
    }

    public void actualizar(Empleado e) {
        String sql = "UPDATE empleados SET nombre=?, apellido=?, dni=?, cargo=?, salario=? WHERE id=?";
        try (Connection con = conexionBd();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getDni());
            ps.setString(4, e.getCargo());
            ps.setDouble(5, e.getSalario());
            ps.setInt(6, e.getId());
            ps.executeUpdate();
        } catch (SQLException e2) {
            throw new RuntimeException("error al actualizar empleado: " + e2.getMessage());
        }
    }

    public void eliminar(int id) {
        // baja logica, no se borra la fila
        String sql = "UPDATE empleados SET activo=false WHERE id=?";
        try (Connection con = conexionBd();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("error al eliminar empleado: " + e.getMessage());
        }
    }

    public Empleado listarPorId(int id) {
        String sql = "SELECT * FROM empleados WHERE id=?";
        try (Connection con = conexionBd();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return armarEmpleado(rs);
                }
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException("error al buscar empleado: " + e.getMessage());
        }
    }

    public List<Empleado> listarTodo() {
        List<Empleado> lista = new ArrayList<>();
        String sql = "SELECT * FROM empleados WHERE activo=true";
        try (Connection con = conexionBd();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                lista.add(armarEmpleado(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException("error al listar empleados: " + e.getMessage());
        }
        return lista;
    }

    public Empleado buscarPorDni(int dni) {
        String sql = "SELECT * FROM empleados WHERE dni=?";
        try (Connection con = conexionBd();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, dni);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return armarEmpleado(rs);
                }
            }
            return null;
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
