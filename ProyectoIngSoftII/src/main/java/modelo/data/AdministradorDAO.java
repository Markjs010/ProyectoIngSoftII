package modelo.data;

import modelo.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AdministradorDAO {
    private Connection conn;

    public AdministradorDAO() {
        super();
    }

    // Método para obtener un administrador por su usuario
    public Administrador getAdministradorByUsuario(String usuario) throws SQLException {
        String sql = "SELECT * FROM administrador WHERE USUARIO = ?";
        try (PreparedStatement statement = this.conn.prepareStatement(sql)) {
            statement.setString(1, usuario);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return extractAdministradorFromResultSet(resultSet);
                }
            }
        }
        return null;
    }

    // Método para obtener todos los administradores
    public List<Administrador> getAllAdministradores() throws SQLException {
        List<Administrador> administradores = new ArrayList<>();
        String sql = "SELECT * FROM administrador";
        try (PreparedStatement statement = this.conn.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                administradores.add(extractAdministradorFromResultSet(resultSet));
            }
        }
        return administradores;
    }

    // Método para agregar un nuevo administrador
    public void addAdministrador(Administrador administrador) throws SQLException {
        String sql = "INSERT INTO administrador (USUARIO, PASSWORD) VALUES (?, ?)";
        try (PreparedStatement statement = this.conn.prepareStatement(sql)) {
            statement.setString(1, administrador.getUsuario());
            statement.setString(2, administrador.getPass());
            statement.executeUpdate();
        }
    }

    // Método para actualizar la información de un administrador
    public void updateAdministrador(Administrador administrador) throws SQLException {
        String sql = "UPDATE administrador SET USUARIO = ?, PASSWORD = ? WHERE USUARIO = ?";
        try (PreparedStatement statement = this.conn.prepareStatement(sql)) {
            statement.setString(1, administrador.getUsuario());
            statement.setString(2, administrador.getPass());
            statement.setString(3, administrador.getUsuario());
            statement.executeUpdate();
        }
    }

    // Método para borrar un administrador por su usuario
    public void deleteAdministrador(String usuario) throws SQLException {
        String sql = "DELETE FROM administrador WHERE USUARIO = ?";
        try (PreparedStatement statement = this.conn.prepareStatement(sql)) {
            statement.setString(1, usuario);
            statement.executeUpdate();
        }
    }

    // Método privado para extraer un administrador de un conjunto de resultados de base de datos
    private Administrador extractAdministradorFromResultSet(ResultSet resultSet) throws SQLException {
        String usuario = resultSet.getString("USUARIO");
        String pass = resultSet.getString("PASSWORD");
        return new Administrador(usuario, pass);
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
}