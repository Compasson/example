package ifFor;

public class IfExample2 {

	public static void main(String[] args) {
		/*
		 *  ������ ��� ������������� ��������� if ������� ��� ���������.
		 *  �� ��� �� �����������.
		 *  � ������� ����� �������������� ���������� boolean
		 */
		boolean dataAvailable;
		// ���������, ���� �� �����
		if (dataAvailable){
			ProcessData(); 
		} else {
			waitForMoreData();
		}
			 
	}

}
