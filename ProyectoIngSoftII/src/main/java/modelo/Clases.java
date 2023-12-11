package modelo;

import java.sql.Time;

public class Clases {

	private int id, idDocente;
	private Time hora;

	public Clases(int id, int idDocente, Time hora) {
		super();
		this.id = id;
		this.idDocente = idDocente;
		this.hora = hora;
	}

	public Clases() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdDocente() {
		return idDocente;
	}

	public void setIdDocente(int idDocente) {
		this.idDocente = idDocente;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

}
