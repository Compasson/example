package example1;

import java.util.Random;

public class Mass22 {

	public static void main(String[] args) {
		/*
		 *  Запись в двумерный массив случайных значений и вывод суммы каждого столбца и строки.
		 */
		int [][] m = new int [10][10];
		Random q = new Random();
		    // Запись
		    for  (int i = 0; i < 10; i++ ) {
		    	for  (int j = 0; j < 10; j++ ) {
		    	    m[i][j] = q.nextInt(10);
		    	}
		    }
		    // Суммирование
		int [][] s = new int [2][10];   
		    for  (int i = 0; i < 10; i++ ) {
		    	for  (int j = 0; j < 10; j++ ) {
		    	    s[0][i] = s[0][i] + m[i][j];
		    	    s[1][j] = s[1][j] + m[i][j];
 		    	}	
		    }
		// Вывод массива m
		for  (int i = 0; i < 10; i++ ) {
		   for  (int j = 0; j < 10; j++ ) {    
           System.out.print(m[i][j] + " ");
		   }
		System.out.println();
		}   
		// Вывод суммы значений строк и стобцов:
		for  (int i = 0; i < 2; i++ ) {
			   for  (int j = 0; j < 10; j++ ) {    
	           System.out.print(s[i][j] + " ");
			   }
			System.out.println();
		}
	
	}

}
