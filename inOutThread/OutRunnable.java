package inOutThread;

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
			
			   while(b == true)
			   {
				   Thread.sleep(6333);
				   System.out.println("�� ���� ������ ��������� ������ �" + i + ". �� ��������� ����������: " + bdout.readString(i));
				   i++;
			   }
		   } catch (InterruptedException e){}
	}

}
