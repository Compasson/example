package onethread;

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
	
	public void run ()
	{
		try{

		boolean b = true;
		while(b == true)
		{
			System.out.println("������ �����");
			Thread.sleep(3000);;
		}
		} catch (InterruptedException e)
		{
			
		}
	}

}
