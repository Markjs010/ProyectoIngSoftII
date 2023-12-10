package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Estudiante;
import modelo.Prestamos;
import modelo.data.EstudianteDAO;
import modelo.data.PrestamoDAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	String username;
	String password;
	private EstudianteDAO estudianteDao = new EstudianteDAO();
	private PrestamoDAO prestamoDao = new PrestamoDAO();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		username = request.getParameter("username");
		password = request.getParameter("password");
		
		boolean submitButtonPressed = request.getParameter("submit") != null;
		try {
		    Estudiante estudiante = estudianteDao.autenticar(username, password);
		    

		    if (estudiante != null) {
		        // Autenticación exitosa
		    	List<Prestamos> prestamo = prestamoDao.obtenerPrestamosPorEstudiante(estudiante.getId());
		    	request.setAttribute("estudiante", estudiante);
		    	request.setAttribute("prestamos", prestamo);        // Puedes redirigir a otra página o realizar otras acciones
		        getServletContext().getRequestDispatcher("/ModuloEstudiante.jsp").forward(request, response);
		    } else {
		        // Autenticación fallida
		        request.setAttribute("error", "Usuario y/o contraseña incorrectos");
		        getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		    }
		} catch (SQLException e) {
			response.sendRedirect("/error.jsp"); 
		}
	}

	public void setEstudianteDao(EstudianteDAO estudianteDao) {
		this.estudianteDao = estudianteDao;
	}
	
	

}
