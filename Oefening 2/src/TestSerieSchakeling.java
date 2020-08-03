// Pieter-Jan Steeman
public class TestSerieSchakeling {
	
	public static void main(String[] args) {
		Weerstand r1 = new Weerstand(2);
		Weerstand r2 = new Weerstand(3);
		Weerstand r3 = new Weerstand(5);
		
		Weerstand r4 = new Weerstand(1);
		
		Weerstand[] lijst = new Weerstand[3];
		lijst[0] = r1;
		lijst[1] = r2;
		lijst[2] = r3;
		
		SerieSchakeling s1 = new SerieSchakeling(lijst);
		SerieSchakeling s2 = new SerieSchakeling();
		
		s2.voegToe(r1);
		s2.voegToe(r2);
		s2.voegToe(r3);
		
		System.out.println(s1.stroom(5)+" Ampère");
		System.out.println(s1.spanning(1)+" Volt");
		
		s1.voegToe(r4);
		s2.voegToe(r4);
		
		System.out.println(s1.stroom(5)+" Ampère");
		System.out.println(s1.spanning(1)+" Volt");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
