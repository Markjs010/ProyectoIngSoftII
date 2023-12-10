package modelo;

import java.sql.Date;

public class Docente implements Data {

	private String nombre, apellido, usuario, pass;
	private int id, idEspecialidad, idAdmin, ni;
	private Date fechaContrato;

	public Docente() {
		super();
	}

	public Docente(int id, int ni, String nombre, String apellido, Date fechaContrato, int idEspecialidad,
			String usuario, String pass, int idAdmin) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.pass = pass;
		this.id = id;
		this.idEspecialidad = idEspecialidad;
		this.idAdmin = idAdmin;
		this.ni = ni;
		this.fechaContrato = fechaContrato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public int getNi() {
		return ni;
	}

	public void setNi(int ni) {
		this.ni = ni;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

}
