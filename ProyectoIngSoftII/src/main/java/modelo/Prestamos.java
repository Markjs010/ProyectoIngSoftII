package modelo;

import java.sql.Date;

public class Prestamos implements Data{
	
	private String descripcion;
	private Date fechaPrestamo;
	private int idEstudiante, idIndumentaria;
	
	public Prestamos(String descripcion, Date fechaPrestamo, int idEstudiante, int idIndumentaria) {
		super();
		this.descripcion = descripcion;
		this.fechaPrestamo = fechaPrestamo;
		this.idEstudiante = idEstudiante;
		this.idIndumentaria = idIndumentaria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public int getIdIndumentaria() {
		return idIndumentaria;
	}

	public void setIdIndumentaria(int idIndumentaria) {
		this.idIndumentaria = idIndumentaria;
	}
	

}
