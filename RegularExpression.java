package example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 *  ���������� ���������
		 *  ��������

���������� ��� ������� ����������, �� ������ ������� �������� ��������� ��:

������������������� �������� ������� (���) � ���������, ����������� ���������� ����������
����������������� �������� ������� (���) � ���������, ����������� �������

��� � ��������, � ������� ���������� ������ �� ���������� �� ���������� � ����������.
 ��� ������������� �� �� ������ ���������� � ���������, ��������� �� ��������� � �������.
  ���� ��������� � ���������� ��������� ���������. ��������� ����������� �� ��� ���, 
  ���� �� ����� ������� ���������� ��� ���� ����������� �� (���� �� ������� ����� ����������).

��� � ��������, ������� ����������� ������ � ������ �� ����� ����������� ������������. 
��� ������ ������� �� ������� ����������������� ������� ������ (�� ���� ��� ������������ �������). 
����� �������� ��������� ������ ������, ��������� �������������� ���������� � ����������� ���. 
���� ��������� ������ ���������� �������������� ����������, �� ��� ������������ � �������. 
��� ������� � ��� ����������.

�������, ��� ��� ������ �������� ������� ��� ��� (��� ��������� ������ ������ ������ �� ����� ������ ����,
 ��� � ������� ������ ��� ���� �� �������� ������ ��).
  �� ��� ������������� ����������� ���������� ��� ���������� �������.
   �� ����� � ������������ ������� ��������� ��������� �� ���� ����������� ��������� ��.
   
   
		 */
        String c = "cat";
		Pattern pattern = Pattern.compile("cat");
		Matcher matcher = pattern.matcher(c);
		boolean matches = matcher.matches();
		System.out.println(matches);
	}

}