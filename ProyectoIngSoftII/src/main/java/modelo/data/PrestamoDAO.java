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

import modelo.Prestamos;

public class PrestamoDAO {
	
	private DataSource dataSource;

    public PrestamoDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    
    public PrestamoDAO() {
        try {
            Context context = new InitialContext();
            // AJUSTAR "java:comp/env/jdbc/NombreDeTuFuenteDeDatos" CON NOMBRE CONFIGURADO EN context.xml
            dataSource = (DataSource) context.lookup("java:comp/env/jdbc/RecursoJDBC");
        } catch (NamingException e) {
        	JOptionPane.showMessageDialog(null, "Falla en la conexion " + e);   
        }
    }
    
 // Método para obtener todos los préstamos de un estudiante por su ID
    public List<Prestamos> obtenerPrestamosPorEstudiante(int idEstudiante) throws SQLException {
        List<Prestamos> prestamos = new ArrayList<>();

        // Consulta SQL para obtener préstamos por ID de estudiante
        String sql = "SELECT * FROM Prestamos WHERE ID_ESTUDIANTE = ?";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, idEstudiante);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Prestamos prestamo = new Prestamos();
                    prestamo.setId(resultSet.getInt("ID"));
                    prestamo.setDescripcion(resultSet.getString("DESCRIPCION"));
                    prestamo.setFechaPrestamo(resultSet.getDate("FECHA_PRESTAMO"));
                    prestamo.setIdEstudiante(resultSet.getInt("ID_ESTUDIANTE"));
                    prestamo.setIdIndumentaria(resultSet.getInt("ID_INDUMENTARIA"));

                    prestamos.add(prestamo);
                }
            }
        }

        return prestamos;
    }

    // Método para agregar un nuevo préstamo
    public void agregarPrestamo(Prestamos prestamo) throws SQLException {
        // Consulta SQL para insertar un nuevo préstamo
        String sql = "INSERT INTO Prestamos (DESCRIPCION, FECHA_PRESTAMO, ID_ESTUDIANTE, ID_INDUMENTARIA) VALUES (?, ?, ?, ?)";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, prestamo.getDescripcion());
            statement.setDate(2, new java.sql.Date(prestamo.getFechaPrestamo().getTime()));
            statement.setInt(3, prestamo.getIdEstudiante());
            statement.setInt(4, prestamo.getIdIndumentaria());

            statement.executeUpdate();
        }
    }
    
    public void borrarPrestamo(int idPrestamo) throws SQLException {
        // Consulta SQL para borrar un préstamo por su ID
        String sql = "DELETE FROM Prestamos WHERE ID = ?";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, idPrestamo);

            statement.executeUpdate();
        }
    }


}
