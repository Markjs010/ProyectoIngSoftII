package dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn {
	
private static final String JDBC_URL = "jdbc:derby:BaseDatosProyecto;create=true";

	Connection conn;
	
	public DBConn() {
			try {
				System.out.println("Conectando a la base...");
				this.conn = DriverManager.getConnection(JDBC_URL);
				if (this.conn != null) {
					System.out.print("Conexión Correcta");			
				}

			} catch (SQLException e) {
				System.out.print("Conexión Fallida");
			}
			
	}
	
	
	

}
