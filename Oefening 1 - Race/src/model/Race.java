package model;
//Pieter-Jan Steeman
public class Race {
	
	public static final int AANTAL = 10;
	private int afTeLeggenWeg;
	private Runner[] runners;
	
	public Race() {
		makeRunners();
	}
	
	public Race(int weg) {
		makeRunners();
		setAfTeLeggenWeg(weg);
	}
	
	public void makeRunners() {
		runners = new Runner[AANTAL];
		
		for(int i = 0; i < AANTAL; i++) {
			Runner newRunner = new Runner(i);
			runners[i] = newRunner;
		}
	}
	
	public void setAfTeLeggenWeg(int weg) {
		afTeLeggenWeg = weg;
	}
	
	public int getAfTeLeggenWeg() {
		return afTeLeggenWeg;
	}
	
	public void setRunner(Runner newRunner, int nr) {
		runners[nr] = newRunner;
	}
	
	public Runner getRunner(int nr) {
		return runners[nr];
	}
	
	public String toString() {
		return AANTAL + " spelers, Af te leggen weg = "+ getAfTeLeggenWeg() + "km";
	}

}
