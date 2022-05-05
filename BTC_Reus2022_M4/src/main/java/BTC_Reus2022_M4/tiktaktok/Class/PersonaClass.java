package BTC_Reus2022_M4.tiktaktok.Class;

public class PersonaClass {

	// Se definen los atributos de clase
	private String nombre = "";
	private boolean tipoJugador = false;
	private int fichasPosicionadas = 0;
	private char fichaAsociada = 'V';

	// Se define constructor de clase con todos los parámetros
	public PersonaClass(String nombre, boolean tipoJugador, int fichasPosicionadas, char fichaAsociada) {
		this.nombre = nombre;
		this.tipoJugador = tipoJugador;
		this.fichasPosicionadas = fichasPosicionadas;
		this.fichaAsociada = fichaAsociada;
	}

}
