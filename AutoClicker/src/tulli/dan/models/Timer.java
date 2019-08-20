package tulli.dan.models;

public class Timer implements Runnable
{	
	private int time;		// in seconds
	private boolean flag;
	
	public void count() {
		
		try 
		{
			for(int i = 0; i < time; i++)
				Thread.sleep(1000);
			
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		setFlag(true);
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public void run() {
		synchronized(this) {
			count();
		}
		
	}
	
}
