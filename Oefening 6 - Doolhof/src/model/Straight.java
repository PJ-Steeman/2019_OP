package model;
//Pieter-Jan Steeman
public class Straight extends Tegel {

	public Straight() {
		super.gebieden[0][0] = new Gebied(MUUR);
		super.gebieden[0][1] = new Gebied(MUUR);
		super.gebieden[0][2] = new Gebied(MUUR);
		super.gebieden[2][0] = new Gebied(MUUR);
		super.gebieden[2][1] = new Gebied(MUUR);
		super.gebieden[2][2] = new Gebied(MUUR);
	}
}
