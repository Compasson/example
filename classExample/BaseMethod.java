package classExample;

/*
 * �����:
 *       ��� ���(������ ����������){
 *           // ���� ������
 *       }
 */

class Box{
	double width;
	double height;
	double depth;
	
	void volume(){ // ��� ���� ������������� ��������. ����� ������.
		System.out.println("����� ����� ����� " + width*height*depth);
	}
	
	double volume1(){ // ����� ���������� �������� ���� double.
		return width*height*depth;
	}
	
	void setDim(double w, double h, double d){ // ����� � ����������� ������������� �������� ����� �������.
		width = w;
		height = h;
		depth =d;
	}

}

public class BaseMethod {

	public static void main(String[] args) {
	
		Boxx mybox1 = new Boxx();
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 30;
		
		mybox1.volume(); // ����������� ���� �����, �� ����� �� ���������� ��������.
		
		System.out.println("����� volume1 ���������� �������� ������ " + mybox1.volume1());
		
		Boxx mybox2 = new Boxx();
		System.out.println("����� setDim ������������� �������� ����� ������� ����� ������� ���������.");
		mybox2.setDim(23, 47, 18);
		System.out.println("����� setDim ��������� �������� ����� ������� mybox2:  width = " + mybox2.width + ",  height = " + mybox2.height + ",  depth = " + mybox2.depth);
		
		




		
	}

}
