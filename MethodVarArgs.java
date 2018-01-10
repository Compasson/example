

/*      
 *         
 *         ����� � ���������� ������������ ����������
 *    
 *         ������������ � ����:
 *                             int ... v   - ���������� ����������� ���������� ���� int
 *                             ��� ���������� �������� �������� ���� ������.
 *                             
 *         int doIt(int a, int b, double c, String ... vals){}
 *               �����! 
 *                     - ���������� � ���������� ��� ���������� ������ ���������� ��������� ���������� � ������.
 *                     - � ����� ������ ����� ���� ������ ���� ���������� � �����.���.���.
 *         
 *         ���������� ������ � ���������� ������������ ���������� - ��� ������.
 *              
 *              �� ���� �����. ������ ��� �������� � ������ ���� vaTest(1);
 *                            void vaTest(int ... v){}
 *                            void vaTest(int n, int ... v){}
 *                          
 */

class MethodVarArgs {
	// msg - ������� ��������
	// v - ������ ���������� ���������� �����
	static void vaTest(String msg, int ... v){
		System.out.print(msg + v.length + " ����������: ");
		
		for(int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		
		vaTest("���� �������� MethodVarArgs: ", 10);
		vaTest("��� ��������� MethodVarArgs: ", 1, 2, 3);
		vaTest("��� ���������� MethodVarArgs: ");



	}

}
