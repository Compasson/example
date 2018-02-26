package inOutThread;

import java.awt.EventQueue;

/**
 *    Класс базаданных содержит реализует лист срок.
 *    В данной программе 3 потока: основной, записывающий и считывающи.
 *    Считывание производится с помощью индекса ArrayList
 *    
 *        Чтобы не было ошибки: считывание i-ого индекса пошло, а запись не произведена. Или потоки одовременно пытаются подключиться к базе данных сделано так:
 *        
 *                  1) Считывающий поток запускается после записывающего и намеренно сначала спит, потом работает.
 *                  2) Задежка у считывающего потока чуть больше чем записывающего
 *                  3) Задежка у считывающего потока 3333, а у записывающего 3000. Вероятность одновременного подключения к базе данных снижается.
 * 
 * @author IRINA
 *
 */

public class TestInOutThread {

	public static void main(String[] args) {
		
		// 
		EventQueue.invokeLater(new Runnable()
        {
           public void run()
           {
        	   BasesData bd = new BasesData();
        	   InRunnable ri = new InRunnable(bd);
        	   OutRunnable ro = new OutRunnable(bd);
        	   Thread t1 = new Thread(ro);
        	   Thread t2 = new Thread(ri);
   			   t1.start();
   			   t2.start();

           }
        });
		

	}

}
