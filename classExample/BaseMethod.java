package classExample;

/*
 * Метод:
 *       тип имя(список параметров){
 *           // тело метода
 *       }
 */

class Box{
	double width;
	double height;
	double depth;
	
	void volume(){ // НЕТ типа возвращаемого значения. Метод пустой.
		System.out.println("Объем будет равен " + width*height*depth);
	}
	
	double volume1(){ // Метод возвращает значение типа double.
		return width*height*depth;
	}
	
	void setDim(double w, double h, double d){ // Метод с параметрами устанавливает значения полей обьекта.
		width = w;
		height = h;
		depth =d;
	}

}

public class BaseMethod {

	public static void main(String[] args) {
	
		Boxx mybox1 = new Boxx();
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 30;
		
		mybox1.volume(); // Срабатывает тело меода, но метод не возвращает значения.
		
		System.out.println("Метод volume1 возвращает значение равное " + mybox1.volume1());
		
		Boxx mybox2 = new Boxx();
		System.out.println("Метод setDim устанавливает значения полей обьекта через входные параметры.");
		mybox2.setDim(23, 47, 18);
		System.out.println("Метод setDim устанавил значения полей объекта mybox2:  width = " + mybox2.width + ",  height = " + mybox2.height + ",  depth = " + mybox2.depth);
		
		




		
	}

}
