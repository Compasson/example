package CycleManag;

public class DoWhileEx3 {

	public static void main(String[] args)
		/*
		 * ������������� ����� do-while, ��� ������ ������ ����
		 * 
		 */
		throws java.io.IOException {
		char choice;
		do {
			System.out.println("������� ��:");
			System.out.println("     1. if");
			System.out.println("     2. switch");
			System.out.println("�������� ����� ����: ");
			choice = (char) System.in.read();
		} while (choice < '1' || choice > '2');
		
		switch (choice) {
		    case '1':
		    	System.out.println("if:");
		    	System.out.println("if (�������) ��������; ");
		    	System.out.println("else ��������;");
		    	break;
		    case '2':
		    	System.out.println("switch:");
		    	System.out.println("switch (���������) {");
		    	System.out.println("case ���������:");
		    	System.out.println("������������������ ����������");
		    	System.out.println("break;");
		    	System.out.println("// ...");
		    	System.out.println("}");
		    	break;

		}
	}

}
