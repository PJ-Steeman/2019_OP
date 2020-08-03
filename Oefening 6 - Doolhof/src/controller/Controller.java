package controller;

import javax.swing.JOptionPane;

import model.Doolhof;
import view.MainView;

//Pieter-Jan Steeman
public class Controller {
	
	private MainView m;
	private Doolhof d;
	
	public Controller(int grootte) {
		d = new Doolhof(grootte);
		m = new MainView(d, this);
	}
	
	public void Up() {
		try {
			d.move(0);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		m.update();
	}
	
	public void Right() {
		try {
			d.move(1);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		m.update();
	}
	
	public void Down() {
		try {
			d.move(2);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		m.update();
	}
	
	public void Left() {
		try {
			d.move(3);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		m.update();
	}
	
	public static void main(String[] args) {
		new Controller(2);
	}

}
