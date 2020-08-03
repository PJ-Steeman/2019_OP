package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
//Pieter-Jan Steeman

public class SocketLezenThread extends Thread{
	
	InputStream inStream;
	PersonenLijst personen;

	public SocketLezenThread(InputStream i, PersonenLijst p) {
		inStream = i;
		personen = p;
	}
	
	public void run() {
		InputStreamReader in;
		Persoon p;
		try {
			in = new InputStreamReader(inStream);
			BufferedReader b = new BufferedReader(in);
			while(true) {
				String ontvangen = b.readLine();
				String[] gesplitst = ontvangen.split(":");
				System.out.println(ontvangen);
				p = new Persoon(gesplitst[2],gesplitst[1],gesplitst[3],Boolean.parseBoolean(gesplitst[4]));
				
				synchronized(personen) {
					personen.voegToe(p);
				}
				
				System.out.println("Ontvangen: "+p.toString());
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
}
