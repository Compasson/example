package ifFor;

public class DoWhile {

	public static void main(String[] args) {
		/*
		 * do {
		 *    // тело цикла
		 * } while (условие)
		 * 
		 * Этот цикл всегда выполняет тело цикла хотябы один раз,
		 * так как условное выражение проверяется в конце цикла.
		 */
		int n = 10;
		do {
			System.out.println("Такт " + n);
		} while(--n > 0);

	}

}
