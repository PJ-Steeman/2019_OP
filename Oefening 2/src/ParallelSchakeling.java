// Pieter-Jan Steeman
public class ParallelSchakeling extends Schakeling{

	public ParallelSchakeling(){
		super();
	}
	
	public ParallelSchakeling(Weerstand[] rij_arg) {
		super(rij_arg);
	}
	
	public String toString(){
		String s = "";
		s += "Parallel";
		s += super.toString();
		return (s);
	}
	
	public float vervangingsweerstand() {
		
		float r = 0;
		float rinv = 0;
		for(int t = 0; t < super.getValue().length; t++) {
			rinv += 1/(super.getValue()[t].getValue());
		}
		r = 1/rinv;
		return r;
	}
}
