package ifFor;

import java.util.Scanner;

public class If {
	/*
	 *  1-й способ вызова оператора if, если условие true - команда 1. Если false - команда 2.
	 *  if (условие){команда 1}
	 *  else {команда 2}
	 */

	public static void main(String[] args) {
		
		/*
		 * 1-й способ IF
		 * Пример запись денежных затрат в категории.
		 * На ввод подаются данные типа: String (k4000), первый знак буква - соответствует категории. Дальше знаки это сумма в рублях.
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


