package client;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.net.Socket;

import server.PersonenLijst;
import server.Persoon;
//Pieter-Jan Steeman
public class Controller {
	
	PersonenLijst personen;
	PersonenLijstV view;
	
	String server;
	int poort;
	Socket socket;
	OutputStream u = System.out;
	ObjectOutputStream uit;
	
	public Controller() {
		personen = new PersonenLijst();
		view = new PersonenLijstV(personen, this);

		server = "127.0.0.1";
		poort = 33000;
		
		try {
			socket = new Socket(server,poort);
			u = socket.getOutputStream();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			uit = new ObjectOutputStream(u);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void add(String n, String v, String g, boolean man) {
		Persoon p = new Persoon(n,v,g,man);
		personen.voegToe(p);
		System.out.println(p.toString());
		
		try {
			uit.writeObject(p);
			System.out.println(p.toString() + "verzonden");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void wegschrijven() {
		try {
			ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream("personen.dat"));
			s.writeObject(personen);
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Controller();
	}
}
