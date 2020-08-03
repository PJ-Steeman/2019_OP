package model;
//Pieter-Jan Steeman
public class Runner {
	
	private int nr;
	private int afgelegdeWeg;
	
	public Runner() {
		setAfgelegdeWeg(0);
	}
	
	public Runner(int nr) {
		setNummer(nr);
		setAfgelegdeWeg(0);
	}
	
	public void setNummer(int nmr) {
		nr = nmr;
	}
	
	public int getNummer() {
		return nr;
	}
	
	public void setAfgelegdeWeg(int weg) {
		afgelegdeWeg = weg;
	}
	
	public int getAfgelegdeWeg() {
		return afgelegdeWeg;
	}
	
	public String toString() {
		return "renner " + getNummer() + " heeft " + getAfgelegdeWeg() + " km afgelegd";
	}
	
	public void addAfgelegdeWeg(int weg) {
		setAfgelegdeWeg(getAfgelegdeWeg() + weg);
	}
	
}
