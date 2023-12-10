package modelo;

import java.sql.Date;

public class Estudiante implements Data {
	private String nombre, apellido, observaciones, telefono, seguro, usuario, pass;
	private Date fechaNacimiento, fechaIngreso;
	private int id, ni, idCategoria, idClase;

	public Estudiante() {
		super();
	}

	public Estudiante(int id, int ni, String nombre, String apellido, Date fechaNacimiento, Date fechaIngreso,
			int idCategoria, String observaciones, String telefono, String seguro, String usuario, String pass, 
			int idClase) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.observaciones = observaciones;
		this.telefono = telefono;
		this.seguro = seguro;
		this.usuario = usuario;
		this.pass = pass;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaIngreso = fechaIngreso;
		this.id = id;
		this.ni = ni;
		this.idCategoria = idCategoria;
		this.idClase = idClase;
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

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getSeguro() {
		return seguro;
	}

	public void setSeguro(String seguro) {
		this.seguro = seguro;
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNi() {
		return ni;
	}

	public void setNi(int ni) {
		this.ni = ni;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public int getIdClase() {
		return idClase;
	}

	public void setIdClase(int idClase) {
		this.idClase = idClase;
	}

}
