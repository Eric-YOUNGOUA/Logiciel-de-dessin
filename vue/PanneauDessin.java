package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import modele.Forme;

public class PanneauDessin extends JPanel{
	private Color couleurDeFond;
	private List<Forme> listeDeFormes=new ArrayList<Forme>();
	private Fenetre fenetre;
	
	public PanneauDessin(Fenetre maFenetre, Dimension dimension, Color couleurDeFond){
		this.setBackground(couleurDeFond);
		maFenetre.setSize(dimension.width, dimension.height);
		maFenetre.add(this, BorderLayout.CENTER);
	}
	
	public Color getCouleurDeFond() {
		return this.couleurDeFond;
	}
	
	public Dimension getDimension() {
		return this.getSize();
	}
	
	public void ajouterForme(Forme nouvelleForme) {
		this.listeDeFormes.add(nouvelleForme);
	}
	
	public List<Forme> getListeForme() {
		return this.listeDeFormes;
	}
	
	public Fenetre getFenetre() {
		return this.fenetre;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		 for (Forme f : getListeForme()) {
		 f.dessiner(g);
		 }
		 g.dispose();
	}
	
}
