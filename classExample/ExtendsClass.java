package classExample;

/*
 *  НАСЛЕДОВАНИЕ
 *               Наследуемый класс - суперкласс
 *               Наследующий класс - подкласс
 *               
 *               Подкласс включает в себя все члены своего суперкласса (переменные суперкласса).
 *               Подкласс не имееет доступа к членам супер класса объявл. как private.
 *               
 *               Каждый подкласс добавляет собственные уникальные атрибуты.
 *               
 *               
 */

class A {
	int i,j;
	
	void showij(){
		System.out.println(("i and j:" + i + " " + j));
	}
}

// Создание подкласса
class B extends A {
	int k;
	
	void showk() {
		System.out.println(("k:" + k));

	}
	void sum() {
		System.out.println(("i + j + k:" + (i+j+k)));

	}
}

public class ExtendsClass {

	public static void main(String[] args) {
		A superOb = new A();
		B subOb = new B();
		
		// Суперкласс может использоваться самостоятельно
		superOb.i = 10;
		superOb.j = 20;
		System.out.println("Содержимое superOb: ");
		superOb.showij();
		System.out.println();
        
		// Подкласс имеет доступ ко всем открытым членам своего суперкаласса
		subOb.i = 7;
		subOb.j = 8;
		subOb.k = 9;
		System.out.println("Содержимое subOb: ");
		subOb.showij();
		subOb.showk();
		
		System.out.println();
		System.out.println("Сумма i, j and k в subOb: ");
		subOb.sum();

	}

}
