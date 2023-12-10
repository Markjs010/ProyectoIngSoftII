package modelo.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;
import javax.swing.JOptionPane;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import modelo.Estudiante;

public class EstudianteDAO {
		
	private DataSource dataSource;

    public EstudianteDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public EstudianteDAO() {
        try {
            Context context = new InitialContext();
            // AJUSTAR "java:comp/env/jdbc/NombreDeTuFuenteDeDatos" CON NOMBRE CONFIGURADO EN context.xml
            dataSource = (DataSource) context.lookup("java:comp/env/jdbc/RecursoJDBC");
        } catch (NamingException e) {
        	JOptionPane.showMessageDialog(null, "Falla en la conexion " + e);   
        }
    }
    
	// Método para obtener un estudiante por su ID
    public Estudiante getEstudianteById(int estudianteId) throws SQLException {
        String sql = "SELECT * FROM estudiante WHERE ID = ?";
        try (Connection conn = dataSource.getConnection();
        	PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, estudianteId);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return extractEstudianteFromResultSet(resultSet);
                }
            }
        }
        return null;
    }
    
    public Estudiante getEstudianteByUsuario(String usuario) throws SQLException {
        String sql = "SELECT * FROM estudiante WHERE USUARIO = ?";
        try (Connection conn = dataSource.getConnection();
                PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, usuario);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return extractEstudianteFromResultSet(resultSet);
                }
            }
        }
        return null;
    }
    
    public Estudiante autenticar(String username, String password) throws SQLException {
        String sql = "SELECT * FROM estudiante WHERE USUARIO = ? AND PASSWORD = ?";
        try (Connection conn = dataSource.getConnection();
        	PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, username);
            statement.setString(2, password);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return extractEstudianteFromResultSet(resultSet);
                }
            }
        }
        return null;
    }

    // Método para obtener todos los estudiantes
    public List<Estudiante> getAllEstudiantes() throws SQLException {
        List<Estudiante> estudiantes = new ArrayList<>();
        String sql = "SELECT * FROM estudiante";
        try (Connection conn = dataSource.getConnection();
        	PreparedStatement statement = conn.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                estudiantes.add(extractEstudianteFromResultSet(resultSet));
            }
        }
        return estudiantes;
    }

    // Método para agregar un nuevo estudiante
    public void addEstudiante(Estudiante estudiante) throws SQLException {
        String sql = "INSERT INTO estudiante (NOMBRE, APELLIDO, OBSERVACIONES, USUARIO, PASSWORD, ID_CLASE, FECHA_NACIMIENTO, FECHA_INGRESO, ID_CATEGORIA, TELEFONO, SEGURO_MEDICO _MEDICO) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = dataSource.getConnection();
                PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, estudiante.getNombre());
            statement.setString(2, estudiante.getApellido());
            statement.setString(3, estudiante.getObservaciones());
            statement.setString(4, estudiante.getUsuario());
            statement.setString(5, estudiante.getPass());
            statement.setInt(6, estudiante.getIdClase());
            statement.setDate(7, new java.sql.Date(estudiante.getFechaNacimiento().getTime())); // Convierte Date a java.sql.Date
            statement.setDate(8, new java.sql.Date(estudiante.getFechaIngreso().getTime())); // Convierte Date a java.sql.Date
            statement.setInt(9, estudiante.getIdCategoria());
            statement.setString(10, estudiante.getTelefono());
            statement.setString(11, estudiante.getSeguro());
            statement.executeUpdate();
        }
    }

    // Método para actualizar la información de un estudiante
    public void updateEstudiante(Estudiante estudiante) throws SQLException {
        String sql = "UPDATE estudiante SET NOMBRE = ?, APELLIDO = ?, OBSERVACIONES = ?, USUARIO = ?, PASSWORD = ?, ID_CLASE = ?, FECHA_NACIMIENTO = ?, FECHA_INGRESO = ?, ID_CATEGORIA = ?, TELEFONO = ?, SEGURO_MEDICO = ? WHERE ID = ?";
        try (Connection conn = dataSource.getConnection();
                PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, estudiante.getNombre());
            statement.setString(2, estudiante.getApellido());
            statement.setString(3, estudiante.getObservaciones());
            statement.setString(4, estudiante.getUsuario());
            statement.setString(5, estudiante.getPass());
            statement.setInt(6, estudiante.getIdClase());
            statement.setDate(7, new java.sql.Date(estudiante.getFechaNacimiento().getTime())); // Convierte Date a java.sql.Date
            statement.setDate(8, new java.sql.Date(estudiante.getFechaIngreso().getTime())); // Convierte Date a java.sql.Date
            statement.setInt(9, estudiante.getIdCategoria());
            statement.setString(10, estudiante.getTelefono());
            statement.setString(11, estudiante.getSeguro());
            statement.setInt(12, estudiante.getId());
            statement.executeUpdate();
        }
    }

    // Método para borrar un estudiante por su ID
    public void deleteEstudiante(int estudianteId) throws SQLException {
        String sql = "DELETE FROM estudiante WHERE ID = ?";
        try (Connection conn = dataSource.getConnection();
        	PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, estudianteId);
            statement.executeUpdate();
        }
    }

    // Método privado para extraer un estudiante de un conjunto de resultados de base de datos
    private Estudiante extractEstudianteFromResultSet(ResultSet resultSet) throws SQLException {
        Estudiante estudiante = new Estudiante(
                resultSet.getInt("ID"),
                resultSet.getInt("NI"),
                resultSet.getString("NOMBRE"),
                resultSet.getString("APELLIDO"),
                resultSet.getDate("FECHA_NACIMIENTO"),
                resultSet.getDate("FECHA_INGRESO"),
                resultSet.getInt("ID_CATEGORIA"),
                resultSet.getString("OBSERVACIONES"),
                resultSet.getString("TELEFONO"),
                resultSet.getString("SEGURO_MEDICO"),
                resultSet.getString("USUARIO"),
                resultSet.getString("PASSWORD"),
                resultSet.getInt("ID_CLASE")
        );
        return estudiante;
    }
}
