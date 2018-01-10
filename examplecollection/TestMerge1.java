package examplecollection;

import java.util.*;
import java.lang.Iterable;

/*
 *  ��������� ������� ��� ��������� a = [a1,a2, ...] ; b = [b1,b2, ...] 
 *  
 *  ��������� ��������� � ���� r = [a1,b1,a2,b2, ...]
 */
public class TestMerge1 {
       
	public static void main(String[] args)
	{
		Collection<String> a = new ArrayList<>();
		Collection<String> b = new ArrayList<>();
	    Collection<String> r = new ArrayList<>();

		for (int i=0; i<100; i++)
		{
		    a.add("������ ");
			b.add("���� ");
		}
			
	    Iterator<String> iteraa = a.iterator(); // �������� ��� ������� �� ��������� �
	    Iterator<String> iterbb = b.iterator();
			
	    // ���� ��������� ���� �� ��� �� ���������� �������� � ��������� �, �������� ��������� �������� � ���������� a � b, �������� �������� � ��������� r.
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
