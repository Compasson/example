package genp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenP {
	
	public String fullsign = "mnbvcxzlkjhgfdsapoiuytrewqMNBVCXZLKJHGFDSAPOIUYTREWQ1234567890!@#$%^&*() ";// � ����� ���������� �������� ������, ��� �� substring(x1,x2) �� ����� ������
	public String fullp = "";
	public String sign = "";
	public int kollsign = 12;
	public List<String> fullsigna = new ArrayList<>();
	public Random r = new Random();
	
	public GenP()
	{
		// ��������� ��������� �� ��������� ���������, ��� �������� ������� � ���
				for(int j = 0; j < fullsign.length() - 1; j++)
				{
					String s = fullsign.substring(j, j+1);
					fullsigna.add(s);
				}
	}


	public void generate()
	{
		/** ��� �������� ������������ ������� �� ��������
		String temp1 = fullsigna.get(a);
		String temp2 = fullsigna.get(a + 5);
		fullsigna.set(a, temp2);
		fullsigna.set(a + 5, temp1);
		Collections.shuffle(fullsigna);
		  */
		// ������������ ������ �� 10 ��������
		for(int i = 0; i < kollsign; i++)
		{
			sign = fullsigna.get(r.nextInt(fullsigna.size()));
			fullp = fullp + sign;
		}
		kollsign = 0;
	}

	

}
