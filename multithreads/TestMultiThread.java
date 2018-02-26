package multithreads;

/**
 *     Чтобы зоздать поток надо выполить 5 пунктов:
 *     
 *          1)  В тело метода run() ввести код исполняемой задачи. У интерфеса Runnable оди единственный метод.
 *          2)  Создать класс реализующий интерфейс Runnable
 *          3)  Сконструировать обьект нашего класса
 *          4)  Сконструировать обьект типа Thread из обьекта нашего класса
 *          5)  Запустить поток методом start()
 *          
 *     В этой программе создается 5 потоков, где каждому потоку задается свое имя через конструктор.
 *     
 * @author IRINA
 *
 */

import java.util.ArrayList;

public class TestMultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("Первый");
		list.add("Второй");
		list.add("Третий");
		list.add("Четвертый");
		list.add("Пятый");

		for(int i = 0; i < 5; i++ )
		{
			MyRunnable r = new MyRunnable(list.get(i));
			Thread t = new Thread(r);
			t.start();
		}


	}

}
