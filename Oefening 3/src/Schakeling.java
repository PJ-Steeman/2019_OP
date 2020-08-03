// Pieter-Jan Steeman
public abstract class Schakeling extends Component{
	
	private Component[] rij;
	
	public Schakeling(){
		rij = new Weerstand[0];
	}
	
	public Schakeling(Component[] rij_arg) {
		rij = rij_arg;
	}
	
	public Component[] getValue(){
		return rij;	
	}
	
	public void setValue(Component[] rij_arg){
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
	
	public void voegToe(Component r) {
		Component[] rij2 = new Component[(rij.length+1)];
		for(int i = 0; i < rij.length; i++) {
			rij2[i] = rij[i];
		}
		rij2[rij.length] = r;
		rij = rij2;
	}
	
}
