package AbstractAndInterface;

/*
 *  Абстрактный класс не подразумевает, что все его методы должны быть абстрактными
 *  Абстрактные методы позволяют легко перемещать общие методы вверх по иерархии наследования
 */
abstract class Animals{
	private int i; // Память выделяется для каждого обьекта (обьекты абстрактного класса НЕ создаются)
	public abstract void voit(); // Абстракные методы voit и trainer обязательно должны быть прописаны в наследуемых классах
	public String what() {return "Animals";};
	public abstract void trainer();
}

class Pet extends Animals {
	public void voit () {System.out.println("Pet are voit Gav and Mau");};
	public String what() {return "Pet";};
	public void trainer() {};	
}

class Wild extends Animals {
	public void voit () {System.out.println("Wild are voit Rrrrrrr...");};
	public String what() {return "Wild";};
	public void trainer() {};	
}

class Cat extends Pet {
	public void voit () {System.out.println("Cat are voit Mau");};
	public void trainer() {};
}

class Dog extends Pet {
	public void voit() {System.out.println("Dog are voit Gav");};
	public String what() {return "Dog";};
}

public class TestAbstract {
	
	static void start(Animals i) {
		
		i.voit();
	}
	static void startAll(Animals[] e) {
		for(Animals i : e)
			start(i);
	}
	public static void main(String[] args) {
		// Восходящее преобразование при добавлении в массив
		Animals[] zoo = {
				new Pet(),
				new Wild(),
				new Cat(),
				new Dog()
		};
		startAll(zoo);
	

	}

}
