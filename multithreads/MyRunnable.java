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
 * @author IRINA
 *
 */

public class MyRunnable implements Runnable {
	
	String name;
	
	public MyRunnable(){} // 
	
	public MyRunnable(String namethread)
	{
		name = namethread;
	}
	
	public void run ()
	{
		try{

		boolean b = true;
		
		
		while(b == true)
		{
			
			System.out.println(this.name + " поток проснулcя и уснул.");
			Thread.sleep(3000);
		}
		} catch (InterruptedException e)
		{
			
		}
	}

}
