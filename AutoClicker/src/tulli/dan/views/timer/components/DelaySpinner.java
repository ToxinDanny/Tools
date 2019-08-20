package tulli.dan.views.timer.components;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

@SuppressWarnings("serial")
public class DelaySpinner extends JSpinner 
{
	private int delay;
	private SpinnerNumberModel model;
	
	public DelaySpinner() 
	{
		model = new SpinnerNumberModel(10, 10, null, 10);
		setModel(model);
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	public SpinnerNumberModel getSpinnerModel() {
		return model;
	}

	public void setSpinnerModel(SpinnerNumberModel model) {
		this.model = model;
	}
	
	
}
