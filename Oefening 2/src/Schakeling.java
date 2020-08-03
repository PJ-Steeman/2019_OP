// Pieter-Jan Steeman
public abstract class Schakeling {
	
	private Weerstand[] rij;
	
	public Schakeling(){
		rij = new Weerstand[0];
	}
	
	public Schakeling(Weerstand[] rij_arg) {
		rij = rij_arg;
	}
	
	public Weerstand[] getValue(){
		return rij;	
	}
	
	public void setValue(Weerstand[] rij_arg){
		rij = rij_arg;
	}
	
	public String toString(){
		String s = "";
		s += "Schakeling van "+ Integer.toString(rij.length)+" weerstand(en) : ";
		for(int i = 0; i < rij.length; i++) {
			s += rij[i].toString();
			if(i+1 < rij.length)
				s += ", ";
		}
		return (s);
	}
	
	public void voegToe(Weerstand r) {
		Weerstand[] rij2 = new Weerstand[(rij.length+1)];
		for(int i = 0; i < rij.length; i++) {
			rij2[i] = rij[i];
		}
		rij2[rij.length] = r;
		rij = rij2;
	}
	
	public abstract float vervangingsweerstand();
	
	public float spanning(float i) {
		float u = i*this.vervangingsweerstand();
		return u;
	}
	
	public float stroom(float u) {
		float i = u/this.vervangingsweerstand();
		return i;
	}
}
