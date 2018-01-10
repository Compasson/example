package classExample;

/*
 * Пример использования методов.
 * 
 *     
 */

class VeloMan {
	double skills; // Опыт велотуриста по шкале от 1 до 10
	double bagag; // Груз по шкале от 10 кг до 30 кг.
	double region; // Сложность маршрута по шкале от 1 до 6.
	
	double speed(double s, double b, double r){  // Подсчитывается средняя скорость туриста
		skills = s;
		bagag = b;
		region = r;
		return (skills/10 + region/6 + bagag/30)*10 +20;
	}
	
	
}

public class MethodEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VeloMan v1 = new VeloMan();
		System.out.println(v1.speed(5, 3, 20));

	}

}
