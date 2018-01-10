package Interface;
/*
 * Interface ����������� ��� �������� ��������� ���������� �������
 * ��������� ���������� ����� ���� "�������� ��������������" ����� ��������,
 * ������� ��������� ������ ���������.
 * �������� ����� ��������� ����, �� ��� ������������� �������� ������������ static � final �����������.
 * ��� �������� �������, ��� �������� public ���� ��� �������������,
 * ���� ����� ������� �� ���� public.
 * 
 */
interface Instrument {
	int VALUE = 5; // �������� static and final
	void play(); // ������������� �������� ��� public
	void adjust(); // ����������� ������� �� ���������
}

class Wind implements Instrument {
	public void play () {System.out.println(this);};
	public String toString() {return "Wind";};
	public void adjust() {};	
}

class Percussion implements Instrument {
	public void play () {System.out.println(this);};
	public String toString() {return "Percussion";};
	public void adjust() {};	
}

class Brass extends Wind {
	public String toString() {return "Brass";};
}

class Woodwind extends Wind {
	public String toString() {return "Woodwind";}; // ��� ��� ����� toString ������ � �������� ������� Object, ��� ���������� � ���������� �� �����������
}

public class TestInterface {
	// ������ ������ �� ������� �� ������������ ���� ������,
	// ������� ����, ����������� � ������� ����� �������� ���������
	static void tune(Instrument i) {
		
		i.play();
	}
	static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
	}
	public static void main(String[] args) {
		// ���������� �������������� ��� ���������� � ������
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Brass(),
				new Woodwind()
		};
		tuneAll(orchestra);
	

	}

}
