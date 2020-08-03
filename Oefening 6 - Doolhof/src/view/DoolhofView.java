package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.Controller;
import model.Coordinaat;
import model.Doolhof;
import model.Gebied;
import model.Tegel;

//Pieter-Jan Steeman
public class DoolhofView extends JPanel{
	
	private TegelView[][] tegel;
	private Doolhof doolhof = null;
	private Coordinaat cor = null;
	private Tegel teg = null;
	private int grootte = 0;

	public DoolhofView(Doolhof d) {
		
		doolhof = d;		
		grootte = d.getGrootte();
		tegel = new TegelView[grootte][grootte];
		
		setLayout(new GridLayout(0,grootte));
		
		for(int i = 0; i<grootte;i++) {
			for(int j = 0; j<grootte;j++) {
				cor = new Coordinaat(i,j);
				teg = d.getTegel(cor);
				tegel[i][j] = new TegelView(teg);
				add(tegel[i][j]);
			}
		}
		
	}
	
	public void update() {
		for(int i = 0; i<grootte;i++) {
			for(int j = 0; j<grootte;j++) {
				tegel[i][j].update();
			}
		}

	}
}
