package BTC_Reus2022_M4.tiktaktok.Class;

import java.util.Iterator;

/**
 * @author Josep Oriol López Bosch
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

	private void reiniciarPartida() {
		
	}
	
	private void comprobarCantidadFichas() {
		
	}
	
	private void comprobarGanador() {	
		// COMPROBAR GANADOR X
		if ((c1 == ('X')) && (c2 == ('X')) && (c3 == ('X'))) /* HORIZONTAL*/{
			reiniciarPartida();
		} else if ((c4 == ('X')) && (c5 == ('X')) && (c6 == ('X'))) {
			reiniciarPartida();
		} else if ((c7 == ('X')) && (c8 == ('X')) && (c9 == ('X'))) {			
			reiniciarPartida();
		} else if ((c1 == ('X')) && (c4 == ('X')) && (c7 == ('X'))) /* VERTICAL*/{
			reiniciarPartida();
		} else if ((c2 == ('X')) && (c5 == ('X')) && (c8 == ('X'))) {
			reiniciarPartida();
		} else if ((c3 == ('X')) && (c6 == ('X')) && (c9 == ('X'))) {
			reiniciarPartida();
		} else if ((c1 == ('X')) && (c5 == ('X')) && (c9 == ('X'))) /* DIAGONAL*/{
			reiniciarPartida();
		} else if ((c3 == ('X')) && (c5 == ('X')) && (c7 == ('X'))) {
			reiniciarPartida();
		}
		
		// COMPROBAR GANADOR Y
		if ((c1 == ('Y')) && (c2 == ('Y')) && (c3 == ('Y'))) /* HORIZONTAL*/{
			reiniciarPartida();
		} else if ((c4 == ('Y')) && (c5 == ('Y')) && (c6 == ('Y'))) {
			reiniciarPartida();
		} else if ((c7 == ('Y')) && (c8 == ('Y')) && (c9 == ('Y'))) {			
			reiniciarPartida();
		} else if ((c1 == ('Y')) && (c4 == ('Y')) && (c7 == ('Y'))) /* VERTICAL*/{
			reiniciarPartida();
		} else if ((c2 == ('Y')) && (c5 == ('Y')) && (c8 == ('Y'))) {
			reiniciarPartida();
		} else if ((c3 == ('Y')) && (c6 == ('Y')) && (c9 == ('Y'))) {
			reiniciarPartida();
		} else if ((c1 == ('Y')) && (c5 == ('Y')) && (c9 == ('Y'))) /* DIAGONAL*/{
			reiniciarPartida();
		} else if ((c3 == ('Y')) && (c5 == ('Y')) && (c7 == ('Y'))) {
			reiniciarPartida();
		}
	}
	
}


