package boom;
// Pieter-Jan Steeman
public class Boom {
	
	private Knoop wortel = null;
	
	public Boom(Knoop wort) {
		wortel = wort;
	}
	
	public Knoop getValueWortel(){
		return (wortel);
	}
	
	public void setValueWortel(Knoop wortel_n){
		wortel = wortel_n;
	}
	
	public String toString() {
		String s = "";
		s += wortel.toString();		
		return s;
	}
	
	public int aantalKnopen() {
		int i = 0;
		i += wortel.aantalKnopen();
		return i;
	}
	
	public double som() {
		double i = 0;
		i += wortel.som();
		return i;
	}
	
	public boolean bevat(BoomWaarde waarde) {
		boolean heeft = false;
		heeft = wortel.bevat(waarde);
		return heeft;
	}
	
	public void voegToe(BoomWaarde waarde) {
		wortel=wortel.voegToe(waarde);
		
	}

}
