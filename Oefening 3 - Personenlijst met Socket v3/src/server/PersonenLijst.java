package server;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.Observable;
//Pieter-Jan Steeman
public class PersonenLijst extends Observable implements Serializable{
	private ArrayList<Persoon> personen;
	private static PersonenLijst instance;
	
	public PersonenLijst() {
		personen = new ArrayList<Persoon>();
	}
	
	public void voegToe(Persoon p) {
		personen.add(p);
		setChanged();
        notifyObservers(p);
	}
	
	public static PersonenLijst getInstance() {
		if(instance == null) {
			instance = new PersonenLijst();
		}
		return instance;
	}
	
	public String toString() {
		String s = "";
		for(int i = 0; i < personen.size(); i++) {
			s += personen.get(i).toString() + "\n";
		}
		return s;
	}
}
