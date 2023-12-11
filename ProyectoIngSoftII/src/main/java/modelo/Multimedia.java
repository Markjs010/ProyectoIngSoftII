package modelo;


public class Multimedia implements Data{
	
	private String informacion;

	public Multimedia(String informacion) {
		super();
		this.informacion = informacion;
	}

	public Multimedia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getInformacion() {
		return informacion;
	}

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}
	
	
}
