package controleur;

import java.awt.Color;
import java.awt.Dimension;

import vue.Fenetre;
import vue.PanneauBoutons;
import vue.PanneauDessin;

public class LogicielDeDessin {

	public static void main(String[] args) {
		Dimension dim=new Dimension(500, 500);
		Color col=new Color(255, 178, 39);
		Fenetre ecran=new Fenetre("logiciel de dessin", dim);
		ecran.setVisible(true);
		PanneauDessin pande=new PanneauDessin(ecran, dim, col);
		PanneauBoutons panbo=new PanneauBoutons(ecran);
		
	}

}
