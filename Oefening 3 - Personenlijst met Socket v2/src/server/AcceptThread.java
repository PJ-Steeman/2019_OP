package server;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AcceptThread extends Thread{
	
	ServerSocket server;
	PersonenLijst personen;
	
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
			} catch (IOException e) {
				e.printStackTrace();
			}	
			
			SocketLezenThread t1 = new SocketLezenThread(i, personen);
			t1.start();
		}
		
	}

}
