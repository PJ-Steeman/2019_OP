package model;
//Pieter-Jan Steeman
public class Gebied {

	public static final int LEEG = 0;
	public static final int MUUR = 1;
	public static final int SPELER = 2;
	public static final int GOUD = 3;

	private int inhoud = 0;
	
	public Gebied() {
		
	}
	
	public Gebied(int i) {
		inhoud = i;
	}
	
	public void setMuur() {
		inhoud = MUUR;
	}
	
	public void setSpeler() {
		inhoud = SPELER;
	}
	
	public void setGoud() {
		inhoud = GOUD;
	}
	
	public void setLeeg() {
		inhoud = LEEG;
	}
	
	public boolean isMuur() {
		if(inhoud == MUUR)
			return true;
		else 
			return false;
	}
	
	public boolean isSpeler() {
		if(inhoud == SPELER)
			return true;
		else 
			return false;
	}
	
	public boolean isGoud() {
		if(inhoud == GOUD)
			return true;
		else 
			return false;
	}
	
	public boolean isLeeg() {
		if(inhoud == LEEG)
			return true;
		else 
			return false;
	}
	
	public int getInhoud() {
		return inhoud;
	}
	
	public String toString() {
		if(isMuur())
			return "#";
		else if(isSpeler())
			return "x";
		else if(isGoud())
			return "*";
		else
			return " ";
	}
}
