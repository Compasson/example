package ifFor;

public class Switch {

	public static void main(String[] args) {
		/*
		 * Switch зачастую оказываетс€ эффективнее IF-ELSE-IF
		 * 
		 * switch (выражение) {
		 *    case значение1:
		 *       // последовательность операторов
		 *       break;
		 *    case значение2:
		 *       // последовательность операторов
		 *       break;
		 * ...
		 * ...
		 *    case значениеN:
		 *       // последовательность операторов
		 *       break; // 
		 *    default: // Ќ≈ об€зателен
		 *       // последовательность операторов, выполн€ема€ по умалчанию.
		 *    
		 * ¬ыражение - должно иметь тип type, String, short, int, char, тип перечислени€.
		 * 
		 */
		for (int i = 0; i < 5; i++){
			switch(i){
			   case 0:
				   System.out.println("«начение переменной равно " + i);
				   break;
			   case 1:
				   System.out.println("«начение переменной равно " + i);
				   break;
			   case 2:
				   System.out.println("«начение переменной равно " + i);
				   break;
			   default:
				   System.out.println("«начение переменной больше 2 ");
			}
		}
		

	}

}
