package massive;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Mas1012 {


	public static void main(String[] args) {
		
		
        int v = 0;
		int[][] m = new int[10][10];
		int[] n = new int[10];
		String[] c = new String[20];
		
		
        /*try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("C:/Users/Pavel/workspaceEclipse/Trenning/bin/massive/1"), StandardCharsets.UTF_8))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // log error
        }
        */
        for  (int a = 0; a < 9; a++ ) {
			
			for (int b = 0 ; b <9; b++) {
				
				
				m[a][b] = 0; 
				n[a] = 0;
			
			}		
        }	    // List <String> lines = Files.readAllLines(Paths.get("E:/���������� Java/������ ��� ����������/1"), StandardCharsets.UTF_8);
			    //List <String> lines = new List <String>();
			    //lines = Files.readAllLines(Paths.get("E:/���������� Java/������ ��� ����������/1"), StandardCharsets.UTF_8);
			    // ArrayList<String> numbers = new ArrayList<String>();

        for  (int i =0; i < 1; i++ ) {
			
			for (int j = 0 ; j <2; j++) {
			
		    String intArrayString = Arrays.toString(n); // Use just for 1-������   massive.
		    System.out.println(intArrayString);
		    System.out.println("��!              ��!");
		    System.out.println();
			}
		
        }
	}
}