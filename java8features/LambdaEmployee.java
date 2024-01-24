package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * create a class Employee with id,name,age properties,create list of
 *  employee and Sort it on the basis of name(use lambda and forEach method)
 */

class Employee
{
	int id,age;
	String name;
	public Employee(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	@Override

	public String toString () {
		return "Employee [id= " + id +", age = "+ age+", name =" +name + "]"; 
	}
}

public class LambdaEmployee {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101,"Ankita",20));
		list.add(new Employee(102,"Ashu",22));
		list.add(new Employee(103,"Rutuja",23));
		list.add(new Employee(104,"Komal",25));
		
		Collections.sort(list, (p1,p2) ->{
			return p1.name.compareTo(p2.name);
		});
		
		list.forEach(p ->System.out.println(p));
		} 

}
