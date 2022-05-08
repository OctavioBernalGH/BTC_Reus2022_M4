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
	int fichasPlayer1=0;
	int fichasPlayer2=0;

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
		nuevaPartida();

		//Declaration	
		frame = new JFrame();
		
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
		JLabel lbl_Jugador_1 					= new JLabel("Jugador 1");
		JLabel lbl_Nombre_Jugador_1 			= new JLabel("Nombre");
		JLabel lbl_Jugador_2 					= new JLabel("Jugador 2");
		JLabel lbl_Nombre_Jugador_2 			= new JLabel("Nombre");
		JLabel lbl_Tipo_Jugador_1 				= new JLabel("Tipo:");
		JLabel lbl_Tipo_Jugador_2 				= new JLabel("Tipo:");
		JRadioButton radio_Humano_Jugador_1 	= new JRadioButton("Humano");// Adding radioButton  jugador 1 al grupo de botones.
		JRadioButton radio_CPU_Jugador_1 		= new JRadioButton("CPU");
		JRadioButton radio_Humano_Jugador_2 	= new JRadioButton("Humano");// Adding radioButton  jugador 2 al grupo de botones.
		JRadioButton radio_CPU_Jugador_2 		= new JRadioButton("CPU");
		ButtonGroup grupoRadioButtonJugador1 	= new ButtonGroup();// Se crea una instancia de la clase ButtonGroup para el jugador 1.
		ButtonGroup grupoRadioButtonJugador2 	= new ButtonGroup();// Se crea una instancia de la clase ButtonGroup para el jugador 2.
		txt_Nombre_Jugador_1 					= new JTextField();
		txt_Nombre_Jugador_2 					= new JTextField();
		JButton btn_Comenzar_Partida 			= new JButton("Comenzar Partida");

//Action Listener
		
		btn_Nueva_Partida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevaPartida();
			}
		});

		//Parameterizing	
		frame.setBounds(100, 100, 640, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
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
		radio_Humano_Jugador_1.setBounds(455, 104, 75, 23);
		radio_CPU_Jugador_1.setBounds(532, 104, 74, 23);
		radio_Humano_Jugador_2.setBounds(455, 210, 75, 23);
		radio_CPU_Jugador_2.setBounds(532, 210, 74, 23);
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
				break;
			case 2:
				turno(casillaActiva, 'Y', fichasPlayer2);
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
	public void nuevaPartida() {
		jugador1 = new PersonaClass("Jugador 1", 0, 0, 'X');
		jugador2 = new PersonaClass("Jugador 2", 0, 0, 'Y');
		partidaActiva = new partidaClass();

		jugador1.setEsTuTurno(true);

		do {


		} while (partidaActiva.comprobarGanador() == 'X' || partidaActiva.comprobarGanador() == 'Y');		
	}

	public int quienVa() {
		if(jugador1.getEsTuTurno()) {
			return 1; // Jugador1	
		} else {
			return 2; // Jugador2
		}

	}

	public boolean comprobarNumeroCasillasJugador(PersonaClass jugadorN) {
		boolean flag = false;
		if(jugadorN.getFichasPosicionadas() < 3) {
			flag = true;

		}
		return flag;
	}

	public PersonaClass quienVaPersonaClass() {
		if(jugador1.getEsTuTurno()) {
			return jugador1; // Jugador1	
		} else {
			return jugador2; // Jugador2
		}

	}
	
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
