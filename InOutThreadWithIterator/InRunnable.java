package InOutThreadWithIterator;

public class InRunnable implements Runnable{
	
BasesData bdout;
	
	public InRunnable(BasesData bdi)
	{
		this.bdout = bdi;
	}
	
	public void run()
	{
		// ����� ���� ������ � ���� ������
		try{

			   boolean b = true;
			   int iter = 0;
			
			   while(b == true)
			   {				
				   bdout.addString("������ �" + String.valueOf(iter));
				   System.out.println("������ ����� �" + String.valueOf(iter) + " ��������� � ���� ������");
				   iter++;
				   Thread.sleep(3000);
			   }
		   } catch (InterruptedException e){}
	}
}
