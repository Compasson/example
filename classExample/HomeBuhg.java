package classExample;

/*
 *   ������ ����������� ����� � ������ � ����� ����������� ���������-�����������
 *   
 *   �������
 *   ����������
 *   
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

class Bdate {
    int [] p = new int[100]; // ������ ��������� �������
    int [] k = new int[100]; // ������ ��������� �������
    
    // ������������� ��������� ���� ����� �������� ����������
    Bdate(){
    	for(int i =0; i<100; i++){
    		p[i] = 0;
    		k[i] = 0;
    	}
    }
    
    // ����� ��� ������ � ������
	void wrtP(int l){
		// ���� ���������� ��������� ������� �������� ��� ���, ���� �������, �� ���������� ����� � ����������� ��������� i ������ �������, ���� �����������
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
	
	// ����� ��� ������ � ������
		void wrtK(int l){
			// ���� ���������� ��������� ������� �������� ��� ���, ���� �������, �� ���������� ����� � ����������� ��������� i ������ �������, ���� �����������
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
		
		// ������ � ������ � ������ � ������-������� ������� Buhg
		// ���� �� �������� ���������
		do {
			System.out.println("������� ������ ����� ���������:");
			System.out.println("� - �������.");
			System.out.println("� - ����������.");
			System.out.println("���� - ��� ��������� ��������� � ����� �������� � ����������.");


			str = br.readLine();

			// �������� switch �������� �����
			switch(str){
			   case "�":
				   System.out.println("������� ����������� ����� �� ��������� �������:");
				   str = br.readLine();
				   bd.wrtP(Integer.parseInt(str));				   
				   break;
			   case "�":
				   System.out.println("������� ����������� ����� �� ��������� �������:");
				   str = br.readLine();
				   bd.wrtK(Integer.parseInt(str));	
				   break;
			   default:
				   System.out.println("������������ ���� ���������.");
		     }	
		} while (!str.equals("����"));
		
		
		// ���������� ����� ������� �������
		System.out.println("����� ����������� �� �������:");
		for (int x : bd.p){
			if (x != 0)
			{
			System.out.println(x);
			}
		}
		
		// ���������� ����� ������� ����������
	    System.out.println("����� ����������� �� ����������:");
		for (int x : bd.k){
			if (x != 0)
			{
			System.out.println(x);
			}
		}
	}
}


