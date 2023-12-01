package modelo.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Estudiante;

public class EstudianteDAO {
	private Connection conn;
	
	public EstudianteDAO() {
		super();
	}
	
	public Estudiante recuperaE(Estudiante estudiante) {
		java.sql.Statement st;
		ResultSet rs;
		Estudiante estudianteNuevo = new Estudiante(null, null, null, null, 0);
		
		try {
			st = this.conn.createStatement();
			rs = st.executeQuery("SELECT NOMBRE, APELLIDO, USUARIO, PASSWORD "
					+ "FROM ESTUDIANTE "
					+ "WHERE NOMBRE = '" + estudiante.getNombre().toUpperCase()+"' "
							+ "AND APELLIDO");
			rs.ne
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return estudianteNuevo;
		
	}
	
	public void setConn(Connection conn) {
		this.conn = conn;
	}
}
