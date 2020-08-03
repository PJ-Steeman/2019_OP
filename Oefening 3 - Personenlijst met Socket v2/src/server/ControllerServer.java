package server;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Pieter-Jan Steeman
public class ControllerServer {
	
	PersonenLijst personen;
	
	public ControllerServer() {
		ServerSocket server;
		int poort = 33000;

		datInlezen();
		
		try {
			server = new ServerSocket(poort);
			AcceptThread t1 = new AcceptThread(server, personen);
			t1.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
		WegSchrijvenThread t2 = new WegSchrijvenThread(personen);
		t2.start();
	}
	
	public void datInlezen() {
		try {
			ObjectInputStream s = new ObjectInputStream(new FileInputStream("personen.dat"));
			personen = (PersonenLijst) s.readObject();
			System.out.println("personen.dat ingelezen : \n");
			System.out.println(personen.toString());
		} catch (IOException | ClassNotFoundException e) {
			personen = new PersonenLijst();
			return;
		}
		
	}

	public static void main(String[] args) {
		new ControllerServer();
	}
}
