package multithreads;

/**
 *     ����� ������� ����� ���� �������� 5 �������:
 *     
 *          1)  � ���� ������ run() ������ ��� ����������� ������. � ��������� Runnable ��� ������������ �����.
 *          2)  ������� ����� ����������� ��������� Runnable
 *          3)  ��������������� ������ ������ ������
 *          4)  ��������������� ������ ���� Thread �� ������� ������ ������
 *          5)  ��������� ����� ������� start()
 *     
 * @author IRINA
 *
 */

public class MyRunnable implements Runnable {
	
	String name;
	
	public MyRunnable(){} // 
	
	public MyRunnable(String namethread)
	{
		name = namethread;
	}
	
	public void run ()
	{
		try{

		boolean b = true;
		
		
		while(b == true)
		{
			
			System.out.println(this.name + " ����� �������c� � �����.");
			Thread.sleep(3000);
		}
		} catch (InterruptedException e)
		{
			
		}
	}

}
