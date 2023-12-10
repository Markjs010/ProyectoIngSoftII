package modelo.data;

import modelo.Docente;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocenteDAO {
    private DataSource dataSource;

    public DocenteDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    
    public DocenteDAO() {
        try {
            Context context = new InitialContext();
            // AJUSTAR "java:comp/env/jdbc/NombreDeTuFuenteDeDatos" CON NOMBRE CONFIGURADO EN context.xml
            dataSource = (DataSource) context.lookup("java:comp/env/jdbc/RecursoJDBC");
        } catch (NamingException e) {
        	JOptionPane.showMessageDialog(null, "Falla en la conexion " + e);   
        }
    }

    // Método para obtener un docente por su ID
    public Docente getDocenteById(int docenteId) throws SQLException {
        String sql = "SELECT * FROM docente WHERE ID = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, docenteId);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return extractDocenteFromResultSet(resultSet);
                }
            }
        }
        return null;
    }
    
    public Docente autenticar(String username, String password) throws SQLException {
        String sql = "SELECT * FROM docente WHERE USUARIO = ? AND PASSWORD = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, username);
            statement.setString(2, password);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return extractDocenteFromResultSet(resultSet);
                }
            }
        }
        return null;
    }

    // Método para obtener todos los docentes
    public List<Docente> getAllDocentes() throws SQLException {
        List<Docente> docentes = new ArrayList<>();
        String sql = "SELECT * FROM docente";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                docentes.add(extractDocenteFromResultSet(resultSet));
            }
        }
        return docentes;
    }

    // Método para agregar un nuevo docente
    public void addDocente(Docente docente) throws SQLException {
        String sql = "INSERT INTO docente (NOMBRE, APELLIDO, USUARIO, PASSWORD, ID, ID_ESPECIALIDAD, ID_ADMIN, NI, FECHA_CONTRATO) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, docente.getNombre());
            statement.setString(2, docente.getApellido());
            statement.setString(3, docente.getUsuario());
            statement.setString(4, docente.getPass());
            statement.setInt(5, docente.getId());
            statement.setInt(6, docente.getIdEspecialidad());
            statement.setInt(7, docente.getIdAdmin());
            statement.setInt(8, docente.getNi());
            statement.setDate(9, new java.sql.Date(docente.getFechaContrato().getTime()));
            statement.executeUpdate();
        }
    }

    // Método para actualizar la información de un docente
    public void updateDocente(Docente docente) throws SQLException {
        String sql = "UPDATE docente SET NOMBRE = ?, APELLIDO = ?, USUARIO = ?, PASSWORD = ?, ID_ESPECIALIDAD = ?, ID_ADMIN = ?, NI = ?, FECHA_CONTRATO = ? WHERE ID = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, docente.getNombre());
            statement.setString(2, docente.getApellido());
            statement.setString(3, docente.getUsuario());
            statement.setString(4, docente.getPass());
            statement.setInt(5, docente.getIdEspecialidad());
            statement.setInt(6, docente.getIdAdmin());
            statement.setInt(7, docente.getNi());
            statement.setDate(8, new java.sql.Date(docente.getFechaContrato().getTime()));
            statement.setInt(9, docente.getId());
            statement.executeUpdate();
        }
    }

    // Método para borrar un docente por su ID
    public void deleteDocente(int docenteId) throws SQLException {
        String sql = "DELETE FROM docente WHERE ID = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, docenteId);
            statement.executeUpdate();
        }
    }

    // Método privado para extraer un docente de un conjunto de resultados de base de datos
    private Docente extractDocenteFromResultSet(ResultSet resultSet) throws SQLException {
        Docente docente = new Docente(
        		resultSet.getInt("ID"),
        		resultSet.getInt("NI"),
        		resultSet.getString("NOMBRE"),
        		resultSet.getString("APELLIDO"),
        		resultSet.getDate("FECHA_CONTRATO"),
        		resultSet.getInt("ID_ESPECIALIDAD"),
        		resultSet.getString("USUARIO"),
        		resultSet.getString("PASSWORD"),
        		resultSet.getInt("ID_ADMINISTRADOR")
        		);
        		
        return docente;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

}
