package controller;
//Pieter-Jan Steeman

import model.Parking;
import view.ParkingV;

public class Controller {
	
	private Parking parking;
	private ParkingV view;
	private IngangThread in1;
	private IngangThread in2;
	private UitgangThread uit1;

	
	public Controller(int capaciteit) {
		parking = new Parking(capaciteit);
		view = new ParkingV(parking, this);
		maakThreads();
	}
	
	public void maakThreads() {
		in1 = new IngangThread(false, parking, this);
		in2 = new IngangThread(true, parking, this);
		uit1 = new UitgangThread(parking, this);
	}
	
	public void update() {
		view.update();
	}
	
	public void start() {
		in1.start();
		in2.start();
		uit1.start();
	}
	
	public static void main(String[] args) {
		new Controller(30);
	}

}
