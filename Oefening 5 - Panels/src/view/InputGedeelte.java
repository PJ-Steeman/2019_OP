package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controller.Controller;
import model.Boodschap;
import model.BoodschappenLijst;

//Pieter-Jan Steeman
public class InputGedeelte extends JPanel{

	private JLabel aantalL = new JLabel("Aantal");
    private JTextField aantalV = new JTextField(16);
    private JLabel eenheidL = new JLabel("Eenheid");
    //private JTextField eenheidV = new JTextField(16);
    private JLabel omschrijvingL = new JLabel("Omschrijving");
    private JTextField omschrijvingV = new JTextField(16);
   
	JRadioButton kilo = new JRadioButton("Kilo");
    JRadioButton liter = new JRadioButton("Liter");
    JRadioButton stuks = new JRadioButton("Stuks");
    
    private JButton voegToe = new JButton("Voeg Toe");
    private JButton volgende = new JButton("Volgende");
    
    public InputGedeelte(BoodschappenLijst l, Controller c) {
    	
    	setLayout(new GridLayout(0,2));
    	
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
    public int getAan() {
		return Integer.parseInt(aantalV.getText());
	}
	
	public String getEen() {
		if(kilo.isSelected())
			return "Kilo";
		if(liter.isSelected())
			return "Liter";
		else
			return "Stuks";
		//return eenheidV.getText();
	}
	
	public String getOms() {
		return omschrijvingV.getText();
	}
	
}
