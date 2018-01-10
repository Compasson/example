package massive;

import java.util.ArrayList;
import java.util.Random;

public class HomeAccounting {

	public static void main(String[] args) {
	    /*
	     *  Массив для каждого месяца (в названии массива указывается месяц и год  - mass0216 - февраль 2016 года)
	     *  Массив состоит из ArrayList, номер элемента массива сопоставлен категории (mass0216[0] - ArrayList-Питание)
	     */
		String[] catg = new String[2];
		catg[0] = "Питание";
		catg[1] = "Квартплата";

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
        // Находим сумму категории - Питание
                for (int i = 0; i < mass1216[0].size(); i++) {
                	summP = summP + mass1216[0].get(i).count;	
                }
        System.out.println("Итого за декабрь категории " + catg[0] + " = " + summP);
        


	}

}
