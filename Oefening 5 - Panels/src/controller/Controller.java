package controller;

import model.Boodschap;
import model.BoodschappenLijst;
import view.Paneel;

public class Controller {
	
	private BoodschappenLijst l;
	private Paneel p;
	
	public Controller() {
		l = new BoodschappenLijst();
		p = new Paneel(l, this);
	}
	
	public void doAdd() {
		int a = p.getAant();
		String e = p.getEenh();
		String o = p.getOmsc();
		Boodschap n = new Boodschap(a, e, o); 
		l.voegToe(n);
		p.update(n);
	}
	
	public void doVolgend() {
		Boodschap n = l.volgendeBoodschap(); 
		p.update(n);
	}
	
	public static void main(String[] args) {
		new Controller();
	}
}
