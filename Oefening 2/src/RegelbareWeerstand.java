// Pieter-Jan Steeman
public class RegelbareWeerstand extends Weerstand{
		
		private float min = 0;
		private float max = 0;
		
		public RegelbareWeerstand(int mini, int maxi){
			super(mini);
			min = mini;
			max = maxi;
		}
		
		public void verhoog(float fractie) {
			float huidig = super.getValue();
			float nieuw = huidig+(max-min)*fractie;
			if (nieuw > max)
				nieuw = max;
			if (nieuw < min)
				nieuw = min;
			super.setValue(nieuw);
		}
		
		public String toString() {
			float huidig = super.getValue();
			return ("Weerstand van "+Float.toString(huidig)+" Ohm met een mimimum van "+Float.toString(min)+" Ohm en een maximum van "+Float.toString(max)+" Ohm");
		}
}
