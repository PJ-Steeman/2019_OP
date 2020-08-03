package view;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Coordinaat;
import model.Gebied;
import model.Tegel;

//Pieter-Jan Steeman
public class TegelView extends JPanel{
	
	private GebiedView[][] gebied = null;
	private Tegel teg = null;
	private Coordinaat cor = null;
	private Gebied geb = null;
	
	public TegelView(Tegel tegel) {
		
		teg = tegel;
		gebied = new GebiedView[3][3];
		
		setLayout(new GridLayout(0,3));
		
		for(int i = 0; i<3;i++) {
			for(int j = 0; j<3;j++) {
				cor = new Coordinaat(i,j);
				geb = teg.getGebied(cor);
				gebied[i][j] = new GebiedView(geb);
				add(gebied[i][j]);
			}
		}
		
	}
	
	public void update() {
		for(int i = 0; i<3;i++) {
			for(int j = 0; j<3;j++) {
				gebied[i][j].update();
			}
		}
	}

}
