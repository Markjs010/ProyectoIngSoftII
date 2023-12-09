package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

import modelo.data.EstudianteDAO;
import servlets.Login;


public class Principal {

	public static void main(String[] args) {
		
		
		
		EstudianteDAO estudianteDAO;
		try (// DATASOURCE PARA LLAMAR A LA BASE
		BasicDataSource dataSource = new BasicDataSource()) {
			// ESPECIFICAMOS EL DRIVER
			dataSource.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
			// ESPECIFICAMOS LA URL DE LA BASE 
			// IMPORTANTE: CAMBIAR URL DEPENDIENDO DE EN DONDE SE TENGA LA BASE
			dataSource.setUrl("jdbc:derby://localhost:1527//home/oracle/git/ProyectoIngSoftII/ProyectoIngSoftII/BaseDatosProyecto");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
       	

	}
	

}
