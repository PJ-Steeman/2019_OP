package server;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//Pieter-Jan Steeman

public class WegSchrijvenThread extends Thread{
	
	PersonenLijst personen;
	
	public WegSchrijvenThread(PersonenLijst p) {
		personen = p;
	}
	
	public void run() {
		ObjectOutputStream s;
		try {
			s = new ObjectOutputStream(new FileOutputStream("personen.dat"));
			while(true) {
				s.writeObject(personen);
				try {
					sleep(60000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
