package homeBuhg;

public class TestHomeBuhg
{
	public static void main (String[] args)
	{
		new BuhgFrame ();// �������� ������
		
		// ������������� ���� ������
		DBase dp = new DBase("�������");
		DBase dk = new DBase("����������");
		DBase dr = new DBase("������");
	
		for(int i = 0; i < 20; i++)
		{
			dp.ad(new Option(24, "�����������"));
			dk.ad(new Option(13, "�����������"));
			dr.ad(new Option(7, "�����������"));
		}
		
		System.out.println("����� ����� �� ��������� " + dp.catg + " = " + dp.allSummMonth());
		System.out.println("����� ����� �� ��������� " + dk.catg + " = " + dk.allSummMonth());
		System.out.println("����� ����� �� ��������� " + dr.catg + " = " + dr.allSummMonth());

		
		
	}
}