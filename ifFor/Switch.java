package ifFor;

public class Switch {

	public static void main(String[] args) {
		/*
		 * Switch �������� ����������� ����������� IF-ELSE-IF
		 * 
		 * switch (���������) {
		 *    case ��������1:
		 *       // ������������������ ����������
		 *       break;
		 *    case ��������2:
		 *       // ������������������ ����������
		 *       break;
		 * ...
		 * ...
		 *    case ��������N:
		 *       // ������������������ ����������
		 *       break; // 
		 *    default: // �� ����������
		 *       // ������������������ ����������, ����������� �� ���������.
		 *    
		 * ��������� - ������ ����� ��� type, String, short, int, char, ��� ������������.
		 * 
		 */
		for (int i = 0; i < 5; i++){
			switch(i){
			   case 0:
				   System.out.println("�������� ���������� ����� " + i);
				   break;
			   case 1:
				   System.out.println("�������� ���������� ����� " + i);
				   break;
			   case 2:
				   System.out.println("�������� ���������� ����� " + i);
				   break;
			   default:
				   System.out.println("�������� ���������� ������ 2 ");
			}
		}
		

	}

}
