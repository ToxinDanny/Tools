package tulli.dan.views.timer.components;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class DelayPanel extends JPanel
{
	private int delay;
	private JLabel label;
	private DelaySpinner delaySpinner;
	
	public DelayPanel() 
	{
		label = new JLabel("Delay: ");
		add(label);
		
		delaySpinner = new DelaySpinner();
		delaySpinner.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				setDelay(delaySpinner.getSpinnerModel().getNumber().intValue());
				
			}
		});
		add(delaySpinner);
		
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}
	
	
}
