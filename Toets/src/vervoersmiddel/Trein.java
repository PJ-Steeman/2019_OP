package vervoersmiddel;
//Pieter-Jan Steeman
public class Trein implements VervoersMiddel{
	
	protected float gemVerbruik = 0;
	
	public Trein() {
	}
	
	public Trein(float v) {
		setVerbruik(v);
	}
	
	public void setVerbruik(float v) {
		gemVerbruik = v;
	}
	
	public float getVerbruik() {
		return gemVerbruik;
	}

	public float getTotaalVerbruik(int r) {
		return gemVerbruik*r;
	}
}
