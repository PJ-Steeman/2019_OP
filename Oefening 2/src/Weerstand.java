// Pieter-Jan Steeman
public class Weerstand {

	private float geleiding = 0;
	
	public Weerstand(float wwaarde){
		setValue(wwaarde);
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
	
	public float spanning(float i){
		float u = i * this.getValue();
		return u;
	}
	
	public float stroom(float u){
		float i = u / this.getValue();
		return i;
	}

	public boolean equals(Weerstand r) {
		return (this.getValue() == r.getValue());
	}
}
