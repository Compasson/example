

/*      
 *         
 *         Метод с переменным колличеством аргументов
 *    
 *         Записывается в виде:
 *                             int ... v   - переменное колличество аргументов типа int
 *                             Эта переменная является обьектом типа МАССИВ.
 *                             
 *         int doIt(int a, int b, double c, String ... vals){}
 *               Важно! 
 *                     - переменная с переменным кол аргументов должна находиться последним параметром в методе.
 *                     - в одном методе может быть только одна переменная с перем.кол.арг.
 *         
 *         Перегрузка метода с переменным колличеством аргументов - КАК ОБЫЧНО.
 *              
 *              Но есть нюанс. Такогй код приведет к ошибке если vaTest(1);
 *                            void vaTest(int ... v){}
 *                            void vaTest(int n, int ... v){}
 *                          
 */

class MethodVarArgs {
	// msg - обычный параметр
	// v - список аргументов переменной длины
	static void vaTest(String msg, int ... v){
		System.out.print(msg + v.length + " Содержимое: ");
		
		for(int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		
		vaTest("Один параметр MethodVarArgs: ", 10);
		vaTest("Три параметра MethodVarArgs: ", 1, 2, 3);
		vaTest("Без параметров MethodVarArgs: ");



	}

}
