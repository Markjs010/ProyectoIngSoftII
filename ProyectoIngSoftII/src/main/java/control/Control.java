package control;

import modelo.Data;

public interface Control {
	// Falta data como un Array de preguntas, podria ser array de prestamos
	public Data ejecutaComando(String c, Data d, Data d2);
	void setCP(Control c);
}
