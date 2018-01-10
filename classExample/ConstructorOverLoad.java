package classExample;

/*
 *   Перегрузка конструкторов
 *    примеры:
 */
class Boxx {
	
	int width, height, depth;
	
	// Конструктор с 3-мя параметрами
	Boxx(int w, int h, int d){
		width = w;
		height = h;
		depth = d;
	}
	
	// Коснструктор, ипользуемый, когда не один парам. не задан.
	Boxx(){
		width = -1; // Указывается для неинициализированной переменной.
		height = -1;
		depth = -1;
	}
	
	// Конструктор для создания куба
	Boxx(int len){
		width = height = depth = len;
	}
	
	// Вычисление и возврат обьема
	int volume(){
		return width*height*depth;		
	}
}

public class ConstructorOverLoad {

	public static void main(String[] args) {
		
		Boxx b1 = new Boxx(3,4,5);
		Boxx b2 = new Boxx();
		Boxx b3 = new Boxx(7);
		
		System.out.println("Объем первого обекта b1 с конструктором из 3 параметров равен = " + b1.volume());
		System.out.println("Объем второго обекта b2 с конструктором без параметром не может быть вычеслен,т.к. переменные не инициализированны.");
		System.out.println("Объем третьего обекта b3 (куба) с конструктором из 1 параметров равен = " + b3.volume());

	}

}
