package server;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.Observer;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

//Pieter-Jan Steeman
public class ControllerServer implements Observer{
	
	private PersonenLijst personen;
	
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
		personen.addObserver(this);
	}
	
	public void update(Observable obj, Object arg) {
		ObjectOutputStream s;
		try {
			s = new ObjectOutputStream(new FileOutputStream("personen.dat"));
			synchronized(personen) {
				s.writeObject(personen);
				System.out.println(personen.toString()+" - weggeschreven");
			}
			s.close();
		} catch (IOException e) {
			return;
		}		
	}
	
	public void datInlezen() {
		personen = PersonenLijst.getInstance();
		try {
			ObjectInputStream s = new ObjectInputStream(new FileInputStream("personen.dat"));
			personen = (PersonenLijst) s.readObject();
			System.out.println("personen.dat ingelezen : \n");
			System.out.println(personen.toString());
		} catch (IOException | ClassNotFoundException e) {
			
			return;
		}
	}

	public static void main(String[] args) {
		new ControllerServer();
	}
}
