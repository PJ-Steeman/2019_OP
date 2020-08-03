package testBoom;
import boom.Blad;
import boom.Boom;
import boom.InterneKnoop;
import boom.Kerstbal;
import boom.BoomGetal;

// Pieter-Jan Steeman
public class TestBoom {

	public static void main(String[] args) {
		
		BoomGetal w = new BoomGetal(10);
		
		BoomGetal b1 = new BoomGetal(5);
		BoomGetal b2 = new BoomGetal(7);
		BoomGetal b3 = new BoomGetal(15);
		BoomGetal b4 = new BoomGetal(3);
		BoomGetal b5 = new BoomGetal(8);

		Blad wortel = new Blad(w);
		
		Boom b = new Boom(wortel);
		b.voegToe(b1);
		b.voegToe(b2);
		b.voegToe(b3);
		b.voegToe(b4);
		b.voegToe(b5);
		System.out.println(b.toString());


	}
}
