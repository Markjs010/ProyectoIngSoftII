package modelo;

public class Administrador implements Data{
	private String usuario, pass;
	
	public Administrador(String usuario, String pass) {
		super();
		this.usuario= usuario;
		this.pass = pass;
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

}
