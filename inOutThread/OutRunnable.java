package inOutThread;

public class OutRunnable implements Runnable {
	
	BasesData bdout;
	
	public OutRunnable(BasesData bdo)
	{
		this.bdout = bdo;
	}
	
	public void run()
	{
		// цикл bdout.getList
		try{

			   boolean b = true;
			   int i = 0;
			
			   while(b == true)
			   {
				   Thread.sleep(6333);
				   System.out.println("Из базы данных прочитана строка №" + i + ". Со следующим содежанием: " + bdout.readString(i));
				   i++;
			   }
		   } catch (InterruptedException e){}
	}

}
