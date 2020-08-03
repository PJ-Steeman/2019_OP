// Pieter-Jan Steeman
public class TestRegelbareWeerstand {
	
	public static void main(String[] args) {
		
		Weerstand r1 = new Weerstand(2);
		Weerstand r2 = new Weerstand(3);
		RegelbareWeerstand r3 = new RegelbareWeerstand(5,10);
		
		SerieSchakeling s1 = new SerieSchakeling();
		s1.voegToe(r1);
		s1.voegToe(r2);
		s1.voegToe(r3);
		
		System.out.println(s1.toString());
		System.out.println(s1.stroom(5)+" Ampère");
		
		r3.verhoog((float)0.25);
		System.out.println(r3.toString());
		System.out.println(s1.stroom(5)+" Ampère");
		
		System.out.println(s1.vervangingsweerstand());
	}	
}
