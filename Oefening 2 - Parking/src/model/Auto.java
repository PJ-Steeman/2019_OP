package model;
//Pieter-Jan Steeman
public class Auto extends Voertuig{
	
	public Auto() {
		super(1);
	}

	public String toString() {
		return "Auto - nummer : "+super.getNr()+" - lengte : "+super.getLen();
	}

}
