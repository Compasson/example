package inOutThread;

import java.awt.EventQueue;

/**
 *    ����� ���������� �������� ��������� ���� ����.
 *    � ������ ��������� 3 ������: ��������, ������������ � ����������.
 *    ���������� ������������ � ������� ������� ArrayList
 *    
 *        ����� �� ���� ������: ���������� i-��� ������� �����, � ������ �� �����������. ��� ������ ����������� �������� ������������ � ���� ������ ������� ���:
 *        
 *                  1) ����������� ����� ����������� ����� ������������� � ��������� ������� ����, ����� ��������.
 *                  2) ������� � ������������ ������ ���� ������ ��� �������������
 *                  3) ������� � ������������ ������ 3333, � � ������������� 3000. ����������� �������������� ����������� � ���� ������ ���������.
 * 
 * @author IRINA
 *
 */

public class TestInOutThread {

	public static void main(String[] args) {
		
		// 
		EventQueue.invokeLater(new Runnable()
        {
           public void run()
           {
        	   BasesData bd = new BasesData();
        	   InRunnable ri = new InRunnable(bd);
        	   OutRunnable ro = new OutRunnable(bd);
        	   Thread t1 = new Thread(ro);
        	   Thread t2 = new Thread(ri);
   			   t1.start();
   			   t2.start();

           }
        });
		

	}

}
