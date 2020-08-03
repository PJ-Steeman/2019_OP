// Pieter-Jan Steeman
public abstract class GekleurdeBand {
	
	public abstract int getalWaarde();
	public abstract String toString();
	
	public static GekleurdeBand zetStringom(String kleur) {
		if(kleur == "rood")
			return new RodeBand();
		if(kleur == "bruin")
			return new BruineBand();
		else
			return new ZwarteBand();
	}
}
