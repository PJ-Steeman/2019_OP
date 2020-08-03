package controller;
//Pieter-Jan Steeman
import model.Parking;
import model.Voertuig;

public class UitgangThread extends Thread{
	
	private Parking parking;
	private Controller controller;
	
	public UitgangThread(Parking p, Controller c) {
		
		parking = p;
		controller = c;
	}
	
	public void run() {
		while(true) {
			synchronized (parking) {
				while(parking.getVrij() == parking.getCapa()) {
					try {
						parking.wait();
					} catch (InterruptedException e) {
						return;
					}
				}
				parking.out();
				parking.notifyAll();
			}
			controller.update();
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				return;
			}
		}

	}

}
