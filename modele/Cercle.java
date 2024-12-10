package modele;

import java.awt.Point;

public class Cercle extends Ellipse{

	public Cercle(Point origine, int diametre, boolean plein) {
		super(origine, diametre, diametre, plein);
	}

}
