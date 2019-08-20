package tulli.dan.views.timer.components;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

@SuppressWarnings("serial")
public class TimerSpinner extends JSpinner
{
	private int time;
	private SpinnerNumberModel model;
	
	public TimerSpinner() 
	{
		model = new SpinnerNumberModel(0, 0, null, 1);
		setModel(getSpinnerModel());
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public SpinnerNumberModel getSpinnerModel() {
		return model;
	}

	public void setSpinnerModel(SpinnerNumberModel model) {
		this.model = model;
	}
	

}
