package InConsole;

import java.io.IOException;

public class InEx1 {

	public static void main(String[] args){
	
       

	
	// Java IOEeprtion принимает в консоли символьный тип
		char choice1, choice2, choice3, choice4;
		String s1, s2, s3;
		int [][] mas = new int[2][2];
		
		for (int i = 0; i < 10; i++){
			
			
			System.out.println("Выберете категорию расхода:");
			System.out.println("1 - питание");
			System.out.println("2 - квартплата");
			System.out.println("Ведите категорию и двузначную сумму через пробел.");
				        
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
				System.out.println("Сумма" + mas[0][0] + " записана в категорию Питание.");

				break;
			case '2':

				s1 = String.valueOf(choice3);
				s2 = String.valueOf(choice4);
				s3 = s1 + s2;
				mas[1][1] = mas[1][1] + Integer.parseInt(s3);
				System.out.println("Сумма" + mas[1][1] + " записана в категорию Квартплата.");

				break;
			default:
				System.out.println("Введите 1 или 2");
				break;
			}
		}

	}

     
	
}
	    
			