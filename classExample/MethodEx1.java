package classExample;

/*
 * ������ ������������� �������.
 * 
 *     
 */

class VeloMan {
	double skills; // ���� ����������� �� ����� �� 1 �� 10
	double bagag; // ���� �� ����� �� 10 �� �� 30 ��.
	double region; // ��������� �������� �� ����� �� 1 �� 6.
	
	double speed(double s, double b, double r){  // �������������� ������� �������� �������
		skills = s;
		bagag = b;
		region = r;
		return (skills/10 + region/6 + bagag/30)*10 +20;
	}
	
	
}

public class MethodEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VeloMan v1 = new VeloMan();
		System.out.println(v1.speed(5, 3, 20));

	}

}
