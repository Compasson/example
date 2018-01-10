package classExample;

/*
 *   Запись потраченной суммы в обьект с двумя переменными массивами-категориями
 *   
 *   Питание
 *   Квартплата
 *   
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

class Bdate {
    int [] p = new int[100]; // Массив категории питание
    int [] k = new int[100]; // Массив категории питание
    
    // Инициализация массиввов базы даных нулевыми значениями
    Bdate(){
    	for(int i =0; i<100; i++){
    		p[i] = 0;
    		k[i] = 0;
    	}
    }
    
    // Метод для записи в массив
	void wrtP(int l){
		// Цикл поочередно проверяет нулевое значение или нет, если нулевое, то записывает сумму и присваивает переменой i длинну массива, цикл завершается
		    for (int i=0; i<100; i++){
			    switch(p[i]){
			         case 0:
			   	   		    p[i] = l;
			   			    i = p.length;
			   	     break;			   	 
			   	     default: break;
		        }
		    }

	 }
	
	// Метод для записи в массив
		void wrtK(int l){
			// Цикл поочередно проверяет нулевое значение или нет, если нулевое, то записывает сумму и присваивает переменой i длинну массива, цикл завершается
			for (int i=0; i<100; i++){
				switch(k[i]){
				     case 0:
				   			k[i] = l;
				   			i = k.length;
				   	 break;			   	 
				   	 default: break;
			    }
			}
		}
}

public class HomeBuhg {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new
				                InputStreamReader(System.in));
		String str;		
		Bdate bd = new Bdate();
		
		// Чтение с косоли и запись в массив-атрибут обьекта Buhg
		// Цикл до получает категорию
		do {
			System.out.println("Введите первую букву категории:");
			System.out.println("п - питание.");
			System.out.println("к - квартплата.");
			System.out.println("стоп - для окончания программы и вывод значений в категориях.");


			str = br.readLine();

			// Оператор switch получает сумму
			switch(str){
			   case "п":
				   System.out.println("Введите потраченную сумму на категорию Питание:");
				   str = br.readLine();
				   bd.wrtP(Integer.parseInt(str));				   
				   break;
			   case "к":
				   System.out.println("Введите потраченную сумму на категорию Питание:");
				   str = br.readLine();
				   bd.wrtK(Integer.parseInt(str));	
				   break;
			   default:
				   System.out.println("Некорректный ввод категории.");
		     }	
		} while (!str.equals("стоп"));
		
		
		// Построчный вывод массива Питание
		System.out.println("Суммы затраченные на Питание:");
		for (int x : bd.p){
			if (x != 0)
			{
			System.out.println(x);
			}
		}
		
		// Построчный вывод массива Квартплата
	    System.out.println("Суммы затраченные на Квартплату:");
		for (int x : bd.k){
			if (x != 0)
			{
			System.out.println(x);
			}
		}
	}
}


