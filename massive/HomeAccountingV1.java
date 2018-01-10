package massive;

import java.util.ArrayList;
import java.util.Date;

import org.omg.CORBA.portable.ValueBase;


public class HomeAccountingV1 {

	public static void main(String[] args) {
        /*
         * # 2
         *    Проверка даты, если не создан массив на текущий месяц, то создать его.
         *    Метод. Автоматическое создание массива месяца на основе даты,
         * Новый класс Категория, с автоматическим созданием новой категории
         * Авто.создание листов категорий 
         * 
         *    Введение с клавиатуры:
         *                          суммы
         *                          выбор числом от 1 до 10 категорий (в начале вывести список пронумерованный)
         *   
         *    Класс база данных
         *                          
         */
		String[] catg = new String[2];
		catg[0] = "Питание";
		catg[1] = "Квартплата";
		
	    class Oper {
			    public int count;

			    Oper(){};	
		    }

	        // Класс база данных, база месяцов    
	        class BaseMonth {
	        	public String m;
	        	public ArrayList<Oper>[] mass;
	        	
	            /*
	             * Конструктор для созд.месяца для текущей даты. Можно добавить конструктор для лубой даты  - переопределить.
	             */
	        	public BaseMonth() {
					// Авт. создание массива на основе даты
	        		Date d = new Date();
	        		m = (d.toString()).substring(4, 7);
	        		
	        	    mass  =  (ArrayList<Oper>[]) new ArrayList[10];
	                      for  (int i = 0; i < 10; i++ ) {
	                	      Oper iOper = new Oper();
	     	                  mass[i].add(iOper);
	                      }
				}
	        }
	     // Создание Массива листов категорий для текущего месяца
	    BaseMonth god = new BaseMonth();
	    System.out.println(god.m);
		
		
	}

}
