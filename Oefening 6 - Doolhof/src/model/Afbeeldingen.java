package model;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Afbeeldingen extends JComponent{
	
	public static final int BREED = 50;
	public static final int HOOG = 50;
	
	private BufferedImage goudAfb = null;
	private BufferedImage spelerAfb = null;
	private BufferedImage muurAfb = null;
	private BufferedImage leegAfb = null;
	private BufferedImage gekozenAfb = null;
	private File goud = null;
	private File speler = null;
	private File muur = null;
	private File leeg = null;
	
	
	public Afbeeldingen(int soort) {
		
		goud = new File("goud.png");
		speler = new File("speler.png");
		muur = new File("muur.png");
		
		goudAfb = new BufferedImage(BREED, HOOG, BufferedImage.TYPE_INT_ARGB);
		spelerAfb = new BufferedImage(BREED, HOOG, BufferedImage.TYPE_INT_ARGB);
		muurAfb = new BufferedImage(BREED, HOOG, BufferedImage.TYPE_INT_ARGB);
		
		try {
			goudAfb = ImageIO.read(goud);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			spelerAfb = ImageIO.read(speler);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			muurAfb = ImageIO.read(muur);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		switch(soort) {
		case(1) : 	gekozenAfb = muurAfb;
					break;
		case(2) : 	gekozenAfb = spelerAfb;
					break;
		case(3) : 	gekozenAfb = goudAfb;
					break;
		}

	}
	
	public void paintComponent(Graphics g) {
			g.drawImage(gekozenAfb, 0, 0, BREED, HOOG, null);
			
	}

}
