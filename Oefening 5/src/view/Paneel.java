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
	
	private JLabel aantalL = new JLabel("Aantal");
    private JTextField aantalV = new JTextField(16);
    private JLabel eenheidL = new JLabel("Eenheid");
    //private JTextField eenheidV = new JTextField(16);
    private JLabel omschrijvingL = new JLabel("Omschrijving");
    private JTextField omschrijvingV = new JTextField(16);
   
	JRadioButton kilo = new JRadioButton("Liter");
    JRadioButton liter = new JRadioButton("Kilo");
    JRadioButton stuks = new JRadioButton("Stuks");
    
    private JButton voegToe = new JButton("Voeg Toe");
    private JButton volgende = new JButton("Volgende");
    
    private JLabel boodschap = new JLabel("Welkom");
    
    public void actionPerformed(ActionEvent add) {
    		System.out.println("Boodschap toegevoegd");
        }

    public Paneel(BoodschappenLijst l, Controller c) {
    	
    	this.lijst = l;
       	getContentPane();
    	setLayout(new GridLayout(0,2));
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
 
        ButtonGroup groep = new ButtonGroup();
        
        groep.add(kilo);
        groep.add(liter);
        groep.add(stuks);
        
    	add(aantalL);
    	add(aantalV);
    	add(eenheidL);
    	add(kilo);
        add(liter);
        add(stuks);
    	//add(eenheidV);
    	add(omschrijvingL);
    	add(omschrijvingV);
    	add(voegToe);
    	add(volgende);
    	add(boodschap);
    	pack();
    	setVisible(true);
     	
     	voegToe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent add) {
				c.doAdd();
			}
			
     	});
     	
		volgende.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent next) {
				c.doVolgend();
			}
     		
     	});
			
		}
	public int getAant() {
		return Integer.parseInt(aantalV.getText());
	}
	
	public String getEenh() {
		if(kilo.isSelected())
			return "Kilo";
		if(liter.isSelected())
			return "Liter";
		else
			return "Stuks";
		//return eenheidV.getText();
	}
	
	public String getOmsc() {
		return omschrijvingV.getText();
	}
	
	public void update(Boodschap n) {
		boodschap.setText(n.toString());
    }
}
