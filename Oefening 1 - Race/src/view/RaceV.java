package view;
//Pieter-Jan Steeman
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import controller.Controller;
import model.Race;

public class RaceV extends JFrame{
	
	private Race race;
	private Controller controller;
	private RunnerV[] runnerV;
		
	public RaceV(Race r, Controller c) {
		
		this.race = r;
		this.controller = c;
		
		getContentPane();
		setLayout(new GridLayout(0,1));
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    	runnerV = new RunnerV[race.AANTAL];
		
		for(int i = 0; i < Race.AANTAL; i++ ) {
			RunnerV newRunnerV = new RunnerV(race, i);
			add(newRunnerV);
			runnerV[i] = newRunnerV;
		}
		
		JButton start = new JButton("START");
		add(start);
		
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Up) {
				controller.start();
			}
			
     	});

		
    	pack();
    	setVisible(true);
    	
    	update();
		
	}
	
	public void update() {
		for(int i = 0; i < Race.AANTAL; i++ ) {
			runnerV[i].update();
		}
	}


}
