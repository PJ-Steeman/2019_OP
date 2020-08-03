package view;
//Pieter-Jan Steeman
import javax.swing.JPanel;
import javax.swing.JSlider;

import model.Race;

public class RunnerV extends JPanel{
	
	private Race race;
	private JSlider slider;
	private int nummer;

	public RunnerV(Race r, int nr) {
		
		race = r;
		nummer = nr;
		
		slider = new JSlider(JSlider.HORIZONTAL, 0, race.getAfTeLeggenWeg(), 0);
		slider.setMajorTickSpacing(0);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setEnabled(false);

		add(slider);

	}
	
	public void update() {
		slider.setValue(race.getRunner(nummer).getAfgelegdeWeg());
	}
}
