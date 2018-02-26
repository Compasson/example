package threadsInOutLock;

/**
 *     
 *     � ���� ��������� 2 ������. ���� ����� ����� ���������� ������ � ���������
 *        � ������ ����� �������� ������ �� �����.
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
 *                           Class InRunnable impl Runnable
 *                           {    
 *                                ������ ������   
 *                           }
 *                           
 *                           Class OutRunnable impl Runnable
 *                           {
 *                                ������� ������
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
