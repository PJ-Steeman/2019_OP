package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
//Pieter-Jan Steeman

public class SocketLezenThread extends Thread{
	
	InputStream inStream;
	PersonenLijst personen;

	public SocketLezenThread(InputStream i, PersonenLijst p) {
		inStream = i;
		personen = p;
	}
	
	public void run() {
		ObjectInputStream in;
		Persoon p;
		try {
			in = new ObjectInputStream(inStream);
			while(true) {
				p = (Persoon) in.readObject();
				personen.voegToe(p);
				System.out.println("Ontvangen: "+p.toString());
			}
		} catch (IOException | ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}
	
}
