package ifFor;

public class SwitchEx2 {

	public static void main(String[] args) {
		/*
		 * ����� breake (������, ���������) �������� ����� ���������� ������� ��������.
		 */
		for (int i = 0; i < 12; i++){
			switch(i){
			   case 0:
			   case 1:
			   case 2:
			   case 3:
			   case 4:
				   System.out.println("i ������ 5");
				   break;
			   case 5:
			   case 6:
			   case 7:
			   case 8:
			   case 9:
				   System.out.println("i ������ 10");
				   break;
			   default:
				   System.out.println("i ����� ��� ������ 10");
			}
		}
		/*
		 * ������ �������������� ������ � ������� ����
		 */
		for (int j = 0; j < 14; j++){
			switch(j){
			   case 12:
			   case 1:
			   case 2:
				   System.out.println("�����" + j + "��������� � ����");
				   break;
			   case 3:
			   case 4:
			   case 5:
				   System.out.println("�����" + j + "��������� � �����");
				   break;
			   case 6:
			   case 7:
			   case 8:
				   System.out.println("�����" + j + "��������� � ����");
				   break;
			   case 9:
			   case 10:
			   case 11:
				   System.out.println("�����" + j + "��������� � �����");
				   break;
			   default:
				   System.out.println("�����" + j + "��������� � ������������ ������");
			}
		}

	}

}
