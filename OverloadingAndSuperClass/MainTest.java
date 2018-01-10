package OverloadingAndSuperClass;

import OverloadingAndSuperClass.Car;

public class MainTest {
	
	public int number;


	public static void main(String[] args) {
		
		System.out.println(summ(5));
		// Вывод перегруженного метода
		System.out.println(summ(5,5));	
		
		Car car1 = new Car();
		car1.name = "Первая машина!";
		System.out.println(car1.name);
		car1.AddName();
		
	
	}
	
	public static int summ(int a){
		
		MainTest object1 = new MainTest();
		
		object1.number = 5+a;
		
		return object1.number;
		
	}
	
	public static int summ(int a, int b){
		
		MainTest object2 = new MainTest();
		
		object2.number = 5+a+b;
		
		return object2.number;
		
	}

}
