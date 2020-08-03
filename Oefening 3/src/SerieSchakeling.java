// Pieter-Jan Steeman
public class SerieSchakeling extends Schakeling{
	
	public SerieSchakeling(){
		super();
	}
	
	public SerieSchakeling(Component[] rij_arg) {
		super(rij_arg);
	}
	
	public String toString(){
		String s = "";
		s += "Serie";
		s += super.toString();
		return (s);
	}
	
	public float vervangingsweerstand() {
		float r = 0;
		for(int t = 0; t < super.getValue().length; t++) {
			r += super.getValue()[t].vervangingsweerstand();
		}
		return r;
	}

}
