package classExample;

/*
 *  ������ ����������� ������������� ������
 */

class OverL {
	void test(){
		System.out.println("����� ��� ����������");
	}
	void test(double b, double c, double d){
		System.out.println("������������� ����� c ����� �����������. ����� ������� ����� ����� = " + (b + c + d)/3);
	}
	String test(String s, int i){
		System.out.println("������������� ����� c ����� ����������� ������� ����.");
		return s.concat(" ").concat(String.valueOf(i));
	}
	void test(double d){
		System.out.println("����� ����������� ��� int � �������� double � ����������������� ���. Double = " + d);
	}
	
}
 
public class MethodOverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		String stroka;
		
		OverL o = new OverL();
		o.test();
		
		o.test(35, 78, 24);
		
		stroka = o.test("Rinat", 324);
		System.out.println("����� ������ 2 ��������� ������� ���� � ��������� �� � ������: " + stroka);
		
		o.test(46);

	}

}
