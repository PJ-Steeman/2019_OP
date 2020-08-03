package boom;
//Pieter-Jan Steeman
public class BoomGetal implements BoomWaarde{
	
	private int waarde = 0;
	
	public BoomGetal(int w){
		waarde = w;
	}
	
	public int getValue(){
		return waarde;
	}
	
	public void setValue(int nieuw){
		waarde = nieuw;
	}
	
	public double optelWaarde(){
		return waarde;
	}
	
	public String toString() {
		return Integer.toString(waarde);
	}
	
	public boolean equals(BoomWaarde vorig) {
		if(((BoomGetal)vorig).getValue() == waarde)
			return true;
		else
			return false;
	}
	
	public boolean lessThan(BoomWaarde vorig) {
		if(((BoomGetal)vorig).getValue() < waarde) {
			return true;
		}
		else
			return false;
	}
}
