package massive;

import java.util.ArrayList;
import java.util.Random;

public class HomeAccounting {

	public static void main(String[] args) {
	    /*
	     *  ������ ��� ������� ������ (� �������� ������� ����������� ����� � ���  - mass0216 - ������� 2016 ����)
	     *  ������ ������� �� ArrayList, ����� �������� ������� ����������� ��������� (mass0216[0] - ArrayList-�������)
	     */
		String[] catg = new String[2];
		catg[0] = "�������";
		catg[1] = "����������";

		class Oper {
			public int count;
			//public Calendar data;
			
			Oper(){};	
		}
		
	    ArrayList<Oper>[] mass1216 = (ArrayList<Oper>[]) new ArrayList[10];
	    mass1216[0] = new ArrayList<Oper>();
	    Random r = new Random();
	    int summP = 0;
                for  (int i = 0; i < 10; i++ ) {
     	              mass1216[0].add(new Oper());
     	             mass1216[0].get(i).count = r.nextInt(100);
     	             System.out.println(mass1216[0].get(i).count);
                }
        // ������� ����� ��������� - �������
                for (int i = 0; i < mass1216[0].size(); i++) {
                	summP = summP + mass1216[0].get(i).count;	
                }
        System.out.println("����� �� ������� ��������� " + catg[0] + " = " + summP);
        


	}

}
