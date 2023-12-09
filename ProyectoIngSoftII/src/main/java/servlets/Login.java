package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Estudiante;
import modelo.data.EstudianteDAO;

import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	String username;
	String password;
	private EstudianteDAO estudianteDao = new EstudianteDAO();
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
		System.out.print("hola");
		
		boolean submitButtonPressed = request.getParameter("submit") != null;
		try {
		    Estudiante estudiante = estudianteDao.autenticar(username, password);

		    if (estudiante != null) {
		        // Autenticación exitosa
		        // Puedes redirigir a otra página o realizar otras acciones
		        getServletContext().getRequestDispatcher("/ModuloEstudiante.jsp").forward(request, response);
		    } else {
		        // Autenticación fallida
		        request.setAttribute("error", "Usuario y/o contraseña incorrectos");
		        getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		    }
		} catch (SQLException e) {
		    // Maneja la excepción según tus necesidades
			JOptionPane.showMessageDialog(null, "FALLA CONEXION " + e); 
		}
	}

	public void setEstudianteDao(EstudianteDAO estudianteDao) {
		this.estudianteDao = estudianteDao;
	}
	
	

}
