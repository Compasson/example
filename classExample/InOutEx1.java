package classExample;

/*
 *   ������ ��������� � ������ �� �������.
 *   ����� ������� � �������.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Buhg {
	String [] bu = new String[100]; //������ ������ �����

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
		System.out.println("������� ������ ������.");
		System.out.println("������� '����' ��� ����������.");
		
		Buhg b = new Buhg();
		
		// ������ � ������ � ������ � ������-������� ������� Buhg
		do {
			i++;
			str = br.readLine();
			b.wrt(str, i);;
			System.out.println("������ <" + str + "> �������� � ������ bu.");			
		} while (!str.equals("����"));
		
		// ���������� ����� �������
		for (String x : b.bu){
			if (x != null)
			{
			System.out.println(x);
			}
		}
	}
}


