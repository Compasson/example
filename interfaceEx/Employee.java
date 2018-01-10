package interfaceEx;

//Класс сотрудники имплементит интерфейс Comparable
public class Employee implements Comparable<Employee>
{
	private String name;
	private double salary;
	
	public Employee(String n, double s)
	{
		name = n;
		salary = s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary*byPercent/100;
		salary += raise;
	}
	
	/*
	 * Сравнивает зарплату сотрудников
	 * @param other Другой обьект типа  Employee
	 * @return Возвращает отрицатеьное числовое значение, если зарплата
	 *    данного сотрудника ниже чем у другого; нулевое значение, если
	 *    зарплата одинаковая; а иначе - положительное числовое значение
	 */
	public int compareTo(Employee other)
	{
		return Double.compare(salary, other.salary);
	}
}
