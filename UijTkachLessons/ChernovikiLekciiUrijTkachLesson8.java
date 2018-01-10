���� 8 ���������� � Eclipse

package jet;

import domain.User;

/**
 * 
 * ����� �������� ��� ������: Refactor/rename
 */
public class HelloW {

	/**
	 * ���� �������� ���� �������, �������� Source/Format
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Hello Wordld");
		/**
		 *  ���� ����� User � ������ ������, �� �������� �� �����.
		 *  ������� ��� ���� ������������� import domain.User;
		*/ 
		User user = new User("Yura");
		System.out.println(user.getFirstName());
		/** ������: sysout � ��������
		 *ctr+space!!!
		 *
		 * ����� ������������� ����� ���� ������ �� ���� ����� Refactor/rename
		 */
	}
}

/**
 * � ������ jet ��������� �������.
 * ������������ �������� ����������!
 */
package domain;

/**
 * @author Pavel
 *
 */
public class User {
	private String name;
/**
 * ����������� ����� ������������ �������������:
 * Source/Generate Constructor Using Fields
 */
	public User(String name) {
		super();
		this.name = name;
	}
	
	public User(){
		
	}

	/**������� � ������� ���� ����� ������������ ����� Source/Generate Getter
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
