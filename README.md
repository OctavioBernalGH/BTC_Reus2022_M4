<table>
 <tr>
    <td width="100px"><img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/></td>
  <td width="1000px"> <h2> Proyecto M4, Juego tic tac toc </h2> </td>
  
 </tr>
</table>
 
[![Java](https://img.shields.io/badge/Java-FrontEnd-informational)]()
[![JBuilder](https://img.shields.io/badge/JBuilder-View-critical)]()
[![JUnit 5](https://img.shields.io/badge/JUnit%205-Testing-success)]()
[![GitHub](https://img.shields.io/badge/GitHub-Repository-lightgrey)]()
[![SQL](https://img.shields.io/badge/SQL-DataBase-yellowgreen)]()
[![Maven](https://img.shields.io/badge/Maven-ProjectStructure-blueviolet)]()
 
Ejercicio tres en raya realizado por los miembros del equipo 1.

  [- J.Oriol López Bosch](https://github.com/mednologic)<br>
  [- Octavio Bernal](https://github.com/OctavioBernalGH)<br>
  [- David Dalmau](https://github.com/DavidDalmauDieguez)

 Este juego es una variante del tres en raya en la cual cabe la posibilidad de jugar las siguientes combinaciones:
  - Jugador vs Jugador.
  - Jugador vs Maquina.
  - Maquina vs Jugador.
  - Maquina vs Maquina (proxima mejora).

<p align="justify">El jugador o máquina solo podrá tener en campo un máximo de 3 fichas de forma simultánea, cuando se llegue a 3 fichas el jugador/máquina debera retirar una de sus fichas y posicionarla en otro lugar. Ambos jugadores podrán introducir su nombre y cuando alguno de los dos gane saldrá un mensaje indicando quién ha ganado.</p>

<p align="justify">El programa se ha estructurado de la siguiente forma, primero de todo se define el proyecto con Maven para tener un punto de partida, a continuación se crearan tres paquetes para dividir el código, el paquete class donde irán las clases de PersonaClass, CasillaClass y PartidaClass, el paquete view donde irá la vista y el paquete img donde estarán almacenadas las imagenes utilizadas en el proyecto.</p>

<p align="justify">Una vez estén las clases creada se procederá a generar el código en la vista, este proyecto comienza por aquí, se definirán sus componentes como en este caso son los JButtons, los textFields, los radioButtons y las JLabels. Una vez estén creados los componentes que formarán la vista, se les asignará un identificador descriptivo.</p>

En el siguiente desplegable se puede observar el código generado en la clase de la vista llamada VistaClass.Java.

<details>
 <summary>Desplegable clase VistaClass.Java</summary>
 
 <br>
 
 ```java
package BTC_Reus2022_M4.tiktaktok.View;

/**
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 * @version 0.0.1
 * @date 05/05/2022
 */
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import BTC_Reus2022_M4.tiktaktok.Class.CasillaClass;
import BTC_Reus2022_M4.tiktaktok.Class.PersonaClass;
import BTC_Reus2022_M4.tiktaktok.Class.partidaClass;

public class VistaClass implements ActionListener{
	
	public Random rand = new Random();

	private JFrame frame;
	private JTextField txt_Nombre_Jugador_1;
	private JTextField txt_Nombre_Jugador_2;
	private final int WIDTH=100;
	private final int HEIGHT=100;
	public CasillaClass casilla;
	public CasillaClass btn_1;
	public CasillaClass btn_2;
	public CasillaClass btn_3;
	public CasillaClass btn_4;
	public CasillaClass btn_5;
	public CasillaClass btn_6;
	public CasillaClass btn_7;
	public CasillaClass btn_8;
	public CasillaClass btn_9;

	public PersonaClass jugador1;
	public PersonaClass jugador2;
	public partidaClass partidaActiva;
	
	int fichasPlayer1	=0;
	int fichasPlayer2	=0;
	int fichasCPU1		=0;
	int fichasCPU2		=0;
	
	JRadioButton radio_Humano_Jugador_2;
	JRadioButton radio_Humano_Jugador_1;
	
	public List <CasillaClass> listCasillas = new ArrayList<CasillaClass>();
	public List <CasillaClass> casillasVaciasList = new ArrayList<CasillaClass>();
	public List <CasillaClass> casillasXList = new ArrayList<CasillaClass>();
	public List <CasillaClass> casillasYList = new ArrayList<CasillaClass>();	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaClass window = new VistaClass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VistaClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		

		//Declaration	
		frame = new JFrame();
		frame.setBounds(100, 100, 769, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		btn_1 									= new CasillaClass(0,WIDTH, HEIGHT);// Posición fila 1 columna 1
		btn_2 									= new CasillaClass(1,WIDTH, HEIGHT);// Posición fila 1 columna 2
		btn_3 									= new CasillaClass(2,WIDTH, HEIGHT);// Posición fila 1 columna 3
		btn_4 									= new CasillaClass(3,WIDTH, HEIGHT);// Posición fila 2 columna 1
		btn_5 									= new CasillaClass(4,WIDTH, HEIGHT);// Posición fila 2 columna 2
		btn_6 									= new CasillaClass(5,WIDTH, HEIGHT);// Posición fila 2 columna 3
		btn_7 									= new CasillaClass(6,WIDTH, HEIGHT);// Posición fila 3 columna 1
		btn_8 									= new CasillaClass(7,WIDTH, HEIGHT);// Posición fila 3 columna 2
		btn_9 									= new CasillaClass(8,WIDTH, HEIGHT);// Posición fila 3 columna 3
		
		JButton btn_Nueva_Partida 				= new JButton("Nueva Partida");
		btn_Nueva_Partida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevaPartida();
			}
		});
		JLabel lbl_Jugador_1 					= new JLabel("Jugador 1");
		JLabel lbl_Nombre_Jugador_1 			= new JLabel("Nombre");
		JLabel lbl_Jugador_2 					= new JLabel("Jugador 2");
		txt_Nombre_Jugador_1 					= new JTextField();
		JLabel lbl_Nombre_Jugador_2 			= new JLabel("Nombre");
		JLabel lbl_Tipo_Jugador_1 				= new JLabel("Tipo:");
		JLabel lbl_Tipo_Jugador_2 				= new JLabel("Tipo:");
		radio_Humano_Jugador_1 	= new JRadioButton("Humano");// Adding radioButton  jugador 1 al grupo de botones.
		radio_Humano_Jugador_1.setSelected(true);
		JRadioButton radio_CPU_Jugador_1 		= new JRadioButton("CPU");
		radio_Humano_Jugador_2 	= new JRadioButton("Humano");// Adding radioButton  jugador 2 al grupo de botones.
		radio_Humano_Jugador_2.setSelected(true);
		JRadioButton radio_CPU_Jugador_2 		= new JRadioButton("CPU");
		ButtonGroup grupoRadioButtonJugador1 	= new ButtonGroup();// Se crea una instancia de la clase ButtonGroup para el jugador 1.
		ButtonGroup grupoRadioButtonJugador2 	= new ButtonGroup();// Se crea una instancia de la clase ButtonGroup para el jugador 2.
		txt_Nombre_Jugador_2 					= new JTextField();
		JButton btn_Comenzar_Partida 			= new JButton("Comenzar Partida");
		asignarCasillaAList();
		//Seteamos todas las casillas en false a la espera de una nueva partida
		for(CasillaClass casilla: listCasillas) {
					casilla.setEnabled(false);
				}

		//Parameterizing		
		btn_1.setBounds(10, 10, WIDTH, HEIGHT);
		btn_2.setBounds(120, 10, WIDTH, HEIGHT);
		btn_3.setBounds(230, 10, WIDTH, HEIGHT);
		btn_4.setBounds(10, 120, WIDTH, HEIGHT);
		btn_5.setBounds(120, 120, WIDTH, HEIGHT);
		btn_6.setBounds(230, 120, WIDTH, HEIGHT);
		btn_7.setBounds(10, 230, WIDTH, HEIGHT);
		btn_8.setBounds(120, 230, WIDTH, HEIGHT);
		btn_9.setBounds(230, 230, WIDTH, HEIGHT);
		btn_Nueva_Partida.setBounds(420, 252, 137, 23);
		lbl_Jugador_1.setBounds(382, 38, 63, 14);
		lbl_Nombre_Jugador_1.setBounds(382, 63, 63, 14);
		txt_Nombre_Jugador_1.setBounds(455, 60, 128, 20);
		txt_Nombre_Jugador_1.setColumns(10);
		lbl_Jugador_2.setBounds(382, 149, 63, 14);
		lbl_Nombre_Jugador_2.setBounds(382, 174, 63, 14);
		txt_Nombre_Jugador_2.setColumns(10);
		txt_Nombre_Jugador_2.setBounds(455, 171, 128, 20);
		lbl_Tipo_Jugador_1.setBounds(382, 108, 46, 14);
		lbl_Tipo_Jugador_2.setBounds(382, 214, 46, 14);
		radio_Humano_Jugador_1.setBounds(455, 104, 85, 23);
		radio_CPU_Jugador_1.setBounds(602, 104, 74, 23);
		radio_Humano_Jugador_2.setBounds(455, 210, 85, 23);
		radio_CPU_Jugador_2.setBounds(602, 210, 74, 23);
		btn_Comenzar_Partida.setBounds(420, 286, 137, 23);

		//ActionListeners
		btn_1.addActionListener(this);
		btn_2.addActionListener(this);
		btn_3.addActionListener(this);
		btn_4.addActionListener(this);
		btn_5.addActionListener(this);
		btn_6.addActionListener(this);
		btn_7.addActionListener(this);
		btn_8.addActionListener(this);
		btn_9.addActionListener(this);


		//Adding to content Panel the components
		grupoRadioButtonJugador1.add(radio_Humano_Jugador_1);
		grupoRadioButtonJugador1.add(radio_CPU_Jugador_1);
		grupoRadioButtonJugador2.add(radio_Humano_Jugador_2);
		grupoRadioButtonJugador2.add(radio_CPU_Jugador_2);
		frame.getContentPane().add(txt_Nombre_Jugador_1);
		frame.getContentPane().add(btn_Comenzar_Partida);
		frame.getContentPane().add(radio_CPU_Jugador_2);
		frame.getContentPane().add(radio_Humano_Jugador_2);
		frame.getContentPane().add(radio_CPU_Jugador_1);
		frame.getContentPane().add(radio_Humano_Jugador_1);
		frame.getContentPane().add(lbl_Tipo_Jugador_2);
		frame.getContentPane().add(lbl_Tipo_Jugador_1);
		frame.getContentPane().add(txt_Nombre_Jugador_2);
		frame.getContentPane().add(lbl_Nombre_Jugador_2);
		frame.getContentPane().add(lbl_Jugador_2);
		frame.getContentPane().add(lbl_Nombre_Jugador_1);
		frame.getContentPane().add(lbl_Jugador_1);
		frame.getContentPane().add(btn_Nueva_Partida);
		frame.getContentPane().add(btn_9);
		frame.getContentPane().add(btn_8);
		frame.getContentPane().add(btn_7);
		frame.getContentPane().add(btn_6);
		frame.getContentPane().add(btn_5);
		frame.getContentPane().add(btn_4);
		frame.getContentPane().add(btn_3);
		frame.getContentPane().add(btn_2);
		frame.getContentPane().add(btn_1);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Getting info from the event
		CasillaClass btnPress = (CasillaClass)e.getSource();
		//Getting the text of the widget
		int name = btnPress.getIdCasilla();
		//Switching the action request
		switch(name) {
		case 0:
			jugada(btn_1);
			break;
		case 1:
			jugada(btn_2);
			break;
		case 2:
			jugada(btn_3);
			break;
		case 3:
			jugada(btn_4);
			break;
		case 4:
			jugada(btn_5);
			break;
		case 5:
			jugada(btn_6);
			break;
		case 6:
			jugada(btn_7);
			break;
		case 7:
			jugada(btn_8);
			break;
		case 8:
			jugada(btn_9);
			break;
		}

	}

	/**
	 * 
	 */
	public void jugada(CasillaClass casillaActiva) {
		//Switch para determinar el jugador
		switch(quienVa()) {
			case 1: //Player 1
				turno(casillaActiva, 'X', fichasPlayer1);
				//TODO: SI JUGADOR 1 ES ROBOT JUGADA RANDDOM
				
				if(jugador2.getTipoJugador()==1) {
					turnoCPU(2, fichasCPU2);
				}
				break;
			case 2:
				
				if(jugador2.getTipoJugador()==1) {
					//Generating a random choose of field
					int casillaRandom = (int)Math.floor(Math.random()*(8-0+1)+0);
				
					turno(listCasillas.get(casillaRandom), 'Y', fichasPlayer1);
				}else {
					turno(casillaActiva, 'Y', fichasPlayer2);
				}
				break;
		}
	}
	public void turno(CasillaClass casillaActiva, char valorFicha, int fichasPlayer) {
			
			if(casillaActiva.getMarcadoCon()=='V') { //Casilla vacia
				if(fichasPlayer<3) {//Jugador tiene menos de 3 fichas
			
					//Todo setFicha y cambiar turno
					casillaActiva.marcadoCasilla(quienVa());
					if(valorFicha=='X') {
						fichasPlayer1++;
					}else {
						fichasPlayer2++;
					}
		
					comprobarGanador();
					cambiarTurno();
				}
			}else {//Esta marcada con x o Y
				if(fichasPlayer==3) {//Si el jugador tiene 3 en el tablero
					if(casillaActiva.getMarcadoCon()==valorFicha) {
						casillaActiva.setVacio();
						if(valorFicha=='X') {
							fichasPlayer1--;
						}else {
							fichasPlayer2--;
						}
					}
					
				}
				
			}
		}
	public void turnoCPU(int valorFicha, int fichasPlayer) {
		int numRandom;
		//casillasVaciasList = new ArrayList <CasillaClass>();
		if(fichasCPU2<3) {
			//Buscamos las casillas vacias
			listarCasillasVacias();
			numRandom= rand.nextInt(casillasVaciasList.size());
			//De las casillas vacias elegimos una random
			casillasVaciasList.get(numRandom).marcadoCasilla(valorFicha);
			fichasCPU2++;
			comprobarGanador();
			
			cambiarTurno();
		}else{
			//Buscamos las casillas con la Y
			listarCasillasY();
			numRandom= rand.nextInt(casillasYList.size());
			//elegimos una de ellas random y la vaciamos
			casillasYList.get(numRandom).setVacio();
			fichasCPU2--;
			//Buscamos las casillas vacias
			listarCasillasVacias();
			numRandom= rand.nextInt(casillasVaciasList.size());
			//De las casillas vacias elegimos una random        
			casillasVaciasList.get(numRandom).marcadoCasilla(valorFicha);
			fichasCPU2++;
			comprobarGanador();
			
			cambiarTurno();
		}
		
	}
	private void listarCasillasX() {
		casillasXList.clear();
		for(CasillaClass casilla : listCasillas) {
			//TODO: limpiarArray;
			if(casilla.getMarcadoCon()=='X') {
				casillasXList.add(casilla);
			}
		}
	}
	private void listarCasillasY() {
		casillasYList.clear();
		for(CasillaClass casilla : listCasillas) {
			//TODO: limpiarArray;
			if(casilla.getMarcadoCon()=='Y') {
				casillasYList.add(casilla);
			}
		}
	}
	private void listarCasillasVacias() {
		casillasVaciasList.clear();
		for(CasillaClass casilla : listCasillas) {
			//TODO: limpiarArray;
			if(casilla.getMarcadoCon()=='V') {
				casillasVaciasList.add(casilla);
			}
		}
	}
	private void setFichaMenor3(int fichasPlayer, int numRandom, int valorFicha) {
		
		//Jugador tiene menos de 3 fichas
		
				
		//SetFicha y cambiar turno
				listCasillas.get(numRandom).marcadoCasilla(valorFicha);
				comprobarGanador();	
				fichasCPU1++;
				cambiarTurnoCPU();
				//cambiarTurno();
		
	}

	private void setCasillaYCambioTurno(int numRandom, int valorFicha ) {
		listCasillas.get(numRandom).marcadoCasilla(valorFicha);
		fichasCPU1++;
		cambiarTurno();
	}

	//Funcion para saber si la casilla esta llena
	private Boolean casillaLlena(int numRandom) {
		boolean flag = false;
		if(!casillaRandomVacia(numRandom)) {
			flag = true;
		}
		return flag;
	}

	private boolean casillaRandomVacia(int numRandom) {
	
		return listCasillas.get(numRandom).getMarcadoCon()=='V';
		
	}


	public void nuevaPartida() {
		//Control for kind of players
		fichasPlayer1	=0;
		fichasPlayer2	=0;
		fichasCPU1		=0;
		fichasCPU2		=0;
		int cpu1=0;
		int cpu2=0;
		if(!radio_Humano_Jugador_1.isSelected()) {
			cpu1=1;
		}
		if(!radio_Humano_Jugador_2.isSelected()) {
			cpu2=1;
		}
		jugador1 = new PersonaClass(txt_Nombre_Jugador_1.getText(), cpu1, 0, 'X');
		jugador2 = new PersonaClass(txt_Nombre_Jugador_2.getText(), cpu2, 0, 'Y');
		partidaActiva = new partidaClass();
		JOptionPane.showMessageDialog(null, "Suerte!! Turno de: "+txt_Nombre_Jugador_1.getText());
		for(CasillaClass casilla: listCasillas) {
			casilla.setVacio();
			casilla.setEnabled(true);
		}
		jugador1.setEsTuTurno(true);	
	}
	public void comprobarGanador() {
		partidaClass.asignarValoresAChars(listCasillas);
	}

	// Asignamos los valores de la lista a cada boton
	public void asignarCasillaAList() {
		listCasillas.add(btn_1);
		listCasillas.add(btn_2);
		listCasillas.add(btn_3);
		listCasillas.add(btn_4);
		listCasillas.add(btn_5);
		listCasillas.add(btn_6);
		listCasillas.add(btn_7);
		listCasillas.add(btn_8);
		listCasillas.add(btn_9);
		
		
	}
	
	// Funcion para los turnos de los jugadores
	public int quienVa() {
		if(jugador1.getEsTuTurno()) {
			return 1; // Jugador1	
		} else {
			return 2; // Jugador2
		}

	}

	// Funcion para ver los valores de las casillas
	public boolean comprobarNumeroCasillasJugador(PersonaClass jugadorN) {
		boolean flag = false;
		if(jugadorN.getFichasPosicionadas() < 3) {
			flag = true;

		}
		return flag;
	}

	// Funcion para ver de quien es el turno
	public PersonaClass quienVaPersonaClass() {
		if(jugador1.getEsTuTurno()) {
			return jugador1; // Jugador1	
		} else {
			return jugador2; // Jugador2
		}

	}
	
	// Funcion para saber que la casilla esta vacia
	public boolean comprobarFichaVacia(CasillaClass casillaAComprobar) {
		boolean flag = false;

		if (casillaAComprobar.getMarcadoCon() == 'V') {
			flag = true;
		}
		return flag;
	}

	// Comprueba que la casilla tenga o una X o una Y
	public char comprobarFichaXY(CasillaClass casillaComprobar) {
		char flag = 'A';

		if (casillaComprobar.getMarcadoCon() == 'X') {
			flag = 'X';
		} else {
			flag = 'Y';
		}

		return flag;

	}
	public void cambiarTurnoCPU() {
		
			jugador1.setEsTuTurno(true);
			jugador2.setEsTuTurno(false);
		
	}
	// Funcion para el cambio de turno
	public void cambiarTurno() {
		if (jugador1.getEsTuTurno()) {
			jugador2.setEsTuTurno(true);
			jugador1.setEsTuTurno(false);
		} else {
			jugador1.setEsTuTurno(true);
			jugador2.setEsTuTurno(false);
		}
	}
}
 
 ```
 
</details>

Una vez se ha generado el código de la vista, el resultado sería el siguiente:
	
![image](https://user-images.githubusercontent.com/103035621/167820394-32a1ddc3-cc51-422c-8b8d-49a83894c03b.png)
	
Las imagenes utilizadas serán las siguientes:
	
![img_x](https://user-images.githubusercontent.com/103035621/167822152-eb987709-092a-4c99-b5cc-7b769ad80f4b.png)
![img_y](https://user-images.githubusercontent.com/103035621/167822157-70e31c96-c213-48f5-8193-f31ff2346323.png)
![img_empty](https://user-images.githubusercontent.com/103035621/167822160-d65d76d8-8778-4b29-a99e-ac3da928b77d.png)

<p align="justify">Lo siguiente será crear la clase PersonaClass, esta clase será la estructura de los objetos persona creados para jugar una partida, para ello se definen atributos de clase, los getters y setters de los atributos y un constructor de clase con los parámetros necesarios para el flujo de programa.</p>

En el siguiente desplegable se muestra el código generado en la clase PersonaClass.
	
<details>
	<summary>Desplegable clase PersonaClass.Java</summary>
<br>	
	
```java
	
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
	private String nombre = ""; //Name of the gamer
	private int tipoJugador = 0; //0 person, 1 cpu
	private int fichasPosicionadas = 0; //Number of "fichas on the board"
	private char fichaAsociada = 'V'; //Kind of "ficha" 'x' or 'y'
	private boolean esTuTurno = false;

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
	
	public boolean getEsTuTurno() {
		return esTuTurno;
	}
	
	public void setEsTuTurno(boolean esTuTurno) {
		this.esTuTurno = esTuTurno;
	}

	}
```
	
</details>	
	
En la siguiente imagen se puede visualizar el comienzo de una partida de ejemplo, el usuario pondrá su nombre y seleccionará contra máquina.

![image](https://user-images.githubusercontent.com/103035621/167817407-bd9ab7f5-d406-4ca8-bce1-e2743c72b2f0.png)

Se realizará un movimiento del jugador1 y automáticamente la CPU movera ficha:

![image](https://user-images.githubusercontent.com/103035621/167817808-7913c25e-09fb-44d9-8b99-772efff42960.png)

Y por último el jugador1 gana la partida con un movimiento decisivo.

![image](https://user-images.githubusercontent.com/103035621/167818039-9e5ef6ee-e902-4c5f-9181-26123ce7780d.png)

