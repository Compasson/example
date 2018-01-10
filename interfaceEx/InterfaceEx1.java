/*
 *  ���������� ��������� ������� ��� ������� ��� ������ ������,
 *             �� ������ ��� ������.
 *             
 *             ������ ������. Comparable (���������� ����� ��������):
 *                       
 *                       public interface Comparable<T>
 *                       {
 *                          int compareTo(T other)
 *                       }
 *                       �������� ���� ����� ��������� ��������� Comparable<Employee>, �� ������ ��������� ��������� �����:
 *                                
 *                                int compareTo(Employee);
 *             
 *             ��������� ������������ ����� ��������� ����������,
 *                       ������������� � ������, ������� ������ ��������������� ����������.
 *                       
 *                       ����� ����� ����������� ���������� ���������, ������� ����� ��� ��� ������ ���������� � Interface.
 *                       
 *                       ��� ������ ������. ������������� ��������!!!
 *             
 *             ���������� � ������ ��� ���������� ����������:
 *                       
 *                       1) ��������, ��� ����� ��������� ���������:
 *                       
 *                                 class Employee implements Comparable
 *                                  
 *                       2) ���������� � ������ ��� ������, ��������� � ����������.
 *                       
 *                       
 *             �������� ���� ��������� ������ ����������� ������� � ������� ������� ���������� (Java.util.*  Arrays.sort) ����������� ��������� Comparable.
 *             
 *             
 *             ���� ��� ����� ����������� ������ � ���������� ��� , �� ���� ����� ��� ������� ����������� ����� ������������ Cloneable � Comparable:
 *             
 *                      class Employee implements Cloneable, Comparable 
 *                      
 *             
 */ 

package interfaceEx;

/*
 *  � ���� ��������� ��������������� ���������� ���������� Comparable
 */

import java.util.*;

public class InterfaceEx1
{

	public static void main(String[] args) {
		
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Harry Hacker", 35000);
		staff[1] = new Employee("Harry Hacker", 75000);
		staff[3] = new Employee("Harry Hacker", 38000);
        
		Arrays.sort(staff);
		
		// ������� ������ ��� ���� �������� ���� Employee
		for (Employee e :staff)
			System.out.println("name=" + e.getName() + ",salary" + e.getSalary());
	}

}