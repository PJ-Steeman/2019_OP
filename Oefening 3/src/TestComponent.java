
public class TestComponent {
	
	public static void main(String[] args) {
		Weerstand r1 = new Weerstand(3);
		Weerstand r2 = new Weerstand(2);
		Weerstand r3 = new Weerstand(5);

		ParallelSchakeling p1 = new ParallelSchakeling();
		SerieSchakeling s1 = new SerieSchakeling();
		
		p1.voegToe(r1);
		p1.voegToe(r2);

		s1.voegToe(r3);
		s1.voegToe(p1);
		
		System.out.println(s1.stroom(5)+" Ampère");
		System.out.println(s1.toString());
	}
}
