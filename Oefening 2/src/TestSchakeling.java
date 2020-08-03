// Pieter-Jan Steeman
public class TestSchakeling {
	
	public static void main(String[] args) {
		
		Weerstand r1 = new Weerstand(2);
		Weerstand r2 = new Weerstand(3);
		RegelbareWeerstand r3 = new RegelbareWeerstand(5,10);
		
		ParallelSchakeling p1 = new ParallelSchakeling();
		p1.voegToe(r1);
		p1.voegToe(r2);
		p1.voegToe(r3);
		
		System.out.println(p1.toString());
		System.out.println(p1.spanning(1)+" Volt");
		
		r3.verhoog((float)0.25);
		System.out.println(r3.toString());
		System.out.println(p1.spanning(1)+" Volt");
		
		System.out.println("Vervangingsweerstand = "+p1.vervangingsweerstand()+" Ohm");
	}	
}
