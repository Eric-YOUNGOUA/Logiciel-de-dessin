package vue;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanneauBoutons extends JPanel{
	Fenetre maFenetre;

	public PanneauBoutons(Fenetre maFenetre){
		maFenetre.add(this, BorderLayout.EAST);
		JButton button1=new JButton("1");
		JButton button2=new JButton("2");
		JButton button3=new JButton("3");
		this.add(button1);
		this.add(button2);
		this.add(button3);

	}
	
	public Fenetre getFenetre() {
		return this.maFenetre;
	}
}
