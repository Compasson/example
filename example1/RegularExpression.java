package example1;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 *  –егул€рные выражени€
		 *  ѕрименение регул€рных выражений дл€ массива строк
		 */
		String[] m = new String[5];
	    m[0] = "cat";
	    m[1] = "dog";	    
	    m[2] = "sun";
	    m[3] = "gift";
	    m[4] = "cry";
	    
	    // —уммируем массив строк с помощью concat() в одну строку
	    String a = "";
	       for (int i = 0; i < 5; i++){
	    	   a = a.concat(m[i]); // concat ( String string ) Ч ќбъедин€ет строку с указанной строкой;
	    	   a += " "; // ƒобавл€ем к а пробел.
	       }
	    System.out.println(a);
	    
	    /*
	     *  ƒеление стоки на массив слов, разделитель пробел.
	     *  ÷икл работает плохо - доработать!!! ќшибка, если значение i больше  колличества слов!
	     *  
	     */
	    String[] b = new String[5]; 
	    int s,e;
	    s = 0;
	    e = 0;
	           for (int i = 0; i < 5; i++){
	           e = a.indexOf(" ",s); // indexOf ( String subString, int start ) Ч ищет цепочку символов subString начина€ с позиции start;
	           b[i] = a.substring(s,e);  // substring ( int start, int end ) Ч создает новую последовательность \ строку с символами из данной строки начина€ с позиции start до конца строки \ заканчива€ символом с позиции end;
		       s = e + 1; // e++ почему-то не работает
	           }
	    for (int i = 0; i < 5; i++){       
	    System.out.println(b[i]);
	    }
	    // ѕример применени€ регул€рных выражений
        String c = "cat";
		Pattern pattern = Pattern.compile("cat");
		Matcher matcher = pattern.matcher(c);
		boolean matches = matcher.matches();
		System.out.println(matches);
	}

}
