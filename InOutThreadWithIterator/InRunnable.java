package InOutThreadWithIterator;

public class InRunnable implements Runnable{
	
BasesData bdout;
	
	public InRunnable(BasesData bdi)
	{
		this.bdout = bdi;
	}
	
	public void run()
	{
		// поток цикл записи в базу данных
		try{

			   boolean b = true;
			   int iter = 0;
			
			   while(b == true)
			   {				
				   bdout.addString("ЗАПИСЬ №" + String.valueOf(iter));
				   System.out.println("Запись номер №" + String.valueOf(iter) + " сохранена в базе данных");
				   iter++;
				   Thread.sleep(3000);
			   }
		   } catch (InterruptedException e){}
	}
}
