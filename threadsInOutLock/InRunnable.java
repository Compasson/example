package threadsInOutLock;

public class InRunnable implements Runnable {
	
    
	public DataBases dbin;
 
	
	public InRunnable(DataBases lin)
	{
		dbin = lin;
	}
	
	public void run ()
	{
		try
		{
           dbin.write();
           Thread.sleep(1000);
						
		} catch (InterruptedException e)
		{
			Thread.currentThread().interrupt();
		}
	}	
	

}
