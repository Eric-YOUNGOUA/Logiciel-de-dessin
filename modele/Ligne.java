package modele;

import java.awt.Graphics;
import java.awt.Point;

public class Ligne extends Forme{

	public Ligne(Point origine, int largeur, int hauteur) {
		super(origine, largeur, hauteur);
	}
	
	@Override
	public void dessiner(Graphics graphique) {
		graphique.drawLine(super.getX(), super.getY(), super.getX() + super.getLargeur(), super.getY() + super.getHauteur());
	}

}
