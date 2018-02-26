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
			db.add("������");
			System.out.println("����� ������ ������� ����� �������� � ���� ������. ������ ����� ���� ������ ����� = " + db.size());
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
			
			if(db.peek() != null) // ����� peek() ���������� �������� �������, �� �� ������� ���. ���������� NULL, ���� ��������� ������.
			{		
				System.out.println("����� ������ ������ �� ���� ������ �������� = " + db.poll()); //����� poll() ���������� �������� ������� � ������� ���!
			}			
		}
		finally
		{
			dblock.unlock();
		}
	}

}
