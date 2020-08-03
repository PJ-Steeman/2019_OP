package model;
//Pieter-Jan Steeman
public abstract class Voertuig {
	
	private static int nextNr;
	private int nummer;
	private int lengte;
	
	public abstract String toString();
	
	public Voertuig() {
		
	}
	
	public Voertuig(int len) {
		setNr();
		setLen(len);
	}
	
	public void setNr() {
		nummer = nextNr;
		nextNr ++;
	}
	
	public int getNr() {
		return nummer;
	}
	
	public void setLen(int len) {
		lengte = len;
	}
	
	public int getLen() {
		return lengte;
	}

}
