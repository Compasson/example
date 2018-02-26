package regularexpressions;

/**
 *     
 *     ^                  - ������ ������
 *     $                  - ����� ������
 *     [a-z && [^p-t]]    - ��������� (������������ ��������� � ���������� ��������). a-z ����� �� p �� t.
 *     \s                 - ������ �������
 *     \n                 - ������ ����� ������
 *     [a-z]              - a ��� b ��� � ��� ...
 *     [^abc]             - ����� ������ ����� a,b ��� �
 *     X+                 - X ���� ��� ��������� ���
 *     XY                 - X �� ������� ������� Y
 *     X|Y                - ���� X, ���� Y
 *     
 */

import java.util.Arrays;
import java.util.regex.Pattern;


public class Test1RegExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// XML ��� � ������� <xxx></xxx>
		Pattern pattern = Pattern.compile("^<([a-z]+) ([^>]+)*(?:>(.*)<\\/\\1>|\\s+\\/>$"/*����� ���������� ���������*/, Pattern.CASE_INSENSITIVE/*����� �������� ������ ��������, �������� ����� ������� ���� ������������*/); 

		// e-mail ����� � ������� xxx@xxx.xxx 
		Pattern pattern2 = Pattern.compile("^([a-z0-9_\\.-]+)@([a-z0-9_\\.+)\\.([a-z\\.]{2,6})$");
		
		// ������ ���������� ��������� ������������� ������ ��������� ��
		// ��� hex ��� �����?
		if (Pattern.matches("^#?(a-f0-9]{6}|[a-f0-9]{3})$", "#8b2323"))
		{
			// ������ true, ������ ���-��
		}
		
		//����� ������ ��������� ������������� ������� ������ �� ������ �������� ��������� ��. � ���� ��� ������� ����� split:
		Pattern pattern3 = Pattern.compile(":|;");
		String[] animals = pattern3.split("cat:dog;bird:cow");
		Arrays.asList(animals).forEach(animal -> System.out.print(animal + " "));
		// cat dog bird cow 
		
		
		
		
	}

}
