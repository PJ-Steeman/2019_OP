package model;
// Pieter-Jan Steeman
public class Boodschap {

	private int aantal = 0;
	private String eenheid = "";
	private String omschrijving = "";
	
	public Boodschap(int a, String e, String o) {
		setAantal(a);
		eenheid = e;
		omschrijving = o;
		if(a <= 0)
		{
			throw new IllegalArgumentException("Threw an IllegalArgumentException");
		}
	}
	
	public void setAantal(int a) {
		aantal = a;
	}
	
	public void setEenheid(String e) {
		eenheid = e;
	}
	
	public void setOmschrijving(String o) {
		omschrijving = o;
	}
	
	public int getAantal() {
		return aantal;
	}
	
	public String getEenheid() {
		return eenheid;
	}
	
	public String getOmschrijving() {
		return omschrijving;
	}
	
	public String toString() {
		String s = "";
		s += Integer.toString(aantal) +" - "+ eenheid +" - "+ omschrijving;
		return s;
	}
}
