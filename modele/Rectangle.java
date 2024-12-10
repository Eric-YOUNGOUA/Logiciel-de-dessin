package modele;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends Forme{
	private boolean plein;
	public Rectangle(Point origine, int largeur, int hauteur, boolean plein) {
		super(origine, largeur, hauteur);
		this.plein=plein;
	}
	
	public boolean getPlein() {
		return this.plein;
	}
	
	public void setPlein(boolean valeur) {
		this.plein=valeur;
	}

	@Override
	public void dessiner(Graphics graphique) {
		if(this.plein = false) {
			graphique.drawRect(super.getX(), super.getY(), super.getLargeur(), super.getHauteur());
		}else {
			graphique.setColor(Color.blue);
			graphique.fillRect(super.getX(), super.getY(), super.getLargeur(), super.getHauteur());
		}
	}

}
