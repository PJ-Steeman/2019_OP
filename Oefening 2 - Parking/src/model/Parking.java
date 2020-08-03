package model;
//Pieter-Jan Steeman

import java.util.ArrayList;

public class Parking {
	
	private int capaciteit;
	private int vrij;
	private ArrayList<Voertuig> voertuigen;
	
	public Parking(int capa) {
		setCapa(capa);
		setVrij(getCapa());
		voertuigen = new ArrayList<Voertuig>();
	}
	
	public void setCapa(int capa) {
		capaciteit = capa;
	}
	
	public int getCapa() {
		return capaciteit;
	}
	
	public void setVrij(int v) {
		vrij = v;
	}
	
	public int getVrij() {
		return vrij;
	}
	
	public void in(Voertuig v) {
		voertuigen.add(v);
		setVrij(getVrij()-v.getLen());
		System.out.println(v.toString() + " TOEGEVOEGD - Vrij : " + getVrij());
	}
	
	public void out() {
		Voertuig v = voertuigen.get(0);
		voertuigen.remove(0);
		setVrij(getVrij()+v.getLen());
		System.out.println(v.toString() + " ---------------- VERWIJDERD - Vrij : " + getVrij());
	}

}
