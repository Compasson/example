package classExample;

/*
 *   �������� ����� ��������� �� ���������� � ������� ��������� ����� super
 *        SUPER ����� ��� ����� �����:
 *             1)����� ������������ �����������
 *             2) ��������� � ����� �����������(� ��� ������ ���� ���� ��������).
 *             
 */

class Human {
	private int width;
	private int height;
	private int depth;
	
	// ��������������� ����� �������
	Human(Human ob) {
		width = ob.width;
		height  = ob.height;
		depth = ob.depth;
	}
	
	Human(int w, int h, int d){
		width = w;
		height  = h;
		depth = d;
	}
	
	Human(){
		width = -1;
		height  = -1;
		depth = -1;
	}
	

}

public class SuperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
