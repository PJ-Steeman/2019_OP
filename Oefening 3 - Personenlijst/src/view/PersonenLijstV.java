package view;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controller.Controller;
import model.PersonenLijst;
//Pieter-Jan Steeman
public class PersonenLijstV extends JFrame{

	private PersonenLijst personen;
	private Controller controller;
	
	private JLabel naamL;
	private JTextField naamT;
	private JLabel vnaamL;
	private JTextField vnaamT;
	private JLabel gemeenteL;
	private JTextField gemeenteT;
	private JRadioButton manB;
	private JRadioButton vrouwB;
	private JButton voegToeB;
	private JButton saveB;
	private ButtonGroup Bgroup;
	
	public PersonenLijstV(PersonenLijst p, Controller c) {
		
		this.personen = p;
		this.controller = c;
		
		Container cont = getContentPane();
		cont.setLayout(new GridLayout(0,2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		naamL = new JLabel("Naam : ");
		naamT = new JTextField();
		vnaamL = new JLabel("Voornaam : ");
		vnaamT = new JTextField();
		gemeenteL = new JLabel("Gemeente : ");
		gemeenteT = new JTextField();
		manB = new JRadioButton("Man");
		manB.setSelected(true);
		vrouwB = new JRadioButton("Vrouw");
		Bgroup = new ButtonGroup();
		Bgroup.add(manB);
		Bgroup.add(vrouwB);
		voegToeB = new JButton("VOEG TOE");
		saveB = new JButton("SAVE");
			
		cont.add(naamL);
		cont.add(naamT);
		cont.add(vnaamL);
		cont.add(vnaamT);
		cont.add(gemeenteL);
		cont.add(gemeenteT);
		cont.add(manB);
		cont.add(vrouwB);
		cont.add(voegToeB);
		cont.add(saveB);
		
		voegToeB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.add(naamT.getText(),vnaamT.getText(),gemeenteT.getText(),manB.isSelected());
			}
		});
		
		saveB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.wegschrijven();
			}
		});
		
		pack();
    	setVisible(true);
	}
}
