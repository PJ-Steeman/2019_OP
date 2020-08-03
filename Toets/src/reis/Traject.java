package reis;
//Pieter-Jan Steeman
public class Traject {

	private String herkomst = "";
	private String bestemming = "";
	private float afstand = 0;
	
	public Traject() {
	}
	
	public Traject(String h, String b, int a) {
		setHerkomst(h);
		setBestemming(b);
		setAfstand(a);
	}
	
	public void setHerkomst(String h) {
		herkomst = h;
	}
	
	public void setBestemming(String b) {
		bestemming = b;
	}
	
	public void setAfstand(int a) {
		afstand = a;
	}
	
	public String getHerkomst() {
		return herkomst;
	}
	
	public String getBestemming() {
		return bestemming;
	}
	
	public float getAfstand() {
		return afstand;
	}
	
	public boolean equals(Traject t) {
		if(this.getHerkomst() == t.getBestemming())
				return true;
		else
				return false;
	}
}
