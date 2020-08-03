package view;
//Pieter-Jan Steeman
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.Controller;
import model.Parking;

public class ParkingV extends JFrame{
	
	private Parking parking;
	private Controller controller;
	
	private JLabel capL;
	private JTextField capT;
	private JLabel vrijL;
	private JTextField vrijT;
	private JButton startB;
	
	public ParkingV(Parking p, Controller c) {
		
		this.parking = p;
		this.controller = c;
		
		Container cont = getContentPane();
		cont.setLayout(new GridLayout(0,2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		capL = new JLabel("Capaciteit : ");
		capT = new JTextField("30");
		vrijL = new JLabel("Vrije plaatsen : ");
		vrijT = new JTextField();
		startB = new JButton("START");
		
		cont.add(capL);
		cont.add(capT);
		cont.add(vrijL);
		cont.add(vrijT);
		cont.add(startB);
		
		startB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.start();
			}
		});
		
		pack();
    	setVisible(true);
    	
    	update();
	}
	
	public void update() {
		vrijT.setText(Integer.toString(parking.getVrij()));
	}

}
