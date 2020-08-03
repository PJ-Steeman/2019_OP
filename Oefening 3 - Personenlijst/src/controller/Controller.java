package controller;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.net.Socket;

import model.PersonenLijst;
import model.Persoon;
import view.PersonenLijstV;
//Pieter-Jan Steeman
public class Controller {
	
	PersonenLijst personen;
	PersonenLijstV view;
	
//	String server;
//	int poort;
//	Socket socket;
	
	public Controller() {
		personen = new PersonenLijst();
		view = new PersonenLijstV(personen, this);

//		server = "127.0.0.1";
//		poort = 33000;
//		
//		try {
//			socket = new Socket(server,poort);
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
	}
	
	public static void main(String[] args) {
		new Controller();
	}

	public void add(String n, String v, String g, boolean man) {
		Persoon p = new Persoon(n,v,g,man);
		personen.voegToe(p);
		System.out.println(p.toString());
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
}
