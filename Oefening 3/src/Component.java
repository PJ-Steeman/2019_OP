// Pieter-Jan Steeman
public abstract class Component {
	
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
