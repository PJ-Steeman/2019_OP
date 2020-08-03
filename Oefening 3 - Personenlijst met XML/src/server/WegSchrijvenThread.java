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
			while(true) {
				try {
					sleep(20000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				s = new ObjectOutputStream(new FileOutputStream("personen.dat"));
				synchronized(personen) {
					s.writeObject(personen);
					System.out.println(personen.toString()+" - weggeschreven");
				}
				s.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
