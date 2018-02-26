package threadsInOutLock2.copy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DataBases {
	
	private Queue<String> db;
	private Lock dblock;
	
	public DataBases()
	{
		db = new LinkedList<>();
		dblock = new ReentrantLock();
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
			
			if(db.peek() != null) // Метод peek() возвращает головной элемент, но не удаляет его. Возвращает NULL, если коллекция пустая.
			{		
				System.out.println("Поток вывода считал из базы данных значение = " + db.poll()); //Метод poll() возвращает головной элемент и удаляет его!
			}			
		}
		finally
		{
			dblock.unlock();
		}
	}

}
