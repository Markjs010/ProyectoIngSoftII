package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
			Connection conn = getDBConnection();
			if(conn != null) {
				
			}
				

	}
	
	public static Connection getDBConnection() {
		 String url          = "jdbc:derby:BaseDatosProyecto;create=true";
		 try
	        {
	            Connection conn = DriverManager.getConnection(url);
	            System.out.println("Conectado ... "+ conn);
	            return conn;
	        }
	        catch (SQLException e)
	        {
	              JOptionPane.showMessageDialog(null, "FallÃ³ la conexiÃ³n " + e);  
	              return null;
	        }       
		} //FIN GET_CONN
	

}
