package classExample;

/*
 *  �������� - ����������� ������ ������� ������ ����.
 *      ������ ������� ��������:
 *      
 *         ���������� ����������� �����.
 */

class Facotorial {
	int fact(int n){
		int result;
		
		if(n==1) return 1;
		result = fact(n-1)*n;
		return result;
	}
}

public class Recursiya {

	public static void main(String[] args) {
		Facotorial f = new Facotorial();
		
		System.out.println("���������� 3 ����� " + f.fact(3));
		System.out.println("���������� 4 ����� " + f.fact(4));
		System.out.println("���������� 5 ����� " + f.fact(5));



	}

}
