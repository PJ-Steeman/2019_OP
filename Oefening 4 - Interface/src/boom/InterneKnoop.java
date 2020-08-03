package boom;
// Pieter-Jan Steeman
public class InterneKnoop extends Knoop{

	private Knoop lkind = null;
	private Knoop rkind = null;

	
	public InterneKnoop(BoomWaarde waarde){
		super(waarde);
	}
	
	public InterneKnoop(BoomWaarde waarde, Knoop l, Knoop r){
		super(waarde);
		lkind = l;
		rkind = r;
	}
	
	public Knoop getValueLinks(){
		return (lkind);
	}
	
	public void setValueLinks(Knoop l){
		lkind = l;
	}
	
	public Knoop getValueRechts(){
		return (rkind);
	}
	
	public void setValueRechts(Knoop r){
		rkind = r;
	}
	
	public String toString() {
		String s = "";
		s += "InterneKnoop " + this.getValue()+ ", ";
		if(lkind != null)
			s += lkind.toString();
		if(rkind != null)
			s += rkind.toString();
		return s;
	}
	
	public int aantalKnopen() {
		int i = 1;
		if(lkind != null)
			i += lkind.aantalKnopen();
		if(rkind != null)
			i += rkind.aantalKnopen();
		return i;
	}
	
	public double som() {
		double i = 0;
		i+= super.som();
		if(lkind != null)
			i += lkind.som();
		if(rkind != null)
			i += rkind.som();
		return i;
	}
	
	public boolean bevat(BoomWaarde waarde) {
		boolean heeft = false;
		if(super.bevat(waarde)) 
			return true;
		else if(getValue().lessThan(waarde)) 
			if(rkind != null) 
				heeft = rkind.bevat(waarde);
			else 
				return false;
		else 
			if(lkind != null) 
				heeft = lkind.bevat(waarde);
			else
				return false;
		return heeft;
	}
	
	public Knoop voegToe ( BoomWaarde waarde ) {
		if(getValue().lessThan(waarde)) 
		{
			if(rkind != null)
				rkind = rkind.voegToe(waarde);
			else {
				rkind = new Blad(waarde);
				return rkind;}
		}
		else
		{
			if(lkind != null)
				lkind = lkind.voegToe(waarde);
			else {
				lkind = new Blad(waarde);
				return lkind;}
		}
		return this;
	}
}
