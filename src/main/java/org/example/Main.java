package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "qwe987");

        try (Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Personas")) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                double telefono = rs.getDouble("telefono");
                System.out.println("Usuario: " + nombre + " " + apellido + " - " + correo);
            }
        }
    }
}

