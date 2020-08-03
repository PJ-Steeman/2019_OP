package server;

import java.io.Serializable;

//Pieter-Jan Steeman
public class Persoon implements Serializable{
	private String naam;
	private String vnaam;
	private String gemeente;
	private boolean geslacht;
	
	public Persoon(String n, String v, String gem, boolean ges) {
		setNaam(n);
		setVNaam(v);
		setGemeente(gem);
		setGeslacht(ges);
	}

	public void setGeslacht(boolean ges) {
		geslacht = ges;
	}

	public void setGemeente(String gem) {
		gemeente = gem;
	}

	public void setVNaam(String v) {
		vnaam = v;	
	}

	public void setNaam(String n) {
		naam = n;
	}
	
	public boolean getGeslacht() {
		return geslacht;
	}

	public String getGemeente() {
		return gemeente;
	}

	public String getVNaam() {
		return vnaam;	
	}

	public String getNaam() {
		return naam;
	}
	
	public String toString() {
		String s = getNaam()+" , "+getVNaam()+" , "+getGemeente()+" , ";
		if(getGeslacht()) {
			s+="Mannelijk";
		}
		else {
			s+="Vrouwelijk";
		}
		return s;
	}
}
