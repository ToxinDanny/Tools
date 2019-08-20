package tulli.dan.views.autoclicker.components;

import javax.swing.JMenu;

@SuppressWarnings("serial")
public class FileMenu extends JMenu
{
	public FileMenu() 
	{
		super("File");

		add(new SetTimeDelayMenuItem());
	}
	
	
}
