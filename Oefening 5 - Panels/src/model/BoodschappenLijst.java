package model;

import java.util.ArrayList;
import java.util.Iterator;

// Pieter-Jan Steeman
public class BoodschappenLijst {
	
	ArrayList<Boodschap> lijst = new ArrayList<Boodschap>();
	int huidigeIndex = 0;
	
	public BoodschappenLijst() {
	}
	
	public void setLijst(ArrayList<Boodschap> nlijst) {
		lijst = nlijst;
	}
	
	public ArrayList<Boodschap> getLijst(){
		return lijst;
	}
	
	public void voegToe(Boodschap bschap) {
		lijst.add(bschap);
	}
	
	public Boodschap volgendeBoodschap() {
		Boodschap b;
		if (huidigeIndex == lijst.size())
			huidigeIndex = 0;
		
		b = lijst.get(huidigeIndex);
		huidigeIndex++;
		return b;
	}
	
	public String toString() {
		String s = "";
	    Iterator<Boodschap> iter = lijst.iterator();
	    while(iter.hasNext()) {
	    	Object bnext = iter.next();
	    	s += bnext + "\n ";
	    }
	    return s;
	}
	
	public Boodschap getCurrent() {
		return lijst.get(huidigeIndex);
	}
}
