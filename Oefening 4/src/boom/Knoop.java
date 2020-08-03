package boom;
// Pieter-Jan Steeman
public abstract class Knoop {

	private int waarde = 0;
	
	public Knoop(int wwaarde){
		setValue(wwaarde);
	}
	
	public int getValue(){
		return (waarde);
	}
	
	public void setValue(int w){
		waarde = w;
	}
	
	public int aantalKnopen() {
		return 1;
	}
	
	public int som() {
		return getValue();
	}
	
	public boolean bevat(int waarde) {
		if(this.getValue() == waarde)
			return true;
		else
			return false;
	}
}
