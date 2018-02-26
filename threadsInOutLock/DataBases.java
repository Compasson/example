package threadsInOutLock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DataBases {
	
	private ArrayList<String> db;
	private Lock dblock;
	private Iterator<String> iter;
	
	public DataBases()
	{
		db = new ArrayList<>();
		dblock = new ReentrantLock();
		iter = db.iterator();
	}
	
	public void write ()
	{
		try
		{
			dblock.lock();
			db.add("Привет");
			System.out.println("Поток записи добавил новое значение в базу данных. Теперь обьем базы данных равен = " + db.size());
		}
		finally
		{
			dblock.unlock();
		}
		
	}
	
	public void read ()
	{
		try
		{
			dblock.lock();
			
			if(iter.hasNext())
			{
				System.out.println("Поток вывода считал из базы данных значение = " + iter.next());
			}
			
		}
		finally
		{
			dblock.unlock();
		}
	}

}
