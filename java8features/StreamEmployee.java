package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
  3.create list of Employee(id,name,age,salary)
 		i) dispaly Employee whose salary >50000. And 
  	ii) Add 5000 bonus whose salary <30000 display list
 */

class Employee1
{
	int id,age,salary;
	String name;
	
	public Employee1(int id,String name,int age,int salary)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
		
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	} 
	public void setName()
	{
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", age=" + age + ", salary=" + salary + ", name=" + name + "]";
	}
//	List<Employee1> list =new ArrayList<Employee1>();
	
}

public class StreamEmployee {

	public static void main(String[] args) {
		List<Employee1> list=new ArrayList<Employee1>();
		list.add(new Employee1(101,"Ankita",23,17000));
		list.add(new Employee1(102,"Riya",21,40000));
		list.add(new Employee1(103,"Raj",23,30000));
		list.add(new Employee1(104,"Kajal",25,55000));
		list.add(new Employee1(105,"Meena",24,250000));
		System.out.println("List Of Employee : \n");
		for (Employee1 employee1 : list) {
			System.out.println(employee1);
		}
		//i) display Employee whose salary >50000. And 
	  	//ii) Add 5000 bonus whose salary <30000 display list
		System.out.println("\ndisplay List Of Employee whose salary >50000\n");
		List<Employee1> salaryNames=list.stream().filter(s ->s.getSalary() >50000).collect(Collectors.toList());
		salaryNames.forEach(System.out::println);
		System.out.println("\nAfter Adding 5000 Bonus Whose salary <30000 \n");
		List<Employee1> bonus=list.stream().map(e ->
		{
			 if (e.getSalary() < 30000) {
                 e.setSalary(e.getSalary() + 5000);
             }
			 return e;
		}).collect(Collectors.toList());
		bonus.forEach(System.out::println);
	}

}
