package classExample;

/*
 *   Запись построчно в массив из консоли.
 *   Вывод массива в консоль.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Buhg {
	String [] bu = new String[100]; //Просто массив строк

	void wrt(String s, int k){
		bu[k] = s;
	}
	
}

public class InOutEx1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new
				                InputStreamReader(System.in));
		String str;
		int i = -1;
		System.out.println("Вводите строки текста.");
		System.out.println("Введите 'стоп' для завершения.");
		
		Buhg b = new Buhg();
		
		// Чтение с косоли и запись в массив-атрибут обьекта Buhg
		do {
			i++;
			str = br.readLine();
			b.wrt(str, i);;
			System.out.println("Строка <" + str + "> записана в массив bu.");			
		} while (!str.equals("стоп"));
		
		// Построчный вывод массива
		for (String x : b.bu){
			if (x != null)
			{
			System.out.println(x);
			}
		}
	}
}


