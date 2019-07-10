package com.edouard.personnage;

public class Personnage {
	private int largeur, hauteur; 
	private int x,y;
	private boolean marche;
	private boolean versDroite;
	private int compteur;



/*********	Constructeur	**************/
public Personnage (int x, int y, int largeur, int hauteur) {
	
	this.x = x;
	this.y = y;
	this.largeur = largeur;
	this.hauteur = hauteur;
	this.compteur = 0;
	this.marche = false;
	this.versDroite = true;
	}


/*******   getters *****/
public int getLargeur() {return largeur;}
public void setLargeur(int largeur) {this.largeur = largeur;}
public int getHauteur() {return hauteur;}
public void setHauteur(int hauteur) {this.hauteur = hauteur;}
public int getX() {return x;}
public void setX(int x) {this.x = x;}
public int getY() {return y;}

/*******  Setters *****/

public void setY(int y) {this.y = y;}
public boolean isMarche() {return marche;}
public void setMarche(boolean marche) {this.marche = marche;}
public boolean isVersDroite() {return versDroite;}
public void setVersDroite(boolean versDroite) {this.versDroite = versDroite;}
public int getCompteur() {return compteur;}
public void setCompteur(int compteur) {this.compteur = compteur;}


/*******  Méthodes *****/

}