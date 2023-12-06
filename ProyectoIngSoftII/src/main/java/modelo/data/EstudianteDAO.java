package modelo.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Estudiante;

public class EstudianteDAO {
	private Connection conn;
	
	public EstudianteDAO() {
		super();
	}
	
	// Método para obtener un estudiante por su ID
    public Estudiante getEstudianteById(int estudianteId) throws SQLException {
        String sql = "SELECT * FROM estudiante WHERE ID = ?";
        try (PreparedStatement statement = this.conn.prepareStatement(sql)) {
            statement.setInt(1, estudianteId);
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
        try (PreparedStatement statement = this.conn.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                estudiantes.add(extractEstudianteFromResultSet(resultSet));
            }
        }
        return estudiantes;
    }

    // Método para agregar un nuevo estudiante
    public void addEstudiante(Estudiante estudiante) throws SQLException {
        String sql = "INSERT INTO estudiante (NOMBRE, APELLIDO, OBSERVACIONES, USUARIO, PASSWORD, ID_CLASE) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = this.conn.prepareStatement(sql)) {
            statement.setString(1, estudiante.getNombre());
            statement.setString(2, estudiante.getApellido());
            statement.setString(3, estudiante.getObservaciones());
            statement.setString(4, estudiante.getUsuario());
            statement.setString(5, estudiante.getPass());
            statement.setInt(6, estudiante.getIdClase());
            statement.executeUpdate();
        }
    }

    // Método para actualizar la información de un estudiante
    public void updateEstudiante(Estudiante estudiante) throws SQLException {
        String sql = "UPDATE estudiante SET NOMBRE = ?, APELLIDO = ?, OBSERVACIONES = ?, USUARIO = ?, PASSWORD = ?, ID_CLASE = ? WHERE ID = ?";
        try (PreparedStatement statement = this.conn.prepareStatement(sql)) {
            statement.setString(1, estudiante.getNombre());
            statement.setString(2, estudiante.getApellido());
            statement.setString(3, estudiante.getObservaciones());
            statement.setString(4, estudiante.getUsuario());
			statement.setString(5, estudiante.getPass());
            statement.setInt(6, estudiante.getIdClase());
            statement.setInt(7, estudiante.getId());
            statement.executeUpdate();
        }
    }

    // Método para borrar un estudiante por su ID
    public void deleteEstudiante(int estudianteId) throws SQLException {
        String sql = "DELETE FROM estudiante WHERE ID = ?";
        try (PreparedStatement statement = this.conn.prepareStatement(sql)) {
            statement.setInt(1, estudianteId);
            statement.executeUpdate();
        }
    }

    // Método privado para extraer un estudiante de un conjunto de resultados de base de datos
    private Estudiante extractEstudianteFromResultSet(ResultSet resultSet) throws SQLException {
        Estudiante estudiante = new Estudiante(null, null, null, null, 0);
        estudiante.setId(resultSet.getInt("ID"));
        estudiante.setNombre(resultSet.getString("NOMBRE"));
        estudiante.setApellido(resultSet.getString("APELLIDO"));
        estudiante.setObservaciones(resultSet.getString("OBSERVACIONES"));
        estudiante.setUsuario(resultSet.getString("USUARIO"));
        estudiante.setPass(resultSet.getString("PASSWORD"));
        estudiante.setIdClase(resultSet.getInt("ID_CLASE"));
        return estudiante;
    }
	
	public void setConn(Connection conn) {
		this.conn = conn;
	}
}
