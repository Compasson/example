package Interface;
/*
 * Interface ипользуется для создания полностью абстрактых классов
 * Интерфейс определяет соего рода "протокол взаимодействия" межлу классами,
 * которые реализуют данный интерфейс.
 * Интерфес может содержать поля, но они автоматически являются СТАТИЧЕСКИМИ static И final НЕИЗМЕННЫМИ.
 * При описании методов, они являются public даже без спецификатора,
 * хотя можно обявить их явно public.
 * 
 */
interface Instrument {
	int VALUE = 5; // является static and final
	void play(); // Автоматически обьявлен как public
	void adjust(); // Определения методов не допустимы
}

class Wind implements Instrument {
	public void play () {System.out.println(this);};
	public String toString() {return "Wind";};
	public void adjust() {};	
}

class Percussion implements Instrument {
	public void play () {System.out.println(this);};
	public String toString() {return "Percussion";};
	public void adjust() {};	
}

class Brass extends Wind {
	public String toString() {return "Brass";};
}

class Woodwind extends Wind {
	public String toString() {return "Woodwind";}; // Так как метод toString входит в корневой каталог Object, его присутстие в интерфейсе не обязательно
}

public class TestInterface {
	// Работа метода не зависит от фактического типа обекта,
	// поэтому типы, добавленные в систему будут работать правильно
	static void tune(Instrument i) {
		
		i.play();
	}
	static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
	}
	public static void main(String[] args) {
		// Восходящее преобразование при добавлении в массив
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Brass(),
				new Woodwind()
		};
		tuneAll(orchestra);
	

	}

}
