package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Fenetre extends JFrame{
	public Fenetre(String nom, Dimension dimension) {
		setTitle(nom);
		setSize( dimension.width, dimension.height);
	}
	
	public PanneauDessin getPanneauDessin() {
		return this.getPanneauDessin();
	}
	
	public PanneauDessin getPanneauBouttons() {
		return this.getPanneauBouttons();
	}
		
}
