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
		 *  ����� ��������� ����� ��������� - ������� ������ LinkedList. �������� ���������� - ������� Queue ������ ��� ������ �� ���������.
		 *  ����� add ������������ �� ���������� Queue.
		 */
		Queue<Custom> expressLane = new LinkedList<>();
		expressLane.add(new Custom("Harry"));
		
		
		/*
		 * �������� ��������� ����������� ��������� Collection. � ��������� ��������� � ������� ������� ���������.
		 */
		Collection<String> c = new ArrayList<>(); 
		boolean b = c.add("������"); // ����� add ���������� ������ �������� true ���� ������ �������� � ���������. ���� ���������, ��� ��������� ����������.
		c.add("��������");
		Iterator<String> iter = c.iterator(); // �������� ���� ����� �������� �������� ������� ���������� Iterable. �������� ���� ����� �������� ������ java.lang.Iterable;
		System.out.println("������� ��������� �������������� � ������� ������� ���������");
		while(iter.hasNext())
		{
			String element = iter.next();
			System.out.println(element);
		}
	    // ��� �������� ��������� ����� �������� ��� ��������� ��������� for each:
		System.out.println("���� � ����� for each ���������� ��������.");
		for (String element : c)
		{
			System.out.println(element);
		}
		
		
	}

}


