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
				System.out.println("*********** JUGADOR1  *********** cantidad fichas: "+fichasPlayer1);
				turno(casillaActiva, 'X', fichasPlayer1);
				//TODO: SI JUGADOR 1 ES ROBOT JUGADA RANDDOM
				System.out.println("Tipo jugador 1: "+jugador1.getTipoJugador());
				if(jugador2.getTipoJugador()==1) {
					turnoCPU(2, fichasCPU2);
				}
				break;
			case 2:
				System.out.println("*********** JUGADOR2  ***********");
				System.out.println("Tipo jugador 2: "+jugador2.getTipoJugador());
				
				if(jugador2.getTipoJugador()==1) {
					//Generating a random choose of field
					int casillaRandom = (int)Math.floor(Math.random()*(8-0+1)+0);
					System.out.println("Casilla random= "+casillaRandom);
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
					System.out.println("Jugador tiene menos de 3 fichas");
					//Todo setFicha y cambiar turno
					casillaActiva.marcadoCasilla(quienVa());
					if(valorFicha=='X') {
						fichasPlayer1++;
					}else {
						fichasPlayer2++;
					}
					System.out.println("Cambio Turno");
					System.out.println("sice list"+listCasillas.size());
					comprobarGanador();
					cambiarTurno();
				}
			}else {//Esta marcada con x o Y
				if(fichasPlayer==3) {//Si el jugador tiene 3 en el tablero
					System.out.println("Jugador tiene 3 fichas");
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
		System.out.println("*********** CPU  ***********"+valorFicha);
		
		//Generating random field
		int numRandom = rand.nextInt(9); //cod:001
		System.out.println("cod:001");
		//Casilla vacia?
		if(casillaRandomVacia(numRandom)) { //cod:002
			System.out.println("cod:002");
				//CPU -3 FICHAS
				if(fichasCPU1<3) { //cod:003
					System.out.println("cod:003");
					//Posicionar ficha
					setFichaMenor3(fichasPlayer, numRandom, valorFicha);
					 //setCasillaYCambioTurno(numRandom, valorFicha);
				//CPU +3 FICHAS
				}else {
					//Buscamos una casilla vacia
					do {//cod:006
						System.out.println("cod:006");
						numRandom = rand.nextInt(9);
						if(casillaLlena(numRandom)) {
							System.out.println("Casilla marcada con :"+listCasillas.get(numRandom).getMarcadoCon());
							if(listCasillas.get(numRandom).getMarcadoCon()==valorFicha) {
								
								//VaciamosCasilla
								listCasillas.get(numRandom).setVacio();
							}
						}
					}while(casillaLlena(numRandom));
					
					//comprobar que casilla tenga el valor de la cpu
					if(listCasillas.get(numRandom).getMarcadoCon()==valorFicha) {//cod:007
						System.out.println("cod:007");
						//TODO:VaciarCasilla
						//TODO:Marcar otra casilla vacia
						//TODO:cambio turno
					}
				}
				//setFichaMenor3(fichasPlayer, numRandom, valorFicha);
		//Casilla no vacia
		}else { // cod:005 buscar casilla, desmarcar y buscar otra casilla para marcar
			//System.out.println("cod:005");
			//DOWHILE CASILLA NO VACIA
			do {
				System.out.println("005 :"+(casillaRandomVacia(numRandom)));
				System.out.println("Casilla marcada con :"+listCasillas.get(numRandom).getMarcadoCon());
				numRandom = rand.nextInt(9);
				
			}while(casillaRandomVacia(numRandom)&&listCasillas.get(numRandom).getMarcadoCon()==valorFicha&&fichasCPU1<3);
			listCasillas.get(numRandom).setVacio();	
			fichasCPU1--;
			setCasillaYCambioTurno(numRandom, valorFicha); //cod:fin
			System.out.println("cod:004");
			
		}
	}
	private void setFichaMenor3(int fichasPlayer, int numRandom, int valorFicha) {
		System.out.println("setFichaMenor3");
		//Jugador tiene menos de 3 fichas
		
				System.out.println("Jugador tiene menos de 3 fichas");
		//SetFicha y cambiar turno
				listCasillas.get(numRandom).marcadoCasilla(valorFicha);
				comprobarGanador();
				System.out.println("casilla marcada con "+ btn_2.getMarcadoCon());
				fichasCPU1++;
				System.out.println("numFichas"+ fichasCPU1);
				cambiarTurnoCPU();
				//cambiarTurno();
		
	}

	private void setCasillaYCambioTurno(int numRandom, int valorFicha ) {
		System.out.println("setCasillaYCambioTurno");
		listCasillas.get(numRandom).marcadoCasilla(valorFicha);
		fichasCPU1++;
		//System.out.println("Cambio Turno");
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
		System.out.println("Funcion Casilla vacia: "+(listCasillas.get(numRandom).getMarcadoCon()=='V'));
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
