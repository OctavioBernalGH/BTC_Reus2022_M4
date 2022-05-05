package BTC_Reus2022_M4.tiktaktok.Class;

/**
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 * @version 0.0.1
 * @date 05/05/2022
 */
public class PersonaClass {

	// Se definen los atributos de clase
	private String nombre = "";
	private int tipoJugador = 0;
	private int fichasPosicionadas = 0;
	private char fichaAsociada = 'V';

	// Se define constructor de clase con todos los parámetros
	public PersonaClass(String nombre, int tipoJugador, int fichasPosicionadas, char fichaAsociada) {
		this.nombre = nombre;
		this.tipoJugador = tipoJugador;
		this.fichasPosicionadas = fichasPosicionadas;
		this.fichaAsociada = fichaAsociada;
	}

	// Se definen los Getters & Setters de todos los atributos de clase.
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the tipoJugador
	 */
	public int getTipoJugador() {
		return tipoJugador;
	}

	/**
	 * @param tipoJugador the tipoJugador to set
	 */
	public void setTipoJugador(int tipoJugador) {
		this.tipoJugador = tipoJugador;
	}

	/**
	 * @return the fichasPosicionadas
	 */
	public int getFichasPosicionadas() {
		return fichasPosicionadas;
	}

	/**
	 * @param fichasPosicionadas the fichasPosicionadas to set
	 */
	public void setFichasPosicionadas(int fichasPosicionadas) {
		this.fichasPosicionadas = fichasPosicionadas;
	}

	/**
	 * @return the fichaAsociada
	 */
	public char getFichaAsociada() {
		return fichaAsociada;
	}

	/**
	 * @param fichaAsociada the fichaAsociada to set
	 */
	public void setFichaAsociada(char fichaAsociada) {
		this.fichaAsociada = fichaAsociada;
	}

}
