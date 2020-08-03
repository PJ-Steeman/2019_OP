package boom;
// Pieter-Jan Steeman
public abstract class Knoop {

	private BoomWaarde bwaarde = null;
	public abstract Knoop voegToe(BoomWaarde waarde);
	
	public Knoop(BoomWaarde bw){
		setValue(bw);
	}
	
	public BoomWaarde getValue(){
		return (bwaarde);
	}
	
	public void setValue(BoomWaarde bw){
		bwaarde = bw;
	}
	
	public int aantalKnopen() {
		return 1;
	}
	
	public double som() {
		return bwaarde.optelWaarde();
	}
	
	public boolean bevat(BoomWaarde waarde) {
		if(bwaarde.equals(waarde)) 
			return true;
		else 
			return false;
	}
	
}
