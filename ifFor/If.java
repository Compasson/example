package ifFor;

import java.util.Scanner;

public class If {
	/*
	 *  1-� ������ ������ ��������� if, ���� ������� true - ������� 1. ���� false - ������� 2.
	 *  if (�������){������� 1}
	 *  else {������� 2}
	 */

	public static void main(String[] args) {
		
		/*
		 * 1-� ������ IF
		 * ������ ������ �������� ������ � ���������.
		 * �� ���� �������� ������ ����: String (k4000), ������ ���� ����� - ������������� ���������. ������ ����� ��� ����� � ������.
		 * 
		 */
		String[] food = new String[10];
		String[] gkh = new String[10];	
		String[] other = new String[10];
		
	        Scanner in = new Scanner(System.in);
	        String str = in.nextLine();
	                    	
	                 while (in.hasNext())   
	                 {               String catg = str.substring(0, 1);
	    	                         String number = str.substring(1, str.length());
	    	                         System.out.println(catg + " " + number);
	    	                         return;
	                 }
	    	                         
	                    
	                                   
	              
	       //g  in.close();     
	                  //  if (catg == "f"){    
	                 //   	food[0] = number;
	 }
	                 
	        // System.out.println(food[0]);
}


