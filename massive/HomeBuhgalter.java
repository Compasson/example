package massive;

import java.util.Random;

public class HomeBuhgalter {

	public static void main(String[] args) {
        /*
         *  ���������� ������������� ID-category, ��������:
         *  ������� - idc = 0;
         *  ���������� - idc = 1;
         *  
         */
		String[] catg = new String[2];
		catg[0] = "�������";
		catg[1] = "����������";

		class Oper {
			public int count,idc;
			//public Calendar data;
			
			Oper(){};	
		}
		
		Oper one = new Oper();
		one.count = 500;
		one.idc = 0;
		
		System.out.println(catg[one.idc] + " = " + one.count );
		
		// ������ ������� Oper
		Oper[] mass = new Oper[10];
	    int summ = 0;
		Random q = new Random();
	         for  (int i = 0; i < 10; i++ ) {
	        	   mass[i] = new Oper();
	    	       mass[i].count = q.nextInt(100);
	    	       summ = summ + mass[i].count;
	         }
	    System.out.println(catg[one.idc] + " mass = " + summ);	    
	}

}
