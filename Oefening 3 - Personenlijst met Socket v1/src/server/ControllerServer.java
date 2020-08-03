package server;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Pieter-Jan Steeman
public class ControllerServer {
	
	PersonenLijst personen;
	int poort;
	ServerSocket server;
	InputStream i;
	
	public ControllerServer() {
		i = System.in;
		datInlezen();
		poort = 33000;
		
		try {
			server = new ServerSocket(poort);
			Socket s = server.accept();
			i = s.getInputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		SocketLezenThread t1 = new SocketLezenThread(i, personen);
		t1.start();
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
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new ControllerServer();
	}
}
