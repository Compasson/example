package example1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Mass20 {

	public static void main(String[] args) {
		
		/**
		 *  ������ � ������ ���� int ������� �������� � ����� ��� �� �����.
		 *   m[a][b] = 0; ��������� ������
		 */
        int v = 0;
		int[] n = new int[10];
				
        for  (int a = 0; a < 9; a++ ) {									
				n[a] = v;  	
        }			
		    String intArrayString = Arrays.toString(n); // Use just for 1-������   massive.
		    System.out.println(intArrayString);
		
		 /**
		  *  ������ � ������ ��������� �� �����. ����� ������� �� �����.
		  */
	     String[] m = new String[30];

		 try (BufferedReader reader = new BufferedReader(
		                new InputStreamReader(
		                        new FileInputStream("C:/FileName.txt"), StandardCharsets.UTF_8))){
		      String line;
		      int i = 0;
		      while ((line = reader.readLine()) != null) {        	
		           m[i] = line;
		           System.out.println(m[i]);
		           i++;

		      }
		  } catch (IOException e) {
		            System.out.println("������");
		  }
		 /**
		  *  ������ � ������ � �������, ���������� ������� � ���� ���������.
		  */

		 
  

	}

}
