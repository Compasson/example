package InConsole;

import java.io.IOException;

public class InEx1 {

	public static void main(String[] args){
	
       

	
	// Java IOEeprtion ��������� � ������� ���������� ���
		char choice1, choice2, choice3, choice4;
		String s1, s2, s3;
		int [][] mas = new int[2][2];
		
		for (int i = 0; i < 10; i++){
			
			
			System.out.println("�������� ��������� �������:");
			System.out.println("1 - �������");
			System.out.println("2 - ����������");
			System.out.println("������ ��������� � ���������� ����� ����� ������.");
				        
			choice1 = (char) System.in.read();
			choice2 = (char) System.in.read();
			choice3 = (char) System.in.read();
			choice4 = (char) System.in.read();

			switch (choice1) {	
			    
			case '1':;
				s1 = String.valueOf(choice3);
				s2 = String.valueOf(choice4);
				s3 = s1 + s2;
				mas[0][0] = mas[0][0] + Integer.parseInt(s3);
				System.out.println("�����" + mas[0][0] + " �������� � ��������� �������.");

				break;
			case '2':

				s1 = String.valueOf(choice3);
				s2 = String.valueOf(choice4);
				s3 = s1 + s2;
				mas[1][1] = mas[1][1] + Integer.parseInt(s3);
				System.out.println("�����" + mas[1][1] + " �������� � ��������� ����������.");

				break;
			default:
				System.out.println("������� 1 ��� 2");
				break;
			}
		}

	}

     
	
}
	    
			