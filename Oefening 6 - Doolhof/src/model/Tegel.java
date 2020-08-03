package model;
//Pieter-Jan Steeman
public abstract class Tegel {

	protected Gebied[][] gebieden = null;
	
	public static final int LEEG = 0;
	public static final int MUUR = 1;
		
	public Tegel(){
		gebieden = new Gebied[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				gebieden[i][j] = new Gebied(LEEG);
			}
		}
	}
	
	public Gebied getGebied(Coordinaat c) {
		return gebieden[c.getRij()][c.getKolom()];
	}
	
	public void setGebied(Coordinaat c, Gebied g) {
		gebieden[c.getRij()][c.getKolom()] = g;
	}
	
	public String toString() {
		String s = "";
		for(int i = 0; i < 3; i++) {
			s += "|";
			for(int j = 0; j < 3; j++) {
				s += gebieden[i][j].toString();
				s += "|";
			}
			s += "\n";
		}
		return s;
	}
	
	public void draai(int i) {
		for(int j = 0; j < i; j++) {
			Gebied s = gebieden[0][1];
			gebieden[0][1] = gebieden[1][2];
			gebieden[1][2] = gebieden[2][1];
			gebieden[2][1] = gebieden[1][0];
			gebieden[1][0] = s;
		}
	}
}
