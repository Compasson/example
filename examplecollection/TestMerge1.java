package examplecollection;

import java.util.*;
import java.lang.Iterable;

/*
 *  Программа создает две коллекции a = [a1,a2, ...] ; b = [b1,b2, ...] 
 *  
 *  Смешивает коллекции в одну r = [a1,b1,a2,b2, ...]
 */
public class TestMerge1 {
       
	public static void main(String[] args)
	{
		Collection<String> a = new ArrayList<>();
		Collection<String> b = new ArrayList<>();
	    Collection<String> r = new ArrayList<>();

		for (int i=0; i<100; i++)
		{
		    a.add("Привет ");
			b.add("Пока ");
		}
			
	    Iterator<String> iteraa = a.iterator(); // Итератор для прохода по коллекции а
	    Iterator<String> iterbb = b.iterator();
			
	    // Цикл проверяет есть ли еще не пройденные элементы в коллекции а, проходит следующие элементы в коллекциях a и b, добавляя элементы в коллекцию r.
		while (iteraa.hasNext())
		{
			r.add(iteraa.next());
		    r.add(iterbb.next());
		}
		
		
		for (String element : r)
			{
			    System.out.println(element);
			}

    }	
}
