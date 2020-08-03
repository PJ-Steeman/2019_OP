package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import controller.Controller;
import model.Boodschap;
import model.BoodschappenLijst;

public class OutputLijst extends JPanel{
	
	private JTextArea tekst = new JTextArea("Boodschappen lijstje");
	private JScrollPane scrollPane = new JScrollPane(tekst);

	private BoodschappenLijst lijst;

	public OutputLijst(BoodschappenLijst l, Controller c) {
		
		setLayout(new BorderLayout());
		
		this.lijst = l;
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
		
		add(scrollPane);
	}
	
	public void update() {
		tekst.setText(lijst.toString());
    }
}
