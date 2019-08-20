package tulli.dan.views.timer.components;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class TimerPanel extends JPanel 
{
	private int time;
	private JLabel label;
	private TimerSpinner timerSpinner;
	
	public TimerPanel() 
	{
		label = new JLabel("Time: ");
		add(label);
		
		timerSpinner = new TimerSpinner();
		timerSpinner.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				setTime(timerSpinner.getSpinnerModel().getNumber().intValue());
				
			}
		});
		add(timerSpinner);
		
		setVisible(true);
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	
}
