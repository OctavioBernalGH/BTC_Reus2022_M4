package BTC_Reus2022_M4.tiktaktok.View;

/**
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 * @version 0.0.1
 * @date 05/05/2022
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class VistaClass {

	private JFrame frame;
	private JTextField txt_Nombre_Jugador_1;
	private JTextField txt_Nombre_Jugador_2;

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
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Posición fila 1 columna 1
		JButton btn_1 = new JButton("");
		btn_1.setBounds(10, 10, 100, 100);
		frame.getContentPane().add(btn_1);
		
		// Posición fila 1 columna 2
		JButton btn_2 = new JButton("");
		btn_2.setBounds(120, 10, 100, 100);
		frame.getContentPane().add(btn_2);
		
		// Posición fila 1 columna 3
		JButton btn_3 = new JButton("");
		btn_3.setBounds(230, 10, 100, 100);
		frame.getContentPane().add(btn_3);
		
		// Posición fila 2 columna 1
		JButton btn_4 = new JButton("");
		btn_4.setBounds(10, 120, 100, 100);
		frame.getContentPane().add(btn_4);
		
		// Posición fila 2 columna 2
		JButton btn_5 = new JButton("");
		btn_5.setBounds(120, 120, 100, 100);
		frame.getContentPane().add(btn_5);
		
		// Posición fila 2 columna 3
		JButton btn_6 = new JButton("");
		btn_6.setBounds(230, 120, 100, 100);
		frame.getContentPane().add(btn_6);
		
		// Posición fila 3 columna 1
		JButton btn_7 = new JButton("");
		btn_7.setBounds(10, 230, 100, 100);
		frame.getContentPane().add(btn_7);
		
		// Posición fila 3 columna 2
		JButton btn_8 = new JButton("");
		btn_8.setBounds(120, 230, 100, 100);
		frame.getContentPane().add(btn_8);
		
		// Posición fila 3 columna 3
		JButton btn_9 = new JButton("");
		btn_9.setBounds(230, 230, 100, 100);
		frame.getContentPane().add(btn_9);
		
		JButton btn_Nueva_Partida = new JButton("Nueva Partida");
		btn_Nueva_Partida.setBounds(420, 27, 113, 23);
		frame.getContentPane().add(btn_Nueva_Partida);
		
		JLabel lbl_Jugador_1 = new JLabel("Jugador 1");
		lbl_Jugador_1.setBounds(382, 73, 63, 14);
		frame.getContentPane().add(lbl_Jugador_1);
		
		JLabel lbl_Nombre_Jugador_1 = new JLabel("Nombre");
		lbl_Nombre_Jugador_1.setBounds(382, 98, 63, 14);
		frame.getContentPane().add(lbl_Nombre_Jugador_1);
		
		txt_Nombre_Jugador_1 = new JTextField();
		txt_Nombre_Jugador_1.setBounds(455, 95, 128, 20);
		frame.getContentPane().add(txt_Nombre_Jugador_1);
		txt_Nombre_Jugador_1.setColumns(10);
		
		JLabel lbl_Jugador_2 = new JLabel("Jugador 2");
		lbl_Jugador_2.setBounds(382, 188, 63, 14);
		frame.getContentPane().add(lbl_Jugador_2);
		
		JLabel lbl_Nombre_Jugador_2 = new JLabel("Nombre");
		lbl_Nombre_Jugador_2.setBounds(382, 213, 63, 14);
		frame.getContentPane().add(lbl_Nombre_Jugador_2);
		
		txt_Nombre_Jugador_2 = new JTextField();
		txt_Nombre_Jugador_2.setColumns(10);
		txt_Nombre_Jugador_2.setBounds(455, 210, 128, 20);
		frame.getContentPane().add(txt_Nombre_Jugador_2);
		
		JLabel lbl_Tipo_Jugador_1 = new JLabel("Tipo:");
		lbl_Tipo_Jugador_1.setBounds(382, 136, 46, 14);
		frame.getContentPane().add(lbl_Tipo_Jugador_1);
		
		JLabel lbl_Tipo_Jugador_2 = new JLabel("Tipo:");
		lbl_Tipo_Jugador_2.setBounds(382, 256, 46, 14);
		frame.getContentPane().add(lbl_Tipo_Jugador_2);
		
		JRadioButton radio_Humano_Jugador_1 = new JRadioButton("Humano");
		radio_Humano_Jugador_1.setBounds(455, 132, 75, 23);
		frame.getContentPane().add(radio_Humano_Jugador_1);
		
		JRadioButton radio_CPU_Jugador_1 = new JRadioButton("CPU");
		radio_CPU_Jugador_1.setBounds(532, 132, 74, 23);
		frame.getContentPane().add(radio_CPU_Jugador_1);
		
		JRadioButton radio_Humano_Jugador_2 = new JRadioButton("Humano");
		radio_Humano_Jugador_2.setBounds(455, 252, 75, 23);
		frame.getContentPane().add(radio_Humano_Jugador_2);
		
		JRadioButton radio_CPU_Jugador_2 = new JRadioButton("CPU");
		radio_CPU_Jugador_2.setBounds(532, 252, 74, 23);
		frame.getContentPane().add(radio_CPU_Jugador_2);
		
		// Se crea una instancia de la clase ButtonGroup para el jugador 1.
		ButtonGroup grupoRadioButtonJugador1 = new ButtonGroup();
		// Se añaden los radioButton referentes al jugador 1 al grupo de botones.
		grupoRadioButtonJugador1.add(radio_Humano_Jugador_1);
		grupoRadioButtonJugador1.add(radio_CPU_Jugador_1);
		
		// Se crea una instancia de la clase ButtonGroup para el jugador 2.
		ButtonGroup grupoRadioButtonJugador2 = new ButtonGroup();
		// Se añaden los radioButton referentes al jugador 2 al grupo de botones.
		grupoRadioButtonJugador2.add(radio_Humano_Jugador_2);
		grupoRadioButtonJugador2.add(radio_CPU_Jugador_2);
		
	}
}
