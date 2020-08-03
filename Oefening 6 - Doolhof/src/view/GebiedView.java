package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Controller;
import model.Afbeeldingen;
import model.Coordinaat;
import model.Doolhof;
import model.Gebied;

//Pieter-Jan Steeman
public class GebiedView extends JPanel{
	
	private Gebied g = null;
	private Afbeeldingen a = null;
	
	public GebiedView(Gebied gebied) {
		setLayout(new BorderLayout());
		g = gebied;
		a = new Afbeeldingen(g.getInhoud());
		add(a, BorderLayout.PAGE_START);
	}
	
	public void update() {
		removeAll();
		a = new Afbeeldingen(g.getInhoud());
		add(a);
		revalidate();
		repaint();
	}

}
