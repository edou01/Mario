package com.edouard.jeu;

import javax.swing.JFrame;

public class Main {

	 public static Scene scene;
	 
	public static void main(String[] args) {
	/** La classe scene est déclarée en public static afin que l'on puisse y accéder a nimporte quelle classe ***/	
		 // création de la fenêtre d'application
		
		
	       
	       JFrame fenetre = new JFrame("Jeu Mario by Edouard"); // titre principale
	       fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// arrret du jeu lors de la fermeture de la fenêtre
	       fenetre.setSize(700, 360);//dimension de la fenêtre
	       fenetre.setLocationRelativeTo(null);// centré à l'écran
	       fenetre.setResizable(false);// interdiction de redimentionner la fenêtre
	       fenetre.setAlwaysOnTop(true);// la fenetre est toujours en première vue
	       
	    // création d'une instance de l'objet scene	       
	       scene = new Scene();
	       
	       fenetre.setContentPane(scene);// permet d'associer la scene à la fenetre de l'application
	       fenetre.setVisible(true); // scene visible

	}

}
