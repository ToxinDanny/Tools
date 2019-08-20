package tulli.dan.views.autoclicker.components;

import javax.swing.JMenuItem;

import tulli.dan.views.timer.actions.SetTimeDelayAction;

@SuppressWarnings("serial")
public class SetTimeDelayMenuItem extends JMenuItem 
{
	public SetTimeDelayMenuItem() 
	{
		super("Set time and delay");
		
		addActionListener(new SetTimeDelayAction());
	}
	
	
}
