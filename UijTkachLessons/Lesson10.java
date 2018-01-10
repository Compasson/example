package UijTkachLessons;

import java.util.ArrayList;
import java.util.Iterator;

public class Lesson10 (Generics, Collections)

Generics
/* В классе Вох надо хранить обьекты разных типов
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

/* Очень мощная штука! Из C++ было взято: В отдельном классе на этапе выполнения программы класу назначается
 * несколько типов обьектов, хотя на этапе компиляции класу может быть назначено гораздо
 * больше типов обьектов.
 * <T> - так указывается тип обьектов, может быть любая буква, например <H>
 * 
 */
class Box<T>
     private T item;

     T item = new T(); //ТАК НЕЛЬЗЯ!!! Так как тип обьекта Т еще не определен!!!

     public T getItem(){
    	 return item;
     }
     public void setItem(T o){
    	 item = 0;
     }
}
Box <Integer> b = new Box <Integer>(); //b и s принадлежат разным классам!!!
Box <String>  s = new Box <String>();

b = setItem(5);
b = setItem("lalala"); // ОШИБКА КОМПИЛЯЦИИ, для обьекта b уже жестко определент тип!!! 

/* Пример Generics, когда все возможные типы данного класса могут быть только наследуемыми
 * от заранее указанного типа.
 */
class Box <T extends Number> {
	private T item;
}
Box <Integer> b1
Box <Float> b2
Box <Number> b3

Box <String> a // НЕЛЬЗЯ!!! Так как String не наследуется от Number.

/* <? exends Number> - обрезает верхние ветки иерархии;  или <? super Number> обрезает нижние.
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
см.РИС

List - это список (упорядоченный), где поиск по индексу. Обьекты могут повторяться.
Set  - это список без индексов, но в нем каждый обьект должен быть уникальным!!!
SortedSet - отсортированный.
Map  - это сет ключей Key со значениями Value.

Implementations

ArrayList  - быстрый поиск.
LinkedList - добавление удаление элементов быстро, но поиск долгий!

HashSet (имплементит интерфейс Set)      - скоростной поиск и изменение.
TreeSet (имплементит интерфейс SortedSet)

HashMap 
TreeMap

/* Всегда используйте коллекции через интерфейсы.
 * 
 */
ArrayList<E> a = new ArrayList();
List a1 = new ArrayList();   // Здесь а1 может иметь разные типы!!

a.add(5);
set(10);

List<Integer> a = new ArrayList<Integer>();
Map<Integer, String> m;
m.put(5,"aa");

for (Iterator<Integer> item = a.getIterator, item.hasNext(),  ){
	Integer elem = item.next();
}

// Iterator - это кусок, ящик.
hasnext(): boulean;
next(): T;
remove;

for (Integer elem: a) {
	setIterator();
}



















