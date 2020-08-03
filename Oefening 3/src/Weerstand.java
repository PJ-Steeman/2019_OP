// Pieter-Jan Steeman
public class Weerstand extends Component{

	private float geleiding = 0;
	
	public Weerstand(float wwaarde){
		setValue(wwaarde);
	}

	// String is hier niet zo mooi gedaan maar het was gewoon om rap eens na te kijken
	
	public Weerstand(GekleurdeBand k1, GekleurdeBand k2, GekleurdeBand k3) {
		float waarde = 0;
		waarde = ((k1.getalWaarde()*10 + k2.getalWaarde()) * (int)Math.pow(10, k3.getalWaarde()));
		System.out.println(k1.toString()+", "+k2.toString()+", "+k3.toString());
		setValue(waarde);
	}
	
	public Weerstand(String k1, String k2, String k3) {
		float waarde = 0;
		String tekst = "";
		waarde += GekleurdeBand.zetStringom(k1).getalWaarde()*10;
		tekst += GekleurdeBand.zetStringom(k1).toString() + ", ";
		waarde += GekleurdeBand.zetStringom(k2).getalWaarde(); 
		tekst += GekleurdeBand.zetStringom(k2).toString() + ", ";
		waarde *= Math.pow(10, GekleurdeBand.zetStringom(k3).getalWaarde());
		tekst += GekleurdeBand.zetStringom(k3).toString();
		System.out.println(tekst);
		setValue(waarde);
	}
	
	public float getValue(){
		return (1/geleiding);
	}
	
	public void setValue(float v){
		geleiding = 1/v;
	}
	
	public String toString(){
		return ("Weerstand van "+Float.toString(1/(this.geleiding))+" Ohm ");
	}

	public boolean equals(Weerstand r) {
		return (this.getValue() == r.getValue());
	}
	
	public float vervangingsweerstand() {
		return this.getValue();
	}
}
