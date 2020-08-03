// Pieter-Jan Steeman
public class TestWeerstand {
	
	public static void main(String[] args) {
		Weerstand r1 = new Weerstand(2);
		Weerstand r2 = new Weerstand(2);
		
		System.out.println(r1.toString());
		System.out.println(r1.stroom(3)+" Ampère");
		System.out.println(r1.spanning(3)+" Volt");

		System.out.println(r1 == r2);
		System.out.println(r1.equals(r2));
		
	}
}
