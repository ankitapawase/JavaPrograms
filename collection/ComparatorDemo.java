package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee
{
	int id,salary;
	String name;
	public Employee(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
	
}

class SalaryComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.salary==e2.salary)
			return 0;
		else if(e1.salary<e2.salary)
			return 1;
		else
			return -1;
	}
	
}

class NameComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e2.name.compareTo(e1.name);
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		List <Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101, 23000, "Ankita"));
		list.add(new Employee(102, 53000, "Pooja"));
		list.add(new Employee(103, 29000, "Arti"));
		list.add(new Employee(104, 13000, "Raj"));
		list.add(new Employee(105, 23000, "Kavi"));
		
		Collections.sort(list,new SalaryComparator());
		System.out.println("Sorting in Salary : ");
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		Collections.sort(list,new NameComparator());
		System.out.println("Sorting in Names : ");
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
	}

}
