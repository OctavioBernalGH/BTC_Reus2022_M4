package BTC_Reus2022_M4.tiktaktok.Class;

import java.util.Iterator;

/**
 * @author Josep Oriol L�pez Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 * @version 0.0.1
 * @date 05/05/2022
 */

public class partidaClass {	
	private char c1 = 'V', c2 = 'V', c3 = 'V' ,c4 = 'V' ,c5 = 'V', c6 = 'V', c7 = 'V', c8 = 'V', c9 = 'V';	
	private int contadorTurnos = 0;
	private int turno = 0; 
	private int ganador = 0;

	private void turnosPartida() {
		
	}	
	
	// Funcion para el boton de reiniciar
	private void reiniciarPartida() {

	}

	// Funcion para contar las fichas de cada jugador
	private void comprobarCantidadFichas() {

	}

	// Funcion para ver quien a ganado
	public char comprobarGanador() {

		char ganador = 'A';
		// COMPROBAR GANADOR X
		if ((c1 == ('X')) && (c2 == ('X')) && (c3 == ('X'))) /* HORIZONTAL*/{
			ganador = 'X';
		} else if ((c4 == ('X')) && (c5 == ('X')) && (c6 == ('X'))) {
			ganador = 'X';
		} else if ((c7 == ('X')) && (c8 == ('X')) && (c9 == ('X'))) {			
			ganador = 'X';
		} else if ((c1 == ('X')) && (c4 == ('X')) && (c7 == ('X'))) /* VERTICAL*/{
			ganador = 'X';
		} else if ((c2 == ('X')) && (c5 == ('X')) && (c8 == ('X'))) {
			ganador = 'X';
		} else if ((c3 == ('X')) && (c6 == ('X')) && (c9 == ('X'))) {
			ganador = 'X';
		} else if ((c1 == ('X')) && (c5 == ('X')) && (c9 == ('X'))) /* DIAGONAL*/{
			ganador = 'X';
		} else if ((c3 == ('X')) && (c5 == ('X')) && (c7 == ('X'))) {
			ganador = 'X';
		}

		// COMPROBAR GANADOR Y
		if ((c1 == ('Y')) && (c2 == ('Y')) && (c3 == ('Y'))) /* HORIZONTAL*/{
			ganador = 'Y';
		} else if ((c4 == ('Y')) && (c5 == ('Y')) && (c6 == ('Y'))) {
			ganador = 'Y';
		} else if ((c7 == ('Y')) && (c8 == ('Y')) && (c9 == ('Y'))) {			
			ganador = 'Y';
		} else if ((c1 == ('Y')) && (c4 == ('Y')) && (c7 == ('Y'))) /* VERTICAL*/{
			ganador = 'Y';
		} else if ((c2 == ('Y')) && (c5 == ('Y')) && (c8 == ('Y'))) {
			ganador = 'Y';
		} else if ((c3 == ('Y')) && (c6 == ('Y')) && (c9 == ('Y'))) {
			ganador = 'Y';
		} else if ((c1 == ('Y')) && (c5 == ('Y')) && (c9 == ('Y'))) /* DIAGONAL*/{
			ganador = 'Y';
		} else if ((c3 == ('Y')) && (c5 == ('Y')) && (c7 == ('Y'))) {
			ganador = 'Y';
		}
		return ganador;
	}

	public int getContadorTurnos() {
		return contadorTurnos;
	}

	public void setContadorTurnos(int contadorTurnos) {
		this.contadorTurnos = contadorTurnos;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public int getGanador() {
		return ganador;
	}

	public void setGanador(int ganador) {
		this.ganador = ganador;
	}

	
	
}


