package ifFor;

public class WHile {

	public static void main(String[] args) {
		/*
		 * while (�������){
		 * ���� �����}
		 * 
		 * ���� while ��������� ���� �������� ��������� � ������ �����,
		 * ���� ����� �� ���������� �� ����, ���� ������� �����.
		 */
		int n = 10;
		while (n > 0){
			System.out.println("���� " + n);
			n--;
		}
		/*
		 * while ����� �������������� ��� ���� �����, ��������� �������� � �������
		 * �������� ���������� �������� ��������
		 */
		int i,j;
		i = 100;
		j = 200;
		
		while (++i < --j); // ��� ���� �����
		System.out.println("������� �������� ����� " + i);
		
		

	}

}
