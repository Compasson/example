/*
*   Програма принимет аргументы вводимые в коммандной строке при запуске java-программы
*        и выводит аргументы на экран.
*
*
*/

public class ArgsInOutCMD {

	public static void main(String[] args) {  // Агрументы для ком.строки подаются в виде обычного массива строк
		for(int i=0; i<args.length; i++){
			System.out.println("args[" + i + "]: " + args[i]);
		}
	}
}