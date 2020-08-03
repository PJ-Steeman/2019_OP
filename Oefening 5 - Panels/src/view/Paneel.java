package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.Controller;
import model.Boodschap;
import model.BoodschappenLijst;

//Pieter-Jan Steeman
public class Paneel extends JFrame implements ActionListener{
	
	private BoodschappenLijst lijst;
	private Controller cont;
	
	InputGedeelte i;
	OutputGedeelte o;
	OutputLijst ol;
	
    public void actionPerformed(ActionEvent add) {
    		System.out.println("Boodschap toegevoegd");
        }

    public Paneel(BoodschappenLijst l, Controller c) {
    	
    	this.lijst = l;
    	this.cont = c;
    	
    	i = new InputGedeelte(lijst,cont);
        o = new OutputGedeelte(lijst,cont);
        ol = new OutputLijst(lijst,cont);
        
       	getContentPane();
    	setLayout(new BorderLayout());
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
 
        add(i, BorderLayout.PAGE_START);
        add(o, BorderLayout.CENTER);
        add(ol, BorderLayout.PAGE_END);
    	
    	pack();
    	setVisible(true);
			
		}
    
    public int getAant() {
    	return i.getAan();
    }
    
    public String getEenh() {
    	return i.getEen();
    }
    
    public String getOmsc() {
    	return i.getOms();
    }
    
    public void update(Boodschap n) {
    	o.update(n);
    	ol.update();
    }
}
