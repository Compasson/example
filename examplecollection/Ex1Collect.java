package examplecollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.lang.Iterable;


public class Ex1Collect {

	public static void main(String[] args) {
		
		/*
		 *  Здесь создается новая коллекция - связный список LinkedList. Указание интерфейса - очередь Queue служит для ссылки на коллекцию.
		 *  Метод add используется из интерфейса Queue.
		 */
		Queue<Custom> expressLane = new LinkedList<>();
		expressLane.add(new Custom("Harry"));
		
		
		/*
		 * Создание коллекции реализующей интерфейс Collection. И изменение коллекции с помощью объекта итератора.
		 */
		Collection<String> c = new ArrayList<>(); 
		boolean b = c.add("Машина"); // Метод add возвращает булево значение true если обьект добавлен в коллекцию. Быть уверенным, что коллекция изменилась.
		c.add("Мотоцикл");
		Iterator<String> iter = c.iterator(); // ВНИМАНИЕ ЭТОТ МЕТОД ЯВЛЯЕТСЯ ОСНОВНЫМ МЕТОДОМ ИНТЕРФЕЙСА Iterable. Возможно надо будет включить импорт java.lang.Iterable;
		System.out.println("Перебор элементов осуществляется с помощью обьекта итератора");
		while(iter.hasNext())
		{
			String element = iter.next();
			System.out.println(element);
		}
	    // При переборе элементов можно обойтись без итератора используя for each:
		System.out.println("Цикл в стиле for each перебирает элементы.");
		for (String element : c)
		{
			System.out.println(element);
		}
		
		
	}

}


