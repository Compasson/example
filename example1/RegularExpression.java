package example1;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 *  ���������� ���������
		 *  ���������� ���������� ��������� ��� ������� �����
		 */
		String[] m = new String[5];
	    m[0] = "cat";
	    m[1] = "dog";	    
	    m[2] = "sun";
	    m[3] = "gift";
	    m[4] = "cry";
	    
	    // ��������� ������ ����� � ������� concat() � ���� ������
	    String a = "";
	       for (int i = 0; i < 5; i++){
	    	   a = a.concat(m[i]); // concat ( String string ) � ���������� ������ � ��������� �������;
	    	   a += " "; // ��������� � � ������.
	       }
	    System.out.println(a);
	    
	    /*
	     *  ������� ����� �� ������ ����, ����������� ������.
	     *  ���� �������� ����� - ����������!!! ������, ���� �������� i ������  ����������� ����!
	     *  
	     */
	    String[] b = new String[5]; 
	    int s,e;
	    s = 0;
	    e = 0;
	           for (int i = 0; i < 5; i++){
	           e = a.indexOf(" ",s); // indexOf ( String subString, int start ) � ���� ������� �������� subString ������� � ������� start;
	           b[i] = a.substring(s,e);  // substring ( int start, int end ) � ������� ����� ������������������ \ ������ � ��������� �� ������ ������ ������� � ������� start �� ����� ������ \ ���������� �������� � ������� end;
		       s = e + 1; // e++ ������-�� �� ��������
	           }
	    for (int i = 0; i < 5; i++){       
	    System.out.println(b[i]);
	    }
	    // ������ ���������� ���������� ���������
        String c = "cat";
		Pattern pattern = Pattern.compile("cat");
		Matcher matcher = pattern.matcher(c);
		boolean matches = matcher.matches();
		System.out.println(matches);
	}

}
