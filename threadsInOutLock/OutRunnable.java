package threadsInOutLock;


public class OutRunnable implements Runnable {
	
    
	public DataBases dbin;
 
	
	public OutRunnable(DataBases lin)
	{
		dbin = lin;
	}
	
	public void run ()
	{

		try
		{
           dbin.read();
           Thread.sleep(3000);
						
		} catch (InterruptedException e)
		{
			Thread.currentThread().interrupt();
		}
	}	
	

}
