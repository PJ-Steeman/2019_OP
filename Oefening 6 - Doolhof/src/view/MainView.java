package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import controller.Controller;
import model.Doolhof;

//Pieter-Jan Steeman
public class MainView  extends JFrame{
	
	private Doolhof doolhof;
	private Controller cont;
	private DoolhofView dv;	
	private KnoppenPaneel kp;
	
	public MainView(Doolhof d, Controller c) {
		
		this.doolhof = d;
		this.cont = c;
		
		dv = new DoolhofView(d);
		kp = new KnoppenPaneel(d,c);
		
		getContentPane();
		setLayout(new BorderLayout());
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    	add(dv, BorderLayout.CENTER);
    	add(kp, BorderLayout.PAGE_END);
    	
    	pack();
    	setVisible(true);
    	
    	update();
	}
	
	public void update() {
		dv.update();
	}
}
