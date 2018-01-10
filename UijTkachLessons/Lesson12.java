package UijTkachLessons;

Lesson 12 ( Threads - потоки)

/*
 * Процесс это java.exe внутри JVM. Как в windows например браузер, винамп, скайп и т.д.
 * Один процесс обычно не обращается к другому, если это не IPC.
 * Каждый процесс как минимум имплементит хотябы один поток Main. рис.12
 */
Process

/*
 * Поток это простейший блок который может выполняться на отдельном ядре процессора.
 * Поток можно создать:
 */
Threads

class Thread      interface Runnable

class MyThread implements Runnable {
	publi void run(){
		//action
	}
}
// Чтобы запустить как поток:
Thread t = new Thread (new MyThread());
t.start(); // С этого момента поток t существует параллельно основной программе.

// Второй способ:
public MyThread extends Thread{
	@override
	public void run(){
		//action		
	}
}
new Myhread().start();

// Анонимные классы
new Thread(new Runnable(){
	public void run(){
		//action
	}
}).start();

//Чтобы остановить поток используем sleep.
public void run(){
	//action
    try {
    	Thread.sleep(1000); //sleep 1 sec.
    } catch (IterapedExeptions){
    }
    //action 2
}
//Метод join - засыпает поток, ждет пока все выполнится потом просыпается и продожает выполняться 
t1 = new Thread();
t1 = new Thread();
t1.start();
t2.start();
   t1.join();
   t2.join();
   
/*Представим что есть class Conter и два потока:
 * Оба потока могут вызывать методы одновременно и выходит ошибка.
 * Поэтому ипользуется синхронизация : перед методом ставится syncronized!
 */  
public class Conter{
	int c = 0;
	public syncronized void inc(){
	c++;
	}
	public syncronized void dec(){
		c--;
	}
	public syncronized void getC(){
		return c;
	}
}
//Без синхронизации
Tread1              Thread2
1. Thread1 inc       1
2. Thread2 dec      -1
3. Thread1 get      -1
//C синхронизацией
Tread1              Thread2
1. Thread1 inc       1
2. Thread2 get  sleep
/* Поток2 засыпает (занято) и ждет пока  поток 1 закончит работу.
*  Если спящих потоков много то выбор падет рандомайз!!!
*/

public void inc(){
	syncronized (this){
		c++;
	}
	}
/*
 * Два счетчика
 */
public class Conter{
	int c1;
	int c2;
	Object lock1 = new Object();
	Object lock2 = new Object();
	    public void inc1(){
		    syncronized (lock1){
			    c1++;
        }
	 	public void inc2(){
			syncronized (lock2){
				c2++;
		}
}
	 	
//Как получить Deadlock. Когда оба спят и друг друга ждут.рис.12-1
Deadlock
//Чем меньше синхронайз методов тем лучше!!!
livelock //Потки работают но немогут двинуться дальше по коду.
race conditions //