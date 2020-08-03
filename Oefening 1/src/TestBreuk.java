// Pieter-Jan Steeman
public class TestBreuk {
	
	public static void main(String[] args) {
		Breuk b1 = new Breuk();
		Breuk b2 = new Breuk();
		Breuk b3 = new Breuk();
		Breuk b4 = new Breuk();
		b4 = b1;
		
		b1.setTeller(1);
		b1.setNoemer(2);
		b2.setTeller(-3);
		b2.setNoemer(4);
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.println(b1.getValue());
		System.out.println(b2.getValue());
		
		b3 = b1.plus(b2);
		System.out.println(b3.toString());
		System.out.println(b3.getValue());
		
		b3 = b1.plus(b2.maal(-1));
		System.out.println(b3.toString());
		
		System.out.println(b1.toString());
		b1.setTeller(5);
		System.out.println(b4.toString());
		
	}
}
