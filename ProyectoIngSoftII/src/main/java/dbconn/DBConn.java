package dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	
private static final String JDBC_URL = "jdbc:derby:BaseDatosProyecto;create=true";
	
	Connection conn;
	
	public DBConn() {
		try {
			this.conn = DriverManager.getConnection(JDBC_URL);
			if (this.conn != null) {
				System.out.print("Connection Successful");
				
			}
		}catch(SQLException e) {
			System.out.print("Connection Failed");
		}
	}

}
