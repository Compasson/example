package UijTkachLessons;

public class Lesson16 { JUNIT

	// ����� ��� ������������
	
	public class Calc {
	
	public int add (int a, int b){
		return a + b;
	}
	public double div (int a; int b){
		return a/b;
	}
	/*
	 *  ������ ����� ���� ��� ������ Calc
	 *  ��������� ����� ���� �������� ���������� ������ TestCalc TestCat
	 */
	public class TestCalc{
		@ Test // @ - ���������, ���������, ����� �������� ������� ����� D Test
		public void test Add(){
			Calc c = new Calc(); // ��� �� ����� ��������������� ���� ������ ������ ���� ������
			int () rez = c.add(2, 5);
			if (7 := rez){
				fail("Ha-Ha"); // ����������� �������, ����� � ������������ ����������� ����������� ������� ����� import static org.junit.Assert.*;
				// assertTrue (rez==7);
				// assertTrue ("error", rez==7);
				// assertEquals (7, rez);
				// assertNull (new Object()); ��������� 
				// assertNotNull
				// assertFalse
			}
		}
	}
	

	
	public void test Div(){
		Calc c = new Calc();
		assertEquals(2, c.div(10, 5));
		/*
		 *  ���� ������ 5 ����� 0. ��� ��������� ��� ���� ������ ������.
		 *  ���� 2 �������:
		 *  ������ 1:
		 */
		try {
			c.div(2, 0;)
			// ������ 2:
			fail(should exeption)
		} catch (Exeption p){
			
		}
		// ������ 2:
		
	// ����� ����� ������ ���������, ���������� ����� ����� �������� � ���� ���� �������.
		@ - ��������� Test (expected = Exeption.class)
		puplic void testDivExept(){
			new Calc().div(2, 0);
		}
		
		/*
		 *  JUNIT �� ����������� ������� ���������� ������
		 *  ��� ���������� ���, ��� ������ ���� ������ ���� ����������� �� ������,
		 *  ����� ������������� �������� �����.
		 */
		
		public class TestCalc{
			@ Test
			public void testAdd(){
			...	}
			@ Test
			public void testDiv(){
			...	}
			/*
			 * ���� ������ testAdd testDiv ���������� ����� setup,��
			 * ������������ @ Before. ����� �����  setup ����� ����������� ����� ������ ������.
			 */
			@ Before
			public void setup(){
				c=new Calc();
			}
			@ After // ����� �����.
			@ Befor Class
			@ After Class
			
			/*
			 * ��� ��������� �����:
			 * 1) ANT, Maven
			 * 2) IDE (eclipce)
			 * 3.1) console (cmd)  ## JUnitCore
			 * 3.2) GUI
			 * 
			 * ��� ������ ������� ��������� ����� New Source Folder,
			 * ��� ������, ��� ���������� �������� ������ �������������.
			 */
			
			/*
			 * ��� �����������?
			 * ������� ������� (test)  � ����� � ����� �� ������ (j4t) ��� � � ������������� ������ (Calc)
			 * ��������� � ����� ����� java-���� JUnit Test Case.
			 * � ���� ���� ����� ����� (���������) �������� ����������� ����� � @arter � @before
			 * 
			 * ������: Run As
			 */
		}
}
}
