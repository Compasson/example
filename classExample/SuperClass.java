package classExample;

/*
 *   Подкласс может сослаться на суперкласс с помощью ключевого слова super
 *        SUPER имеет две общие формы:
 *             1)Вызов конструктора суперкласса
 *             2) Обращение к члену суперкласса(в том случае если член закрытый).
 *             
 */

class Human {
	private int width;
	private int height;
	private int depth;
	
	// Конструирование клона объекта
	Human(Human ob) {
		width = ob.width;
		height  = ob.height;
		depth = ob.depth;
	}
	
	Human(int w, int h, int d){
		width = w;
		height  = h;
		depth = d;
	}
	
	Human(){
		width = -1;
		height  = -1;
		depth = -1;
	}
	

}

public class SuperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
