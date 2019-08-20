package tulli.dan.views.autoclicker.components;

import javax.swing.JButton;

import tulli.dan.views.autoclicker.actions.AutoClickerStart;

@SuppressWarnings("serial")
public class AutoClickerButton extends JButton 
{	
	public AutoClickerButton()
	{
		super("ON");
		setVisible(true);
		
		addActionListener(new AutoClickerStart());
		
	}
	
}
