package model;
//Pieter-Jan Steeman

public class Bus extends Voertuig{
	
	public Bus() {
		super(3);
	}
	
	public String toString() {
		return "Bus  - nummer : "+super.getNr()+" - lengte : "+super.getLen();
	}

}
