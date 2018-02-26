package InOutThreadWithIterator;

import java.util.Iterator;

public class OutRunnable implements Runnable {
	
	BasesData bdout;
	
	public OutRunnable(BasesData bdo)
	{
		this.bdout = bdo;
	}
	
	public void run()
	{
		// ���� bdout.getList
		try{

			   boolean b = true;
			   int i = 0;
			   Iterator<String> it = bdout.list.iterator();
			
			   while(b == true)
			   {
				       Thread.sleep(3333);
				       if( it.hasNext())
				       {
				    	   System.out.println("�� ���� ������ ��������� ������ �" + i + ". �� ��������� ����������: " + it.next());
						   i++;
				       }			   
			   }
		   } catch (InterruptedException e){}
	}

}
