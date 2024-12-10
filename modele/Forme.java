package modele;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Forme implements Dessinable {
	private int largeur;
	private int hauteur;
	private Point origine;
	
	public Forme(Point origine, int largeur, int hauteur) {
		this.origine=origine;
		this.largeur=largeur;
		this.hauteur=hauteur;
	}
	public Point getOrigine() {
		return this.origine;
	} 
	public void setOrigine(Point o) {
		this.origine=o;
	}
	public int getX() {
		return this.origine.x;
	}
	public int getY() {
		return this.origine.y;
	}
	public int getHauteur() {
		return this.hauteur;
	}
	public void setHauteur(int h) {
		this.hauteur=h;
	}
	public int getLargeur() {
		return this.largeur;
	}
	public void setLargeur(int l) {
		this.largeur=l;
	}

	public abstract void dessiner(Graphics graphique);

}
