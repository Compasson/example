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
 *     � ���� ��������� ��������� 5 �������, ��� ������� ������ �������� ���� ��� ����� �����������.
 *     
 * @author IRINA
 *
 */

import java.util.ArrayList;

public class TestMultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("������");
		list.add("������");
		list.add("������");
		list.add("���������");
		list.add("�����");

		for(int i = 0; i < 5; i++ )
		{
			MyRunnable r = new MyRunnable(list.get(i));
			Thread t = new Thread(r);
			t.start();
		}


	}

}
