package modele;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Ellipse extends Forme{
	private boolean plein;
	
	public Ellipse(Point origine, int largeur, int hauteur, boolean plein) {
		super(origine, largeur, hauteur);
		this.setPlein(plein);
	}

	public boolean getPlein() {
		return plein;
	}

	public void setPlein(boolean plein) {
		this.plein = plein;
	}
	
	@Override
	public void dessiner(Graphics graphique) {
		if(this.plein=false) {
			graphique.drawOval(super.getX(), super.getY(), super.getLargeur(), super.getHauteur());
		}else {
			graphique.setColor(Color.blue);
			graphique.fillOval(super.getX(), super.getY(), super.getLargeur(), super.getHauteur());
		}
	}

	

}
