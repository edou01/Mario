package com.edouard.jeu;

public class Chrono implements Runnable {

	private final int PAUSE = 3;// temps de pause entre deux boucle. 3milisecondes
	
	@Override
	public void run() {
		// méthode run
		while(true) {
			
			/*appel de la scene*/
			Main.scene.repaint();
			//System.out.println("ok");
			/*détermination du temps
			 si l'application fonctionne mal on utilise un try catch (ici on indique rien)
			*/
			try {
				Thread.sleep(PAUSE); // temps de PAUSE de 3s
			} catch (InterruptedException e) {}
		}
		
	}

}
