package tulli.dan.views.autoclicker.components;

import javax.swing.JMenuBar;

@SuppressWarnings("serial")
public class AutoClickerMenuBar extends JMenuBar 
{
	public AutoClickerMenuBar() 
	{
		add(new FileMenu());
	}

}
