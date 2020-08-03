package model;
//Pieter-Jan Steeman
public class Coordinaat {

	private int rij = 0;
	private int kolom = 0;
	
	public Coordinaat() {

	}
	
	public Coordinaat(int r, int k) {
		setRij(r);
		setKolom(k);
	}
	
	public int getRij() {
		return rij;
	}
	
	public int getKolom() {
		return kolom;
	}
	
	public void setRij(int r) {
		rij = r;
	}
	
	public void setKolom(int k) {
		kolom = k;
	}
	
	public boolean equals(Coordinaat c) {
		if(this.getKolom() == c.getKolom() && this.getRij() == c.getRij())
			return true;
		else
			return false;
	}
	
	public String toString() {
		return "Rij : "+(rij+1)+", Kolom : "+(kolom+1);
	}
}
