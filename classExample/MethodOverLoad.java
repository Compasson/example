package classExample;

/*
 *  Пример несколькоих перегруженных метода
 */

class OverL {
	void test(){
		System.out.println("Метод без параметров");
	}
	void test(double b, double c, double d){
		System.out.println("Перегруженный метод c тремя параметрами. Общее среднее число равно = " + (b + c + d)/3);
	}
	String test(String s, int i){
		System.out.println("Перегруженный метод c двумя параметрами разного типа.");
		return s.concat(" ").concat(String.valueOf(i));
	}
	void test(double d){
		System.out.println("Метод принимающий тип int в параметр double и преобразовывающий его. Double = " + d);
	}
	
}
 
public class MethodOverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		String stroka;
		
		OverL o = new OverL();
		o.test();
		
		o.test(35, 78, 24);
		
		stroka = o.test("Rinat", 324);
		System.out.println("Метод принял 2 параметра разного типа и обьеденил их в строку: " + stroka);
		
		o.test(46);

	}

}
