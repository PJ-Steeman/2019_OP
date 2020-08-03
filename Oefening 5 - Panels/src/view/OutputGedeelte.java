package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import controller.Controller;
import model.Boodschap;
import model.BoodschappenLijst;

public class OutputGedeelte extends JPanel{
	
    private JLabel boodschap = new JLabel("Welkom");

    public OutputGedeelte(BoodschappenLijst l, Controller c) {
    	
    	add(boodschap);
    }
    
    public void update(Boodschap n) {
		boodschap.setText(n.toString());
    }
}
