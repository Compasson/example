Урок 8 Знакомство с Eclipse

package jet;

import domain.User;

/**
 * 
 * Чтобы изменить имя класса: Refactor/rename
 */
public class HelloW {

	/**
	 * Если разметка кода корявая, нажимаем Source/Format
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Hello Wordld");
		/**
		 *  Пока класс User в другом пакете, он работать не будет.
		 *  Поэтому его надо импортировать import domain.User;
		*/ 
		User user = new User("Yura");
		System.out.println(user.getFirstName());
		/** УДОБНО: sysout и нажимаем
		 *ctr+space!!!
		 *
		 * Чтобы переименовать метод надо нажать на него потом Refactor/rename
		 */
	}
}

/**
 * В пакете jet несколько классов.
 * Пользоваться пакетами необходимо!
 */
package domain;

/**
 * @author Pavel
 *
 */
public class User {
	private String name;
/**
 * Конструктор можно генерировать автоматически:
 * Source/Generate Constructor Using Fields
 */
	public User(String name) {
		super();
		this.name = name;
	}
	
	public User(){
		
	}

	/**Геттеры и сеттеры тоже можно генерировать через Source/Generate Getter
	 * and Setter...
	 * @return the name
	 */
	public String getFirstName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
