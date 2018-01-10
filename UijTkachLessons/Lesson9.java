Лекции Юрия Ткача из YouTube.

Для тестировщиков.

Урок 9 ООП (Exception)

PrintWriter out;

out = new PrintWriter(newFileWriter("a.txt"));

out.println("aaa");
// заключаем все в блок try, а в блоке catch описываем ошиюку (обработчик ошибки).
try {out = new PrintWriter(newFileWriter("a.txt"));

out.println("aaa");
} catch (FileNotFoundExeption e){
	System.err.println("Nema Failure");
}
// Для каждого типа ошибки придется писать свой catch.
  catch (......... e1){
	  .........
  }
  catch (......... e2){
	  .........
  }
// Но все равно можно все ошибки запихнуть в один catch

catch (Exception e){
	
}
//Внимание!! Суперклассы прописывать только внизу!!!  Обьект е2 наследуется от е.
catch (......... e2){
	  .........
}
catch (Exception e){
	
}
/* Exception обязательно требует обработчика
 * Runtime Exception не требует обработчика
 * Error - системные ошибки, на 99% не требуют вмешательства программиста
 */

public class Write {
	public static void main (String [] args){
		System.out.println("Hello");
		writeToFile();
		System.out.println("Bye");
	}
	/* chained exception - это способ, когда не нужно заключать метод в блок catch
	 * 
	 */
	public static void writeToFile() throw FileNotFound, IOException {
		PrintWrite
	}
}
/* Можно сразу выкинуть исключение на верх вызываемому методу:
 * 
 */
public void doSmth(User u){
	if (null == u){
		throw new NullPointerException();
		
	}
}
// Здесь ловит один обработчик, а выкидывает исключение другой.
catch (IO Exception e){
	throw new ServiceEx(e); 
}

У Exception есть метод:
	e.getMessage();
    e.getLocaled();
    e.stacktrace(); Metod[]
    e.printStacktrace();
// Блок finaly будет выполнен в любом случае. Вне зависимости были ошибки или нет.
try {
	...1
	...2
	...3
}
catch {
} finally {
	....
}










