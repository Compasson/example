package example1;

import java.util.Random;

public class Mass22 {

	public static void main(String[] args) {
		/*
		 *  ������ � ��������� ������ ��������� �������� � ����� ����� ������� ������� � ������.
		 */
		int [][] m = new int [10][10];
		Random q = new Random();
		    // ������
		    for  (int i = 0; i < 10; i++ ) {
		    	for  (int j = 0; j < 10; j++ ) {
		    	    m[i][j] = q.nextInt(10);
		    	}
		    }
		    // ������������
		int [][] s = new int [2][10];   
		    for  (int i = 0; i < 10; i++ ) {
		    	for  (int j = 0; j < 10; j++ ) {
		    	    s[0][i] = s[0][i] + m[i][j];
		    	    s[1][j] = s[1][j] + m[i][j];
 		    	}	
		    }
		// ����� ������� m
		for  (int i = 0; i < 10; i++ ) {
		   for  (int j = 0; j < 10; j++ ) {    
           System.out.print(m[i][j] + " ");
		   }
		System.out.println();
		}   
		// ����� ����� �������� ����� � �������:
		for  (int i = 0; i < 2; i++ ) {
			   for  (int j = 0; j < 10; j++ ) {    
	           System.out.print(s[i][j] + " ");
			   }
			System.out.println();
		}
	
	}

}
