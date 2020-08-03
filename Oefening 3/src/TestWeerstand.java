// Pieter-Jan Steeman
public class TestWeerstand {
	
	public static void main(String[] args) {
		BruineBand bruin = new BruineBand();
		RodeBand rood = new RodeBand();
		ZwarteBand zwart = new ZwarteBand();
		
		Weerstand r1 = new Weerstand(bruin,rood,bruin);
		
		System.out.println(r1.toString());
		
		Weerstand r2 = new Weerstand("bruin","rood","bruin");
		System.out.println(r2.toString());
		
	}
}
