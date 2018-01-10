package classExample;

/*
 *  Рекурсия - способность метода вызвать самого себя.
 *      Пример простой рекурсии:
 *      
 *         Вычисление факоториала числа.
 */

class Facotorial {
	int fact(int n){
		int result;
		
		if(n==1) return 1;
		result = fact(n-1)*n;
		return result;
	}
}

public class Recursiya {

	public static void main(String[] args) {
		Facotorial f = new Facotorial();
		
		System.out.println("Факоториал 3 равен " + f.fact(3));
		System.out.println("Факоториал 4 равен " + f.fact(4));
		System.out.println("Факоториал 5 равен " + f.fact(5));



	}

}
