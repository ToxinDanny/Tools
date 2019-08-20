package tulli.dan;

import javax.swing.SwingUtilities;

import tulli.dan.views.autoclicker.AutoClickerFrame;

public class AutoClicker
{	
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(AutoClickerFrame::new);
		
	}
	
	

}
