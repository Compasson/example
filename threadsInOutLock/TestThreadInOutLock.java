package threadsInOutLock;

/**
 *     
 *     В этой программе 2 потока. Один поток будет записывать данные в коллекцию
 *        а второй поток выводить данные на экран.
 *        
 *                   
 *                   DISINE:
 *                           Class TestThreadInLOck
 *                           {    
 *                                 main(){ запуск двух потоков}
 *                                 
 *                           Class DataBases
 *                           {
 *                                поле Lock
 *                                поле ArrayList
 *                                
 *                                метод write
 *                                
 *                                метод read
 *                           }
 *                                 
 *                           Class InRunnable impl Runnable
 *                           {    
 *                                вводит данные   
 *                           }
 *                           
 *                           Class OutRunnable impl Runnable
 *                           {
 *                                выводит данные
 *                           }
 */


public class TestThreadInOutLock {

	public static void main(String[] args) {
		
	   DataBases list = new DataBases();
		
       InRunnable in = new InRunnable(list);
	   Thread tin = new Thread(in);
	   tin.start();
	   
	   OutRunnable out = new OutRunnable(list);
	   Thread tout = new Thread(out);
	   tout.start();
		


	}

}
