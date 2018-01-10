package UijTkachLessons;

public class Lesson16 { JUNIT

	// Класс для тестирования
	
	public class Calc {
	
	public int add (int a, int b){
		return a + b;
	}
	public double div (int a; int b){
		return a/b;
	}
	/*
	 *  Теперь пишем тест для класса Calc
	 *  Тестовыйе класс надо называть одинаковым словом TestCalc TestCat
	 */
	public class TestCalc{
		@ Test // @ - АННОТАЦИЯ, прописная, перед тестовым методом пишем D Test
		public void test Add(){
			Calc c = new Calc(); // Что бы класс протестировался надо содать обьект того класса
			int () rez = c.add(2, 5);
			if (7 := rez){
				fail("Ha-Ha"); // Статическая функция, чтобы её использовать импортируем статические функции пишем import static org.junit.Assert.*;
				// assertTrue (rez==7);
				// assertTrue ("error", rez==7);
				// assertEquals (7, rez);
				// assertNull (new Object()); Проверяет 
				// assertNotNull
				// assertFalse
			}
		}
	}
	

	
	public void test Div(){
		Calc c = new Calc();
		assertEquals(2, c.div(10, 5));
		/*
		 *  Если вместо 5 будет 0. Как проверить что Тест уловит ошибку.
		 *  Есть 2 способа:
		 *  Способ 1:
		 */
		try {
			c.div(2, 0;)
			// Способ 2:
			fail(should exeption)
		} catch (Exeption p){
			
		}
		// Способ 2:
		
	// Лучше тесты делать маленкими, предыдущий метод можно записать в виде двух простых.
		@ - аннотация Test (expected = Exeption.class)
		puplic void testDivExept(){
			new Calc().div(2, 0);
		}
		
		/*
		 *  JUNIT не гарантирует порядок выполнения тестов
		 *  Это обьяняется тем, что каждый тест должен быть независимым от других,
		 *  чтобы гарантировать качество теста.
		 */
		
		public class TestCalc{
			@ Test
			public void testAdd(){
			...	}
			@ Test
			public void testDiv(){
			...	}
			/*
			 * Если методы testAdd testDiv используют метод setup,то
			 * используется @ Before. Тогда метод  setup будет выполняться перед каждым тестом.
			 */
			@ Before
			public void setup(){
				c=new Calc();
			}
			@ After // После теста.
			@ Befor Class
			@ After Class
			
			/*
			 * КАК ЗАПУСТИТЬ ТЕСТЫ:
			 * 1) ANT, Maven
			 * 2) IDE (eclipce)
			 * 3.1) console (cmd)  ## JUnitCore
			 * 3.2) GUI
			 * 
			 * Для тестов создают отдельную папку New Source Folder,
			 * это удобно, при компиляции тестовые классы отбрасываются.
			 */
			
			/*
			 * КАК ТЕСТИРОВАТЬ?
			 * Создаем папочку (test)  и пакет с таким же именем (j4t) что и у тестируемомго класса (Calc)
			 * добавляем в пакет новый java-файл JUnit Test Case.
			 * В этот тест можно сразу (галочками) добавить тестируемый класс и @arter и @before
			 * 
			 * ЗАПУСК: Run As
			 */
		}
}
}
