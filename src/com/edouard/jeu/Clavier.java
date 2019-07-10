package com.edouard.jeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier implements KeyListener {

	//Appuie sur la touche
	@Override
	public void keyPressed(KeyEvent e) {
		/***Si  ce code est �gale a keyvent_vkright on veut que dx prend 1.
		 * -1 pour que l'�cran se d�place dans l'autre sens**/
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			// annule  le d�calage de 1 cr�e par le d�placement 
			if(Main.scene.getxPos() == -1) {
					Main.scene.setxPos(0);
					Main.scene.setxFond1(-50); // largeur fait 800 -750 = 50
					Main.scene.setxFond2(750);
			}
			Main.scene.setDx(1);
		}else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			Main.scene.setDx(-1);
			}
		
	}

	
	//relanchement de la touche
	@Override
	public void keyReleased(KeyEvent e) {
		
		/** Relanchement de la touche Mario ne bouge plus**/
		Main.scene.setDx(0);
	}

	@Override
	public void keyTyped(KeyEvent e) {}

}
