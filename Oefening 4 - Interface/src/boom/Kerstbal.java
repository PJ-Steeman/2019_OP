package boom;
//Pieter-Jan Steeman
public class Kerstbal implements BoomWaarde{
	
	private String kleur = "";
	private double diameter = 0.0;
	
	public Kerstbal(String k, double d) {
		kleur = k;
		diameter = d;
	}
	
	public String getKleur(){
		return kleur;
	}
	
	public double getDiameter(){
		return diameter;
	}
	
	public void setKleur(String k){
		kleur = k;
	}
	
	public void setDiameter(double d){
		diameter = d;
	}
	
	public String toString() {
		String s = Double.toString(diameter)+" en "+kleur;
		return s;
	}
	
	public double optelWaarde(){
		return (Math.PI*Math.pow(diameter, 3))/6;
	}
	
	public boolean equals(BoomWaarde vorig) {
		if(((Kerstbal)vorig).getDiameter() == diameter && (((Kerstbal)vorig).getKleur().equals(kleur)))
			return true;
		else
			return false;
	}
	
	public boolean lessThan(BoomWaarde vorig) {
		if(((Kerstbal)vorig).getDiameter() > diameter)
			return true;
		else
			return false;
	}

}
