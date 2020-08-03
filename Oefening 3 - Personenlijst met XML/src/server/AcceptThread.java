package server;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class AcceptThread extends Thread{
	
	private ServerSocket server;
	private PersonenLijst personen;
	private XMLParser parser;
	private SAXParser par;
	
	public AcceptThread(ServerSocket s, PersonenLijst p) {
		server = s;
		personen = p;
	}
	
	public void run() {
		
		InputStream i = System.in;
		while(true)
		{
			try {
				Socket s = server.accept();
				i = s.getInputStream();
				try {
					par = SAXParserFactory.newInstance().newSAXParser();
					par.parse(i, parser);
				} catch (ParserConfigurationException | SAXException e1) {
					return;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}	
			
			SocketLezenThread t1 = new SocketLezenThread(i, personen);
			t1.start();
		}
		
	}

}
