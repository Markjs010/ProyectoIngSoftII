package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Docente;
import modelo.Estudiante;
import modelo.data.EstudianteDAO;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * Servlet implementation class AgregaEstudiante
 */
public class AgregaEstudiante extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregaEstudiante() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // Obtener los parámetros del formulario
        String ni = request.getParameter("NI");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String fechaNacimientoStr = request.getParameter("fechaNacimiento");
        String fechaIngresoStr = request.getParameter("fechaIngreso");
        String categoria = request.getParameter("categoria");
        String telefono = request.getParameter("Telefono");
        String seguroMedico = request.getParameter("seguroM");
        String usuario = request.getParameter("usuario");
        String pass = request.getParameter("password");
        String idDocente = request.getParameter("idDocente");
        String observaciones = request.getParameter("observaciones");

        // Convertir las fechas de cadena a objetos Date
        Date fechaNacimiento = null;
        Date fechaIngreso = null;
        try {
            fechaNacimiento = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimientoStr);
            fechaIngreso = new SimpleDateFormat("yyyy-MM-dd").parse(fechaIngresoStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Crear un objeto Estudiante con los datos del formulario
        Estudiante estudiante = new Estudiante();
        estudiante.setNi(Integer.parseInt(ni));
        estudiante.setNombre(nombre);
        estudiante.setApellido(apellido);
        estudiante.setFechaNacimiento(fechaNacimiento);
        estudiante.setFechaIngreso(fechaIngreso);
        estudiante.setIdCategoria(Integer.parseInt(categoria));
        estudiante.setTelefono(telefono);
        estudiante.setSeguro(seguroMedico);
        estudiante.setUsuario(usuario);
        estudiante.setPass(pass);
        estudiante.setIdDocente(Integer.parseInt(idDocente));
        estudiante.setObservaciones(observaciones);

        // Guardar el estudiante en la base de datos utilizando EstudianteDAO
        EstudianteDAO estudianteDAO = new EstudianteDAO();
        try {
            estudianteDAO.addEstudiante(estudiante);
            List<Estudiante> estudiantes = estudianteDAO.getAllEstudiantesByDocenteId(Integer.parseInt(idDocente));
	    	request.setAttribute("estudiantes", estudiantes);

        } catch (SQLException e) {
            e.printStackTrace();
            // Manejar la excepción según tus necesidades (puede ser redireccionar a una página de error, etc.)
            JOptionPane.showMessageDialog(null, "Falla en la conexion " + e); 
        }

        // Redireccionar a una página de éxito o mostrar un mensaje de éxito
        request.setAttribute("exito", "Estudiante agregado");
        getServletContext().getRequestDispatcher("/ModuloDocente.jsp").forward(request, response);

	}

}
