package reis;
//Pieter-Jan Steeman
import vervoersmiddel.Trein;

public class TestReis {
	
	public static void main(String[] args) {
		Trein t = new Trein((float) 0.01);
		Reis r = new Reis(12, t);
		Traject t1 = new Traject("S-K-W", "Mechelen", 5);
		Traject t2 = new Traject("Mechelen", "Leuven", 25);
		r.voegToe(t1);
		r.voegToe(t2);
		System.out.println(r.bepaalVerbruik());
		System.out.println(r.getReizigers());
		System.out.println(r.getVervoersMiddel());
		System.out.println(r.bepaalAfstand());
		System.out.println(r.getRoute());
		
	}
}
