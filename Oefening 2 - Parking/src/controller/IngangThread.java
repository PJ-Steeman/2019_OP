package controller;
//Pieter-Jan Steeman
import model.Auto;
import model.Bus;
import model.Parking;
import model.Voertuig;

public class IngangThread extends Thread{
	
	private Parking parking;
	private Controller controller;
	private Voertuig voertuig;
	private boolean selectie;

	public IngangThread(boolean voer, Parking p, Controller c) {

		parking = p;
		controller = c;
		selectie = voer;
	
	}
	
	public void run() {
		while(true) {

			if(selectie) {
				voertuig = new Bus();
			}
			else {
				voertuig = new Auto();
			}	
			
			synchronized (parking) {
				while(parking.getVrij() < voertuig.getLen()) {
					System.out.println(voertuig.toString() + " WACHTEND - Vrij : " + parking.getVrij());
					try {
						parking.wait();
					} catch (InterruptedException e) {
						return;
					}
				}
				parking.in(voertuig);
				parking.notifyAll();
			}
			
			controller.update();
			try {
				sleep(500);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}
