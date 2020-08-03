package reis;
//Pieter-Jan Steeman
import java.util.ArrayList;
import vervoersmiddel.VervoersMiddel;

public class Reis {
	
	private int reizigers = 0;
	private VervoersMiddel vm = null;
	ArrayList<Traject> reisweg = new ArrayList<Traject>();
	
	public Reis() {
	}
	
	public Reis(int r, VervoersMiddel v) {
		setReizigers(r);
		setVervoersMiddel(v);
	}
	
	public Reis(ArrayList<Traject> l) {
		reisweg = l;
	}
	
	public void setReizigers(int r) {
		reizigers = r;
	}
	
	public void setVervoersMiddel(VervoersMiddel v) {
		vm = v;
	}
	
	public void setRoute(ArrayList<Traject> l) {
		reisweg = l;
	}
	
	public int getReizigers() {
		return reizigers;
	}
	
	public VervoersMiddel getVervoersMiddel() {
		return vm;
	}
	
	public ArrayList<Traject> getRoute() {
		return reisweg;
	}
	
	public float bepaalAfstand() {
		float som = 0;
		for(int t = 0; t < reisweg.size(); t++) {
			som += reisweg.get(t).getAfstand();
		}
		return som;
	}
	
	public void voegToe(Traject t) {
		int laatste = reisweg.size();
		if(laatste != 0) {
			if(t.equals(reisweg.get(laatste-1))){
			}
			else {
				throw new IllegalArgumentException("Traject is niet aansluitend");
			}
		}
		reisweg.add(t);
	}
	
	public float bepaalVerbruik() {
		float v = this.bepaalAfstand()*vm.getTotaalVerbruik(reizigers);
		return v;
	}
}
