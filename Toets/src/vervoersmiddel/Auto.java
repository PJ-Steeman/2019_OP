package vervoersmiddel;
//Pieter-Jan Steeman
public class Auto implements VervoersMiddel{
	
	private float eenhVerbruik = 0;
	private float gemVerbruik = 0;
	private	int maxReizigers = 0;

	public Auto() {
	}
	
	public Auto(float v, float e) {
		setVerbruik(v);
		setEenheidV(e);
	}
	
	public void setVerbruik(float v) {
		gemVerbruik = v;
	}
	
	public float getVerbruik() {
		return gemVerbruik;
	}
	
	public void setEenheidV(float e) {
		eenhVerbruik = e;
	}
	
	public float getEenheidV() {
		return eenhVerbruik;
	}
	
	public void setReizigers(int r) {
		maxReizigers = r;
	}

	public int getReizigers() {
		return maxReizigers;
	}
	
	public float getTotaalVerbruik(int r) {
		int hvlAuto = r/getReizigers();
		if(r%getReizigers() > getReizigers()-1)
			hvlAuto ++;
		float t = getVerbruik()*r+getEenheidV()*hvlAuto;
		return t;
	}
}
