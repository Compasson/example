package homeBuhg;

import java.util.ArrayList;
import java.util.Calendar;

import homeBuhg.Option;

public class DBase
{
	public int month;
	public String catg;
	public ArrayList<Option> listo;
	
	// ����������� ��� ������������ ��������� �������
	DBase(String s){
		catg = s;
		month = Calendar.MONTH;
		listo = new ArrayList<Option>(10);
	}
	
	
	// ���������� � ���� �������� �����������
	public void ad(Option o)
	{
	    this.listo.add(o);
	}
	
	// ����� ����� ������ �� ������������ ����� �� ���������� ��������� (���� ������ ���� �����)
	public int allSummMonth()
	{
		int summ = 0;
		    for(Option x : listo)
		    {
		    	summ = summ + x.volume;
		    }
	    return summ;
	}
}
