package tulli.dan.views.autoclicker;

import javax.swing.JFrame;

import tulli.dan.views.autoclicker.components.AutoClickerMenuBar;
import tulli.dan.views.autoclicker.components.AutoClickerPanel;

@SuppressWarnings("serial")
public class AutoClickerFrame extends JFrame
{	
	public AutoClickerFrame()
	{
		super("AutoClicker");
		
		setJMenuBar(new AutoClickerMenuBar());
		add(new AutoClickerPanel());
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(300,100);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	}
	
}
