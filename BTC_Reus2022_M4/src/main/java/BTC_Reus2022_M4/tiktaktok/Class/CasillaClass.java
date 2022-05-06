package BTC_Reus2022_M4.tiktaktok.Class;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CasillaClass extends JButton{
	
	private int idCasilla = 0;
	//Estate of the field using getter and setter
	private char marcadoCon ='V';
	private int width=100,height=100;
	public Image imgEmpty 	= new ImageIcon(this.getClass().getResource("/img/img_empty.png")).getImage();
	public Image imgX 		= new ImageIcon(this.getClass().getResource("/img/img_x.png")).getImage();
	public Image imgY 		= new ImageIcon(this.getClass().getResource("/img/img_y.png")).getImage();
	public ImageIcon iconEmpty = scaleImage(imgEmpty);
	public ImageIcon iconX = scaleImage(imgX) ;
	public ImageIcon iconY = scaleImage(imgY);
	
	
//Constructor

	/**
	 * 
	 * @param idCasilla  	- Position of field
	 * @param marcadoCon 	- State of field
	 * @param width			- Dimension of image Width
	 * @param height		- Dimension of image Height
	 * @param imgEmpty		- Initial image empty
	 */
	
	public CasillaClass(int idCasilla, int width, int height) {
		super();
		this.idCasilla = idCasilla;
		this.width = 100;
		this.height = 100;
		this.setIcon(iconEmpty);
	}
	
//Functions
	//Change the value of the field on image and value
	public void marcadoCasilla(int jugador) {
		
		switch(jugador) {
			case 1:
				this.setIcon(iconX);
				this.marcadoCon = 'X';
				break;
			case 2:
				this.setIcon(iconY);
				this.marcadoCon = 'Y';
				break;	
			case 3:
			this.setIcon(iconEmpty);
			this.marcadoCon = 'V';
			break;
		}
	}
	//Change to empty
	public void setVacio() {
		this.setIcon(iconEmpty);
		
	}
	
	/**
	 * 
	 * @param Image
	 * @return image scaled in ImageIconFormat
	 */
		public ImageIcon scaleImage(Image imageOriginal) {
			
			ImageIcon imgScaled 	= null;
			Image imgProcess		= null;
		
			imgProcess = imageOriginal.getScaledInstance(this.width, this.height, ABORT);
			imgScaled = new ImageIcon(imgProcess);
			
			return imgScaled;
		}

	public int getIdCasilla() {
		return idCasilla;
	}

	public void setIdCasilla(int idCasilla) {
		this.idCasilla = idCasilla;
	}

	public char getMarcadoCon() {
		return marcadoCon;
	}

	public void setMarcadoCon(char marcadoCon) {
		this.marcadoCon = marcadoCon;
	}

	public ImageIcon getImgEmpty() {
		return iconEmpty;
	}

	public void setImgEmpty(ImageIcon imgEmpty) {
		this.iconEmpty = imgEmpty;
	}

	public ImageIcon getImgX() {
		return iconX;
	}

	public void setImgX(ImageIcon imgX) {
		this.iconX = imgX;
	}

	public ImageIcon getImgY() {
		return iconY;
	}

	public void setImgY(ImageIcon imgY) {
		this.iconY = imgY;
	}

	public Image getImgInit() {
		return imgEmpty;
	}

	public void setImgInit(Image imgInit) {
		this.imgEmpty = imgInit;
	}

	
//Getters and Setters

}
