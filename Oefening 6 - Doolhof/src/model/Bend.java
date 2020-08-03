package model;
//Pieter-Jan Steeman
public class Bend extends Tegel {

	public Bend() {
		super.gebieden[0][0] = new Gebied(MUUR);
		super.gebieden[0][2] = new Gebied(MUUR);
		super.gebieden[1][2] = new Gebied(MUUR);
		super.gebieden[2][0] = new Gebied(MUUR);
		super.gebieden[2][1] = new Gebied(MUUR);
		super.gebieden[2][2] = new Gebied(MUUR);
	} 
}
