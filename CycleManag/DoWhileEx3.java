package CycleManag;

public class DoWhileEx3 {

	public static void main(String[] args)
		/*
		 * Использование цикла do-while, для выбора пункта меню
		 * 
		 */
		throws java.io.IOException {
		char choice;
		do {
			System.out.println("Справка по:");
			System.out.println("     1. if");
			System.out.println("     2. switch");
			System.out.println("Выберете пункт меню: ");
			choice = (char) System.in.read();
		} while (choice < '1' || choice > '2');
		
		switch (choice) {
		    case '1':
		    	System.out.println("if:");
		    	System.out.println("if (условие) оператор; ");
		    	System.out.println("else оператор;");
		    	break;
		    case '2':
		    	System.out.println("switch:");
		    	System.out.println("switch (выражение) {");
		    	System.out.println("case константа:");
		    	System.out.println("последовательность операторов");
		    	System.out.println("break;");
		    	System.out.println("// ...");
		    	System.out.println("}");
		    	break;

		}
	}

}
