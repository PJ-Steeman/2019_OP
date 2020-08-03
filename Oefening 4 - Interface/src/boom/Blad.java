package boom;
// Pieter-Jan Steeman
public class Blad extends Knoop{

	public Blad(BoomWaarde waarde){
		super(waarde);
	}
	
	public String toString() {
		String s = "";
		s += "Blad " + this.getValue()+ ", ";
		return s;
	}
	
	public Knoop voegToe ( BoomWaarde waarde ) {
		InterneKnoop nieuw = new InterneKnoop(this.getValue());
		Blad b = new Blad(waarde);
		if(getValue().lessThan(waarde))
			nieuw.setValueRechts(b);
		else
			nieuw.setValueLinks(b);
		return nieuw;
	}
	
}
