package controller;
//Pieter-Jan Steeman
import model.Race;

public class RunnerThread extends Thread{

	private int nummer;
	private Race race;
	private Controller cont;
	private int tot;
	private boolean einde = false;
	
	public RunnerThread(int nr, Race r, Controller c) {
		nummer = nr;
		race = r;
		cont = c;
	}
	
	public void run() {
		while(tot < race.getAfTeLeggenWeg() && !einde) {
			int afstand = (int) (Math.random()*5);
			race.getRunner(nummer).addAfgelegdeWeg(afstand);
			tot += afstand;
			cont.update();
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public void setEinde() {
		einde = true;
	}
	
}
