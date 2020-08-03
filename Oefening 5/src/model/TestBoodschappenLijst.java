/*package model;

import view.Paneel;

//Pieter-Jan Steeman
public class TestBoodschappenLijst {

		public static void main(String[] args) {
			
			BoodschappenLijst l1 = new BoodschappenLijst();
			
			Boodschap b1;
			Boodschap b2;
			Boodschap b3;
			
			Paneel p = new Paneel(l1);
			
			b1 = new Boodschap(12, "Eieren", "Large");
			b2 = new Boodschap(2, "Bloem", "Zak 1 Kg");
			
			l1.voegToe(b1);
			l1.voegToe(b2);
			
			try {

				b3 = new Boodschap(-5, "weet ik veel", "iets");
				

				l1.voegToe(b3);
			}catch(IllegalArgumentException e) {
			    System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
			}
			
			System.out.println(l1.volgendeBoodschap());
			System.out.println(l1.volgendeBoodschap());
			System.out.println(l1.volgendeBoodschap());
			System.out.println(l1.volgendeBoodschap());
			System.out.println(l1.volgendeBoodschap());
			
			System.out.println(l1.toString());
		}

}
*/