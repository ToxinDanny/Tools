package tulli.dan.views.timer.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import tulli.dan.views.timer.TimerFrame;

public class SetTimeDelayAction implements ActionListener 
{
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		new TimerFrame();
		
	}

}
