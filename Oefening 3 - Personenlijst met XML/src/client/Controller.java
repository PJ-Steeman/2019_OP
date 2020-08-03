package client;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

//Pieter-Jan Steeman
public class Controller {
	
	PersonenLijstV view;
	OutputStreamWriter uit;
	
	public Controller() {
		view = new PersonenLijstV(this);

		String server = "127.0.0.1";
		int poort = 33000;
		OutputStream u = System.out;
		
		try {
			Socket socket = new Socket(server,poort);
			u = socket.getOutputStream();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		uit = new OutputStreamWriter(u);
		
	}

	public void add(String n, String v, String g, boolean man) {
		String persoon = "<persoon><voornaam>" + v + "</voornaam><achternaam>" + n + "</achternaam><gemeente>" + g + "</gemeente><geslacht>" + man + "</geslacht></persoon>";
		System.out.println(persoon);
		PrintWriter p = new PrintWriter(uit);
		p.println(persoon);
		p.flush();
		System.out.println(p.toString() + " - verzonden");
	}

	public static void main(String[] args) {
		new Controller();
	}
}
