package com.edouard.jeu;

import javax.swing.JFrame;

public class Main {

	 public static Scene scene;
	 
	public static void main(String[] args) {
	/** La classe scene est d�clar�e en public static afin que l'on puisse y acc�der a nimporte quelle classe ***/	
		 // cr�ation de la fen�tre d'application
		
		
	       
	       JFrame fenetre = new JFrame("Jeu Mario by Edouard"); // titre principale
	       fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// arrret du jeu lors de la fermeture de la fen�tre
	       fenetre.setSize(700, 360);//dimension de la fen�tre
	       fenetre.setLocationRelativeTo(null);// centr� � l'�cran
	       fenetre.setResizable(false);// interdiction de redimentionner la fen�tre
	       fenetre.setAlwaysOnTop(true);// la fenetre est toujours en premi�re vue
	       
	    // cr�ation d'une instance de l'objet scene	       
	       scene = new Scene();
	       
	       fenetre.setContentPane(scene);// permet d'associer la scene � la fenetre de l'application
	       fenetre.setVisible(true); // scene visible

	}

}
