package classExample;

/*
 *   ���������� �������������
 *    �������:
 */
class Boxx {
	
	int width, height, depth;
	
	// ����������� � 3-�� �����������
	Boxx(int w, int h, int d){
		width = w;
		height = h;
		depth = d;
	}
	
	// ������������, �����������, ����� �� ���� �����. �� �����.
	Boxx(){
		width = -1; // ����������� ��� �������������������� ����������.
		height = -1;
		depth = -1;
	}
	
	// ����������� ��� �������� ����
	Boxx(int len){
		width = height = depth = len;
	}
	
	// ���������� � ������� ������
	int volume(){
		return width*height*depth;		
	}
}

public class ConstructorOverLoad {

	public static void main(String[] args) {
		
		Boxx b1 = new Boxx(3,4,5);
		Boxx b2 = new Boxx();
		Boxx b3 = new Boxx(7);
		
		System.out.println("����� ������� ������ b1 � ������������� �� 3 ���������� ����� = " + b1.volume());
		System.out.println("����� ������� ������ b2 � ������������� ��� ���������� �� ����� ���� ��������,�.�. ���������� �� �����������������.");
		System.out.println("����� �������� ������ b3 (����) � ������������� �� 1 ���������� ����� = " + b3.volume());

	}

}
