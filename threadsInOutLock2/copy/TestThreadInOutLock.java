package threadsInOutLock2.copy;

/**
 *     
 *     В этой программе 2 потока. Один поток будет записывать данные в коллекцию
 *        а второй поток выводить данные на экран.
 *        
 *     Здесь используется обьект блокировки класса RenntrantLock.
 *     
 *     Используется очередь.
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
 *                         
 */


public class TestThreadInOutLock {

	public static void main(String[] args) {
		
	   DataBases list = new DataBases();
		
	   // Поток ввода. Поток в Java 8 можно создать с помощью лямда выражений
       Runnable in = () -> {
    	   try
    	   {
    		   while(true)
    		   {
    			   list.write();
    			   Thread.sleep(10);
    		   }
    	   } catch (InterruptedException e)
    	   {
    		   
    	   }
       };
	   Thread tin = new Thread(in);
	   tin.start();
	   
	   // Поток вывода
	   Runnable out = () -> {
    	   try
    	   {
    		   while(true)
    		   {
    			   list.read();
    			   Thread.sleep(20);
    		   }
    	   } catch (InterruptedException e)
    	   {
    		   
    	   }
       };
	   Thread tout = new Thread(out);
	   tout.start();
		


	}

}
