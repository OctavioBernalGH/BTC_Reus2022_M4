package BTC_Reus2022_M4.tiktaktok.Class;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * @author Josep Oriol L�pez Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 * @version 0.0.1
 * @date 05/05/2022
 */

public class partidaClass {	
	// Creamos variables
	public static char c1 = 'V', c2 = 'V', c3 = 'V' ,c4 = 'V' ,c5 = 'V', c6 = 'V', c7 = 'V', c8 = 'V', c9 = 'V';	
	private int contadorTurnos = 0;
	private int turno = 0; 
	private int ganador = 0;

	
	// Funcion para asignar casillas
	public static boolean asignarValoresAChars(List <CasillaClass> listCasillas){
		boolean flag = false;
		
		c1=listCasillas.get(0).getMarcadoCon();
		c2=listCasillas.get(1).getMarcadoCon();
		c3=listCasillas.get(2).getMarcadoCon();
		c4=listCasillas.get(3).getMarcadoCon();
		c5=listCasillas.get(4).getMarcadoCon();
		c6=listCasillas.get(5).getMarcadoCon();
		c7=listCasillas.get(6).getMarcadoCon();
		c8=listCasillas.get(7).getMarcadoCon();
		c9=listCasillas.get(8).getMarcadoCon();

		// Comprobamos ganador
		if (!comprobarGanador().equals("")) {
			JOptionPane.showMessageDialog(null, "Gana: "+ comprobarGanador());
			
			flag = true;
		}
		return flag;

	}

	// Funcion para ver quien a ganado
	public static String comprobarGanador() {
		String ganador = "";
		// COMPROBAR GANADOR X
		if ((c1 == ('X')) && (c2 == ('X')) && (c3 == ('X'))) /* HORIZONTAL*/{
			ganador = "Jugador 1";
		} else if ((c4 == ('X')) && (c5 == ('X')) && (c6 == ('X'))) {
			ganador = "Jugador 1";
		} else if ((c7 == ('X')) && (c8 == ('X')) && (c9 == ('X'))) {			
			ganador = "Jugador 1";
		} else if ((c1 == ('X')) && (c4 == ('X')) && (c7 == ('X'))) /* VERTICAL*/{
			ganador = "Jugador 1";
		} else if ((c2 == ('X')) && (c5 == ('X')) && (c8 == ('X'))) {
			ganador = "Jugador 1";
		} else if ((c3 == ('X')) && (c6 == ('X')) && (c9 == ('X'))) {
			ganador = "Jugador 1";
		} else if ((c1 == ('X')) && (c5 == ('X')) && (c9 == ('X'))) /* DIAGONAL*/{
			ganador = "Jugador 1";
		} else if ((c3 == ('X')) && (c5 == ('X')) && (c7 == ('X'))) {
			ganador = "Jugador 1";
		}

		// COMPROBAR GANADOR Y
		if ((c1 == ('Y')) && (c2 == ('Y')) && (c3 == ('Y'))) /* HORIZONTAL*/{
			ganador = "Jugador 2";
		} else if ((c4 == ('Y')) && (c5 == ('Y')) && (c6 == ('Y'))) {
			ganador = "Jugador 2";
		} else if ((c7 == ('Y')) && (c8 == ('Y')) && (c9 == ('Y'))) {			
			ganador = "Jugador 2";
		} else if ((c1 == ('Y')) && (c4 == ('Y')) && (c7 == ('Y'))) /* VERTICAL*/{
			ganador = "Jugador 2";
		} else if ((c2 == ('Y')) && (c5 == ('Y')) && (c8 == ('Y'))) {
			ganador = "Jugador 2";
		} else if ((c3 == ('Y')) && (c6 == ('Y')) && (c9 == ('Y'))) {
			ganador = "Jugador 2";
		} else if ((c1 == ('Y')) && (c5 == ('Y')) && (c9 == ('Y'))) /* DIAGONAL*/{
			ganador = "Jugador 2";
		} else if ((c3 == ('Y')) && (c5 == ('Y')) && (c7 == ('Y'))) {
			ganador = "Jugador 2";
		}
		return ganador;
	}

	// Creamos Getters y Setters
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