package modelo.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.swing.JOptionPane;

import modelo.Clases;

public class ClasesDAO {
	private DataSource dataSource;

	public ClasesDAO(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public ClasesDAO() {
		try {
			Context context = new InitialContext();
			// AJUSTAR "java:comp/env/jdbc/NombreDeTuFuenteDeDatos" CON NOMBRE CONFIGURADO
			// EN context.xml
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/RecursoJDBC");
		} catch (NamingException e) {
			JOptionPane.showMessageDialog(null, "Falla en la conexion " + e);
		}
	}

	// Método para obtener todas las clases
	public List<Clases> obtenerTodasLasClases() throws SQLException {
		List<Clases> clases = new ArrayList<>();

		// Consulta SQL para obtener todas las clases
		String sql = "SELECT * FROM Clases";

		try (Connection conn = dataSource.getConnection();
				PreparedStatement statement = conn.prepareStatement(sql);
				ResultSet resultSet = statement.executeQuery()) {
			while (resultSet.next()) {
				Clases clase = new Clases();
				clase.setId(resultSet.getInt("ID"));
				clase.setIdDocente(resultSet.getInt("ID_DOCENTE"));
				clase.setHora(resultSet.getTime("HORA"));

				clases.add(clase);
			}
		}

		return clases;
	}

	// Método para obtener clases por el ID del docente
	public List<Clases> obtenerClasesPorDocente(int idDocente) throws SQLException {
		List<Clases> clases = new ArrayList<>();

		// Consulta SQL para obtener clases por ID del docente
		String sql = "SELECT * FROM Clases WHERE ID_DOCENTE = ?";

		try (Connection conn = dataSource.getConnection(); PreparedStatement statement = conn.prepareStatement(sql)) {
			statement.setInt(1, idDocente);

			try (ResultSet resultSet = statement.executeQuery()) {
				while (resultSet.next()) {
					Clases clase = new Clases();
					clase.setId(resultSet.getInt("ID"));
					clase.setIdDocente(resultSet.getInt("ID_DOCENTE"));
					clase.setHora(resultSet.getTime("HORA"));

					clases.add(clase);
				}
			}
		}

		return clases;
	}

	// Método para agregar una nueva clase
	public void agregarClase(Clases clase) throws SQLException {
		// Consulta SQL para insertar una nueva clase
		String sql = "INSERT INTO Clases (ID_DOCENTE, HORA) VALUES (?, ?)";

		try (Connection conn = dataSource.getConnection(); PreparedStatement statement = conn.prepareStatement(sql)) {
			statement.setInt(1, clase.getIdDocente());
			statement.setTime(2, clase.getHora());

			statement.executeUpdate();
		}
	}

}