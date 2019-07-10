package com.edouard.jeu;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.edouard.personnage.Mario;

@SuppressWarnings("serial")
public class Scene extends JPanel{
	
	 private ImageIcon icoFond;
     private Image imgFond1;
     private Image imgFond2;
     
     private ImageIcon icoChateau1;
     private Image imgChateau1;
     private ImageIcon icoDepart;
     private Image imgDepart;
     
     /*
     private ImageIcon icoMario;
     private Image imgMario;
     */
     
     private int xFond1; // variable qui corespond à l'absisse du coin supp gauche de l'image fond par rapport à l'écran
     private int xFond2; // idem que xFond, 
     private int dx; // variable pour déplacer le fond de l'écran horizontallement
     private int xPos; // la position absolut dans le jeu, lorsque l'on débute nous somme à zéro;
     
     public Mario mario;
     
/** 		création du construteur   */
     
 public Scene(){
	 
     
             super (); // appel au constructeur de la super classe (n'est pas obligatoire)
             
         this.xFond1 = -50;
         this.xFond2 = 750; // largeur de l'écran 800. 800-xFonds1 = 750
         this.dx = 0;
         this.xPos =-1;
         
         icoFond = new ImageIcon(getClass().getResource("/img/fondEcran6.png"));
         this.imgFond1 = this.icoFond.getImage();//associer image fond a image ico
         this.imgFond2 = this.icoFond.getImage(); 
         
         /*
         icoMario = new ImageIcon(getClass().getResource("/img/marioMarcheDroite.png"));
         this.imgMario =this.icoMario.getImage(); //associer image Mario a image icoMario
         */         
        
          this.icoChateau1 = new ImageIcon(getClass().getResource("/img/chateau1.png")) ;
          this.imgChateau1 = this.icoChateau1.getImage();
          this.icoDepart = new ImageIcon(getClass().getResource("/img/depart.png"));
          this.imgDepart = this.icoDepart.getImage();
          
          mario = new Mario( 300 ,245);
          
          this.setFocusable(true);
          this.requestFocusInWindow();          
          this.addKeyListener(new Clavier()); // écouteur du clavier, via la Classe clavier
          
          //création de l'instance de chrono. programme indépendant qui tourne en fond qui va donner les instructions tout les 3 miliseconces          
          Thread chronoEcran = new Thread(new Chrono());
          chronoEcran.start();
 }
 
 
 /**** Getters  sert a accéder aux variables de la Classe scène à l'exterrieur
  * a condition quelles soient public.
  *  ****/
 
  public int getDx() {return dx;}  
  public int getxPos() {return xPos;}
  public Image getImgFond1() {return imgFond1;}
  public Image getImgFond2() {return imgFond2;}
  public int getxFond1() {return xFond1;}
  public int getxFond2() {return xFond2;}


/**** Setters ****/
  public void setDx(int dx) {this.dx = dx;}
  public void setxPos(int xPos) {this.xPos = xPos;} 
  public void setImgFond1(Image imgFond1) {this.imgFond1 = imgFond1;}
  public void setImgFond2(Image imgFond2) {this.imgFond2 = imgFond2;}
  public void setxFond1(int xFond1) {	this.xFond1 = xFond1;}
  public void setxFond2(int xFond2) {	this.xFond2 = xFond2;}


/*******  Méthodes pour mettre a jours le fond ***/
  

  
 public void deplacementFond() {
	 
	  if(this.xPos >=0) {
		  this.xPos = this.xPos + this.dx;	  
		  this.xFond1 = this.xFond1 - this.dx; // mise a jour du fond par rapport à la valeur de dx
		  this.xFond2 = this.xFond2 - this.dx;
	  }
	 if(this.xFond1 ==-800) { this.xFond1= 800; }
	 else if(this.xFond2 == -800) {this.xFond2 = 800;}
	 else if (this.xFond1== 800) {this.xFond1= -800;}
	 else if (this.xFond2 == 800) {this.xFond2 = -800;}
 } 



/****   Methodes  Dessiner ***/
 public  void paintComponent(Graphics g){
     
	 	 
     //appel à la super méthode
     super.paintComponent(g);
     //composant graphique2D pour améliorer les graphismes
     // il faut caster graphique en graphique2D
     Graphics g2 = (Graphics2D)g;  
     this.deplacementFond();
     
     
     //dessiner les images
     g2.drawImage(this.imgFond1, this.xFond1, 0, null);// Dessin de l'image du Fond
     g2.drawImage(this.imgFond2, this.xFond2, 0, null);
     g2.drawImage(this.mario.getImgMario(), 300, 245, null);
     g2.drawImage(imgChateau1, 10 -this.xPos, 95, null);
     g2.drawImage(imgDepart, 220 -this.xPos, 234, null);        
     
 		}

}
