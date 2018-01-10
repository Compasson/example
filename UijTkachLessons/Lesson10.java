package UijTkachLessons;

import java.util.ArrayList;
import java.util.Iterator;

public class Lesson10 (Generics, Collections)

Generics
/* � ������ ��� ���� ������� ������� ������ �����
 * 
 */
class Box {
	private Object item;
	public Object getItem(){
		return item;
	}
	public void setItem(Object o){
		item = o;
	}
}

Box b = new Box();
b.setItem(new Integer(5));

Object o = b.getItem();

o.getClass();

/* ����� ������ �����! �� C++ ���� �����: � ��������� ������ �� ����� ���������� ��������� ����� �����������
 * ��������� ����� ��������, ���� �� ����� ���������� ����� ����� ���� ��������� �������
 * ������ ����� ��������.
 * <T> - ��� ����������� ��� ��������, ����� ���� ����� �����, �������� <H>
 * 
 */
class Box<T>
     private T item;

     T item = new T(); //��� ������!!! ��� ��� ��� ������� � ��� �� ���������!!!

     public T getItem(){
    	 return item;
     }
     public void setItem(T o){
    	 item = 0;
     }
}
Box <Integer> b = new Box <Integer>(); //b � s ����������� ������ �������!!!
Box <String>  s = new Box <String>();

b = setItem(5);
b = setItem("lalala"); // ������ ����������, ��� ������� b ��� ������ ���������� ���!!! 

/* ������ Generics, ����� ��� ��������� ���� ������� ������ ����� ���� ������ ������������
 * �� ������� ���������� ����.
 */
class Box <T extends Number> {
	private T item;
}
Box <Integer> b1
Box <Float> b2
Box <Number> b3

Box <String> a // ������!!! ��� ��� String �� ����������� �� Number.

/* <? exends Number> - �������� ������� ����� ��������;  ��� <? super Number> �������� ������.
 * 
 */
Number sum(Box <? exends Number> a1, a2) {
	return a1.setItem() + a2.setItem();	
}
sum(b1,b1);
sum(b2,b2);


/*
 * 
 */
class Hello {
	public <T,K,M> T sum(K item1, M item2) {
		return item1 + item2;
	}
}
String a sum(newInteger(5), new Float(5.5));

/* Collections
 * Interface and Implementations
 */
Interface
��.���

List - ��� ������ (�������������), ��� ����� �� �������. ������� ����� �����������.
Set  - ��� ������ ��� ��������, �� � ��� ������ ������ ������ ���� ����������!!!
SortedSet - ���������������.
Map  - ��� ��� ������ Key �� ���������� Value.

Implementations

ArrayList  - ������� �����.
LinkedList - ���������� �������� ��������� ������, �� ����� ������!

HashSet (����������� ��������� Set)      - ���������� ����� � ���������.
TreeSet (����������� ��������� SortedSet)

HashMap 
TreeMap

/* ������ ����������� ��������� ����� ����������.
 * 
 */
ArrayList<E> a = new ArrayList();
List a1 = new ArrayList();   // ����� �1 ����� ����� ������ ����!!

a.add(5);
set(10);

List<Integer> a = new ArrayList<Integer>();
Map<Integer, String> m;
m.put(5,"aa");

for (Iterator<Integer> item = a.getIterator, item.hasNext(),  ){
	Integer elem = item.next();
}

// Iterator - ��� �����, ����.
hasnext(): boulean;
next(): T;
remove;

for (Integer elem: a) {
	setIterator();
}



















