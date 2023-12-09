package modelo.data;

import modelo.Docente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

public class DocenteDAO {
    private Connection conn;

    public DocenteDAO() {
        super();
    }

    // Método para obtener un docente por su ID
    public Docente getDocenteById(int docenteId) throws SQLException {
        String sql = "SELECT * FROM docente WHERE ID = ?";
        try (PreparedStatement statement = this.conn.prepareStatement(sql)) {
            statement.setInt(1, docenteId);
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
        try (PreparedStatement statement = this.conn.prepareStatement(sql);
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
        try (PreparedStatement statement = this.conn.prepareStatement(sql)) {
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
        try (PreparedStatement statement = this.conn.prepareStatement(sql)) {
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
        try (PreparedStatement statement = this.conn.prepareStatement(sql)) {
            statement.setInt(1, docenteId);
            statement.executeUpdate();
        }
    }

    // Método privado para extraer un docente de un conjunto de resultados de base de datos
    private Docente extractDocenteFromResultSet(ResultSet resultSet) throws SQLException {
        String nombre = resultSet.getString("NOMBRE");
        String apellido = resultSet.getString("APELLIDO");
        String usuario = resultSet.getString("USUARIO");
        String pass = resultSet.getString("PASSWORD");
        int id = resultSet.getInt("ID");
        int idEspecialidad = resultSet.getInt("ID_ESPECIALIDAD");
        int idAdmin = resultSet.getInt("ID_ADMIN");
        int ni = resultSet.getInt("NI");
        Date fechaContrato = resultSet.getDate("FECHA_CONTRATO");

        Docente docente = new Docente(nombre, apellido, usuario, pass, id);
        docente.setIdEspecialidad(idEspecialidad);
        docente.setIdAdmin(idAdmin);
        docente.setNi(ni);
        docente.setFechaContrato(fechaContrato);

        return docente;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
}