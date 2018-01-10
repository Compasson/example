/*
 *  Интерфейсы указывают классам что имменно они должны делать,
 *             не уточня как именно.
 *             
 *             Пример интерф. Comparable (обобщенным типом обьектов):
 *                       
 *                       public interface Comparable<T>
 *                       {
 *                          int compareTo(T other)
 *                       }
 *                       Например если класс реализует интерфейс Comparable<Employee>, он должен содержать следующий метод:
 *                                
 *                                int compareTo(Employee);
 *             
 *             Интерфейс представляет собой множество требований,
 *                       предьявляемых к классу, который должен соответствовать интерфейсу.
 *                       
 *                       Любой класс реализующий конкретный интерфейс, должени иметь все все методы пропсианые в Interface.
 *                       
 *                       Все методы интерф. автоматически открытые!!!
 *             
 *             Требования к классу для реализации интерфейса:
 *                       
 *                       1) Обьявить, что класс реализует интерфейс:
 *                       
 *                                 class Employee implements Comparable
 *                                  
 *                       2) Определить в классе все методы, указанные в интерфейсе.
 *                       
 *                       
 *             Например ниже приведены методы сортивровки массива с помощью классов сортировки (Java.util.*  Arrays.sort) реализующих интерфейс Comparable.
 *             
 *             
 *             Если нам нужно клонировать обьект и сравнивать его , то надо класс это обьекта реализовать двумя интерфейсами Cloneable и Comparable:
 *             
 *                      class Employee implements Cloneable, Comparable 
 *                      
 *             
 */ 

package interfaceEx;

/*
 *  В этой программе демонстрируется применение интерфейса Comparable
 */

import java.util.*;

public class InterfaceEx1
{

	public static void main(String[] args) {
		
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Harry Hacker", 35000);
		staff[1] = new Employee("Harry Hacker", 75000);
		staff[3] = new Employee("Harry Hacker", 38000);
        
		Arrays.sort(staff);
		
		// вывести данные обо всех обьектах типа Employee
		for (Employee e :staff)
			System.out.println("name=" + e.getName() + ",salary" + e.getSalary());
	}

}