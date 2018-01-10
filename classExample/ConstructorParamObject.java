package classExample;

/*
 *   Перадача обьекта в качестве параметра метода
 */

class Car{
	int width, height, depth;
	
	Car(){  
		width = -1;
		height = -1;
		depth = -1;
	}
	
	Car(int w){
		width = w;
	}
	
	Car(BoXXX ob){
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	void test(int w, int h, int d){
		width = w;
		height = h;
		depth = d;
	}
	void test2(){
		System.out.println("Объем будет равен: " + width*height*depth);
	}
	
	// test3 возвращает ссылку на новый объект
	BoXXX test3(){
		BoXXX c = new BoXXX(10 + width);
		return c;
	}
}

public class ConstructorParamObject {

	public static void main(String[] args) {
		
		BoXXX c1 = new BoXXX();
		c1.test(5, 6, 7);
		BoXXX c2 = new BoXXX(c1); // Клон обьекта с1. С1 используется в качестве параметра
		c2.test2();
		
		BoXXX c3 = new BoXXX(8);
		BoXXX c4;
		c4 = c3.test3();
		System.out.println(c4.width);

	}

}
