package tulli.dan.views.autoclicker.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import tulli.dan.models.Timer;

public class AutoClickerStart implements ActionListener 
{	
	private int delay;
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Timer timer = new Timer();
		
		try(BufferedReader reader = Files.newBufferedReader(Paths.get("ac_time_delay.txt")))
		{ 
			timer.setTime(Integer.parseInt(reader.readLine()));
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		Thread t1 = new Thread(timer);
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (this) {
					
					try 
					{
						BufferedReader reader = Files.newBufferedReader(Paths.get("ac_time_delay.txt"));
						setDelay(Integer.parseInt(reader.lines().skip(1).iterator().next()));
						
						Robot robot = new Robot();
						while(!timer.isFlag())
						{
							robot.mousePress(InputEvent.BUTTON3_MASK);
							robot.delay(getDelay());
							robot.mouseRelease(InputEvent.BUTTON3_MASK);
						}
					
					} 
					catch (AWTException | IOException e1) 
					{
						e1.printStackTrace();
					}
				}
			}
			
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}
}
