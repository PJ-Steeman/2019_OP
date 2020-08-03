package model;
//Pieter-Jan Steeman
public class Cross extends Tegel {

	public Cross() {
		super.gebieden[0][0] = new Gebied(MUUR);
		super.gebieden[0][2] = new Gebied(MUUR);
		super.gebieden[2][0] = new Gebied(MUUR);
		super.gebieden[2][2] = new Gebied(MUUR);
	}
}
