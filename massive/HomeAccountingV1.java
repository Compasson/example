package massive;

import java.util.ArrayList;
import java.util.Date;

import org.omg.CORBA.portable.ValueBase;


public class HomeAccountingV1 {

	public static void main(String[] args) {
        /*
         * # 2
         *    �������� ����, ���� �� ������ ������ �� ������� �����, �� ������� ���.
         *    �����. �������������� �������� ������� ������ �� ������ ����,
         * ����� ����� ���������, � �������������� ��������� ����� ���������
         * ����.�������� ������ ��������� 
         * 
         *    �������� � ����������:
         *                          �����
         *                          ����� ������ �� 1 �� 10 ��������� (� ������ ������� ������ ���������������)
         *   
         *    ����� ���� ������
         *                          
         */
		String[] catg = new String[2];
		catg[0] = "�������";
		catg[1] = "����������";
		
	    class Oper {
			    public int count;

			    Oper(){};	
		    }

	        // ����� ���� ������, ���� �������    
	        class BaseMonth {
	        	public String m;
	        	public ArrayList<Oper>[] mass;
	        	
	            /*
	             * ����������� ��� ����.������ ��� ������� ����. ����� �������� ����������� ��� ����� ����  - ��������������.
	             */
	        	public BaseMonth() {
					// ���. �������� ������� �� ������ ����
	        		Date d = new Date();
	        		m = (d.toString()).substring(4, 7);
	        		
	        	    mass  =  (ArrayList<Oper>[]) new ArrayList[10];
	                      for  (int i = 0; i < 10; i++ ) {
	                	      Oper iOper = new Oper();
	     	                  mass[i].add(iOper);
	                      }
				}
	        }
	     // �������� ������� ������ ��������� ��� �������� ������
	    BaseMonth god = new BaseMonth();
	    System.out.println(god.m);
		
		
	}

}
