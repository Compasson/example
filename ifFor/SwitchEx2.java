package ifFor;

public class SwitchEx2 {

	public static void main(String[] args) {
		/*
		 * ¬ыход breake (ломать, разрушать) ƒествует после нескольких случаев значений.
		 */
		for (int i = 0; i < 12; i++){
			switch(i){
			   case 0:
			   case 1:
			   case 2:
			   case 3:
			   case 4:
				   System.out.println("i меньше 5");
				   break;
			   case 5:
			   case 6:
			   case 7:
			   case 8:
			   case 9:
				   System.out.println("i меньше 10");
				   break;
			   default:
				   System.out.println("i равно или больше 10");
			}
		}
		/*
		 * ѕример принадлежности мес€ца к веремни года
		 */
		for (int j = 0; j < 14; j++){
			switch(j){
			   case 12:
			   case 1:
			   case 2:
				   System.out.println("ћес€ц" + j + "относитс€ к «»ћ≈");
				   break;
			   case 3:
			   case 4:
			   case 5:
				   System.out.println("ћес€ц" + j + "относитс€ к ¬≈—Ќ≈");
				   break;
			   case 6:
			   case 7:
			   case 8:
				   System.out.println("ћес€ц" + j + "относитс€ к Ћ≈“”");
				   break;
			   case 9:
			   case 10:
			   case 11:
				   System.out.println("ћес€ц" + j + "относитс€ к ќ—≈Ќ»");
				   break;
			   default:
				   System.out.println("ћес€ц" + j + "относитс€ к вымешленному мес€цу");
			}
		}

	}

}
