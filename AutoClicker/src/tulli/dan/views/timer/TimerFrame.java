package tulli.dan.views.timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import tulli.dan.views.timer.components.DelayPanel;
import tulli.dan.views.timer.components.TimerPanel;

@SuppressWarnings("serial")
public class TimerFrame extends JFrame
{
	private int time;
	private int delay;
	private TimerPanel timerPanel;
	private DelayPanel delayPanel;
	private JButton setTimeDelayButton;
	
	public TimerFrame() 
	{
		super("Timer");
		
		setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
		
		timerPanel = new TimerPanel();
		add(timerPanel);
		
		delayPanel = new DelayPanel();
		add(delayPanel);
		
		setTimeDelayButton = new JButton("Set time and delay");
		setTimeDelayButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try(BufferedWriter writer = Files.newBufferedWriter(Paths.get("ac_time_delay.txt"), StandardOpenOption.WRITE))
				{
					writer.write(
						String.valueOf(timerPanel.getTime()) + "\n" +
						String.valueOf(delayPanel.getDelay())
					);
				} catch (IOException e1) {
					e1.printStackTrace();
				}	
				
//				System.out.println(timerPanel.getTime() + " " + delayPanel.getDelay());
			}
		});
		add(setTimeDelayButton);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,200);
		setVisible(true);
		
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}
	
}
