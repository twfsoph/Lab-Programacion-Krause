package com.vendedores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    static String url = "jdbc:mysql://localhost:3306/vendedores_db?useSSL=false&serverTimezone=UTC";
    static String usuario = "root";
    static String clave = "";

    public static void main(String[] args) {

        try (Connection con = DriverManager.getConnection(url, usuario, clave)) {
            System.out.println("Conexion establecida con vendedores_db");

            // vacio la tabla para que los id empiecen siempre en 1
            // (asi el id=4 y el id=2 son los mismos cada vez que lo ejecuto)
            limpiarTabla(con);

            System.out.println("\n1) Insertar 5 vendedores");
            insertar(con, "Lucia", "Fernandez", 30111222, "Indumentaria", true);
            insertar(con, "Martin", "Lopez", 28333444, "Electronica", true);
            insertar(con, "Camila", "Suarez", 35666777, "Libreria", false);
            insertar(con, "Julian", "Perez", 33444555, "Jugueteria", true);
            insertar(con, "Valeria", "Diaz", 31222333, "Ferreteria", true);

            System.out.println("\n2) Borrar el vendedor con id=4");
            borrar(con, 4);

            System.out.println("\n3) Modificar apellido y rubro del id=2");
            modificar(con, 2, "Gomez", "Computacion");

            System.out.println("\n4) Listar todos");
            listar(con);

        } catch (SQLException e) {
            System.out.println("Error con la base de datos: " + e.getMessage());
        }
    }

    static void limpiarTabla(Connection con) throws SQLException {
        try (Statement st = con.createStatement()) {
            st.executeUpdate("TRUNCATE TABLE vendedores");
        }
    }

    // CREATE
    static void insertar(Connection con, String nombre, String apellido, int dni, String rubro, boolean actual) throws SQLException {
        String sql = "INSERT INTO vendedores (nombre, apellido, dni, rubro, actual) VALUES (?,?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setInt(3, dni);
            ps.setString(4, rubro);
            ps.setBoolean(5, actual);
            ps.executeUpdate();
            System.out.println("Se inserto: " + nombre + " " + apellido);
        }
    }

    // DELETE
    static void borrar(Connection con, int id) throws SQLException {
        String sql = "DELETE FROM vendedores WHERE id=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                System.out.println("Se borro el vendedor con id=" + id);
            } else {
                System.out.println("No existe ningun vendedor con id=" + id);
            }
        }
    }

    // UPDATE
    static void modificar(Connection con, int id, String apellido, String rubro) throws SQLException {
        String sql = "UPDATE vendedores SET apellido=?, rubro=? WHERE id=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, apellido);
            ps.setString(2, rubro);
            ps.setInt(3, id);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                System.out.println("Se modifico el vendedor con id=" + id);
            } else {
                System.out.println("No existe ningun vendedor con id=" + id);
            }
        }
    }

    // READ
    static void listar(Connection con) throws SQLException {
        String sql = "SELECT * FROM vendedores";
        try (PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.printf("%-4s %-10s %-10s %-10s %-14s %s%n", "ID", "NOMBRE", "APELLIDO", "DNI", "RUBRO", "ACTUAL");
            while (rs.next()) {
                System.out.printf("%-4d %-10s %-10s %-10d %-14s %s%n",
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("dni"),
                        rs.getString("rubro"),
                        rs.getBoolean("actual"));
            }
        }
    }
}
