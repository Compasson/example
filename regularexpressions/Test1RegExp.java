package regularexpressions;

/**
 *     
 *     ^                  - начало строки
 *     $                  - конец строки
 *     [a-z && [^p-t]]    - отрицание (используется совместно с отрицаемым символом). a-z кроме от p до t.
 *     \s                 - символ пробела
 *     \n                 - символ новой строки
 *     [a-z]              - a или b или с или ...
 *     [^abc]             - любой символ кроме a,b или с
 *     X+                 - X один или несколько раз
 *     XY                 - X за которым следует Y
 *     X|Y                - либо X, либо Y
 *     
 */

import java.util.Arrays;
import java.util.regex.Pattern;


public class Test1RegExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// XML тег в формате <xxx></xxx>
		Pattern pattern = Pattern.compile("^<([a-z]+) ([^>]+)*(?:>(.*)<\\/\\1>|\\s+\\/>$"/*ЗДЕСЬ РЕГУЛЯРНОЕ ВЫРАЖЕНИЕ*/, Pattern.CASE_INSENSITIVE/*Можно добавить второй параметр, например здесь регистр букв игнорируется*/); 

		// e-mail адрес в формате xxx@xxx.xxx 
		Pattern pattern2 = Pattern.compile("^([a-z0-9_\\.-]+)@([a-z0-9_\\.+)\\.([a-z\\.]{2,6})$");
		
		// Иногда необходимо проверить удовлетворяет строка заданному РВ
		// это hex код цвета?
		if (Pattern.matches("^#?(a-f0-9]{6}|[a-f0-9]{3})$", "#8b2323"))
		{
			// вернет true, делаем что-то
		}
		
		//Также иногда возникает необходимость разбить строку на массив подстрок используя РВ. В этом нам поможет метод split:
		Pattern pattern3 = Pattern.compile(":|;");
		String[] animals = pattern3.split("cat:dog;bird:cow");
		Arrays.asList(animals).forEach(animal -> System.out.print(animal + " "));
		// cat dog bird cow 
		
		
		
		
	}

}
