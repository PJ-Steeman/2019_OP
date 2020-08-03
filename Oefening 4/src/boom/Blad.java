package boom;
// Pieter-Jan Steeman
public class Blad extends Knoop{

	public Blad(int waarde){
		super(waarde);
	}
	
	public String toString() {
		String s = "";
		s += "Blad " + this.getValue()+ ", ";
		return s;
	}
	
}
