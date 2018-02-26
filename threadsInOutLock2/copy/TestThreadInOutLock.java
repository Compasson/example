package threadsInOutLock2.copy;

/**
 *     
 *     � ���� ��������� 2 ������. ���� ����� ����� ���������� ������ � ���������
 *        � ������ ����� �������� ������ �� �����.
 *        
 *     ����� ������������ ������ ���������� ������ RenntrantLock.
 *     
 *     ������������ �������.
 *        
 *                   
 *                   DISINE:
 *                           Class TestThreadInLOck
 *                           {    
 *                                 main(){ ������ ���� �������}
 *                                 
 *                           Class DataBases
 *                           {
 *                                ���� Lock
 *                                ���� ArrayList
 *                                
 *                                ����� write
 *                                
 *                                ����� read
 *                           }
 *                                 
 *                         
 */


public class TestThreadInOutLock {

	public static void main(String[] args) {
		
	   DataBases list = new DataBases();
		
	   // ����� �����. ����� � Java 8 ����� ������� � ������� ����� ���������
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
	   
	   // ����� ������
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
