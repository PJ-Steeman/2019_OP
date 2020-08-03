package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Controller;
import model.Doolhof;

public class KnoppenPaneel extends JPanel{
	
	private JButton Up = new JButton("Up");
	private JButton Right = new JButton("Right");
	private JButton Down = new JButton("Down");
    private JButton Left = new JButton("Left");
  
    public KnoppenPaneel(Doolhof d, Controller c) {
    	setLayout(new BorderLayout());
    	
    	add(Up, BorderLayout.PAGE_START);
    	add(Right, BorderLayout.LINE_END);
    	add(Down, BorderLayout.PAGE_END);
    	add(Left, BorderLayout.LINE_START);
    	
    	Up.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Up) {
				c.Up();
			}
			
     	});
    	
    	Right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Right) {
				c.Right();
			}
			
     	});
    	
    	Down.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Down) {
				c.Down();
			}
			
     	});
    	
    	Left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Left) {
				c.Left();
			}
			
     	});
    }

}
