package testBoom;
import boom.Blad;
import boom.Boom;
import boom.InterneKnoop;

// Pieter-Jan Steeman
public class TestBoom {

	public static void main(String[] args) {
		
		Blad b15 = new Blad(15);
		Blad b10 = new Blad(10);
		Blad b9 = new Blad(9);
		Blad b5 = new Blad(5);
		InterneKnoop i14 = new InterneKnoop(14,null,b15);
		InterneKnoop i11 = new InterneKnoop(11,b10,i14);
		InterneKnoop i8 = new InterneKnoop(8, b5,b9);
		InterneKnoop wortel = new InterneKnoop(10, i8, i11);
		
		Boom b = new Boom(wortel);
		System.out.println(b.toString());
		System.out.println("Aantal Knopen : "+b.aantalKnopen());
		System.out.println("Som : "+b.som());
		System.out.println("De boom heeft een 11 : "+b.bevat(11));
		System.out.println("De boom heeft een 12: "+b.bevat(12));
		System.out.println("De boom heeft een 16 : "+b.bevat(16));
		System.out.println("De boom heeft een 10 : "+b.bevat(10));
		System.out.println("De boom heeft een 23 : "+b.bevat(23));
		
		b.voegToe(7);
		System.out.println(b.toString());

	}
}
