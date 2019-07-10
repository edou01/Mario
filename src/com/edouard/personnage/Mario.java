package com.edouard.personnage;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Mario extends Personnage{

	private Image imgMario;
	private ImageIcon icoMario;
	
	
	/*******  Constructeurs *****/
	
		public Mario (int x, int y) {
			
			super(x, y, 28, 50);
			this.icoMario = new ImageIcon("src/img/marioMarcheDroite.png");
			this.imgMario = this.icoMario.getImage();
		}

		/*******  Getters *****/
	public Image getImgMario() {return imgMario;}
		
	/*******  Setters *****/
	
	/*******  Methodes *****/
	
}
