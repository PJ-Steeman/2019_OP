package model;
import java.io.Serializable;

import java.util.ArrayList;
//Pieter-Jan Steeman
public class PersonenLijst implements Serializable{
	private ArrayList<Persoon> personen;
	
	public PersonenLijst() {
		personen = new ArrayList<Persoon>();
	}
	
	public void voegToe(Persoon p) {
		personen.add(p);
	}
	
	public String toString() {
		String s = "";
		for(int i = 0; i < personen.size(); i++) {
			s += personen.get(i).toString() + "\n";
		}
		return s;
	}
}
