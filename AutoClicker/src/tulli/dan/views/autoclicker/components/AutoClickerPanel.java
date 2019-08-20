package tulli.dan.views.autoclicker.components;

import java.awt.GridLayout;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class AutoClickerPanel extends JPanel 
{
	public AutoClickerPanel() 
	{
		setLayout(new GridLayout());
		
		add(new AutoClickerButton());
		
		setVisible(true);

	}
	
}
