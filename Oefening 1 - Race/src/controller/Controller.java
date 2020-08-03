package controller;
//Pieter-Jan Steeman
import model.Race;
import view.RaceV;

public class Controller {
	
	private Race race;
	private RaceV raceV;
	private RunnerThread[] threads;
	
	public Controller(int afgelegdeWeg) {
		race = new Race(afgelegdeWeg);
		raceV = new RaceV(race, this);
		threads = new RunnerThread[Race.AANTAL];
		maakThreads();
	}
	
	public void update() {
		raceV.update();
	}
	
	public void maakThreads() {
		for(int i = 0; i < Race.AANTAL; i++) {
			RunnerThread thread = new RunnerThread(i, race, this);
			threads[i] = thread;
		}
	}
	
	public void start() {
		for(int i = 0; i < Race.AANTAL; i++) {
			threads[i].start();
		}
		update();
	}
	
	public static void main(String[] args) {
		new Controller(25);
	}

}
