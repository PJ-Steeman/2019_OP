package model;

import java.util.ArrayList;
import java.util.Collections;
//Pieter-Jan Steeman
public class Doolhof {

	private Tegel[][] tegels = null;
	private int grootte = 0;
	private Coordinaat tegelSpeler = null;
	private Coordinaat gebiedSpeler = null;
	private Coordinaat tegelGoud = null;
	
	public Doolhof(int g) {
		setGrootte(g);
		tegels = new Tegel[2*grootte][2*grootte];
		maakDoolhof();
	}
	
	private void maakDoolhof() {
		ArrayList<Tegel> list = new ArrayList<Tegel>();
		
		for(int i = 0; i < getGrootte()*getGrootte(); i++) {
			Cross c = new Cross();
			Straight s = new Straight();
			Bend b = new Bend();
			T t = new T();
			
			list.add(c);
			list.add(s);
			list.add(b);
			list.add(t);
		}
		Collections.shuffle(list);
		int teller = 0;
		for(int j = 0; j < getGrootte(); j++) {
			for(int k = 0; k < getGrootte(); k++) {
				tegels[j][k] = list.get(teller);
				tegels[j][k].draai(random(0,3));
				teller ++;
			}
		}
		
		Coordinaat c = new Coordinaat(1,1);
		gebiedSpeler = c;
		
		tegelSpeler = plaats();
		getTegel(tegelSpeler).getGebied(gebiedSpeler).setSpeler();
		tegelGoud = plaats();
		while(tegelSpeler.equals(tegelGoud)) {
			tegelGoud = plaats();
		}
		getTegel(tegelGoud).getGebied(gebiedSpeler).setGoud();
		
	}
	
	private Coordinaat plaats() {
		int rij = random(0,2);
		int kolom = random(0,2);
		Coordinaat c = new Coordinaat(rij,kolom);
		return c;
	}	
	
	private int random(int min, int max) {
		int range = (max - min) + 1;     
		return (int)(Math.random() * range) + min;
	}
	
	public void setGrootte(int g) {
		grootte = g;
	}
	
	public int getGrootte() {
		return 2*grootte;
	}
	
	public Coordinaat getSpelerTegel() {
		return tegelSpeler;
	}
	
	public void setSpelerTegel(Coordinaat s) {
		tegelSpeler = s;
	}
	
	public Coordinaat getSpelerGebied() {
		return gebiedSpeler;
	}
	
	public void setSpelerGebied(Coordinaat s) {
		gebiedSpeler = s;
	}
	
	public Coordinaat getGoud() {
		return tegelGoud;
	}
	
	public Tegel getTegel(Coordinaat c) {
		return tegels[c.getRij()][c.getKolom()];
	}
	
	public void setTegel(Coordinaat c, Tegel t) {
		tegels[c.getRij()][c.getKolom()] = t;
	}
	
	public String toString() {
		String s = "";
		for(int i = 0; i < getGrootte(); i++) {
			for(int j = 0; j < getGrootte(); j++) {
				s += tegels[j][i].toString();
				s += "";
			}
			s += "\n";
		}
		return s;
	}
	
	public void move(int dir) throws Exception{
		Coordinaat g = new Coordinaat(getSpelerGebied().getRij(), getSpelerGebied().getKolom());
		Coordinaat t = new Coordinaat(getSpelerTegel().getRij(), getSpelerTegel().getKolom());
		
		switch(dir) {
		case(0):g.setRij(getSpelerGebied().getRij()-1);
				if(g.getRij()<0) {
					t.setRij(t.getRij()-1);
					g.setRij(2);}
				break;
		case(1):g.setKolom(getSpelerGebied().getKolom()+1);
				if(g.getKolom()>2) {
					t.setKolom(t.getKolom()+1);
					g.setKolom(0);}
		 		break;
		case(2):g.setRij(getSpelerGebied().getRij()+1);
				if(g.getRij()>2) {
					t.setRij(t.getRij()+1);
					g.setRij(0);}
		 		break;
		case(3):g.setKolom(getSpelerGebied().getKolom()-1);
				if(g.getKolom()<0) {
					t.setKolom(t.getKolom()-1);
					g.setKolom(2);}
		 		break;
		}
		
		if(0 <= t.getKolom() && t.getKolom() <= getGrootte() && 0 <= t.getRij() && t.getRij() <= getGrootte()) {
			
			if(getTegel(t).getGebied(g).isMuur() == true) {
				throw new Exception("Tegen een muur");
			}
			else if(tegels[t.getRij()][t.getKolom()].getGebied(g).isGoud() == true) {
				throw new Exception("Goud Gevonden");
			}
			else {
				tegels[tegelSpeler.getRij()][tegelSpeler.getKolom()].getGebied(gebiedSpeler).setLeeg();
				setSpelerGebied(g);
				setSpelerTegel(t);
				tegels[tegelSpeler.getRij()][tegelSpeler.getKolom()].getGebied(gebiedSpeler).setSpeler();
			}
		}
		else {
			throw new Exception("Buiten het doolhof");
		}
		
	}
	
}
