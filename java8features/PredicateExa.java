package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student{
	int id,age;
	String name;
	public Student(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString()
	{
		return "Student [Id : "+id+" Name : "+name+ " Age : "+age+" ] ";
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
	public void setName(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public static List<Student> studentList()
	{
		ArrayList<Student> list =new ArrayList<Student>();
		list.add(new Student(101,"Ankita",24));
		list.add(new Student(102,"Pooja",23));
		list.add(new Student(103,"Arun",22));
		list.add(new Student(104,"Vikey",24));
		list.add(new Student(105,"Ashu",26));
		return list;
	}
}
public class PredicateExa {

	public static void main(String[] args) {
		List<Student> list=Student.studentList();
		
		Predicate<Student> p1=s ->s.getName().startsWith("A");
		Predicate<Student> p2=s ->s.getAge()<30 && s.getName().startsWith("V");
		boolean b1 =list.stream().anyMatch(p2);
		System.out.println("p2 with anyMatch : "+b1);
		boolean b2=list.stream().noneMatch(p2);
		System.out.println("p2 with nonMatch : "+b2);
		boolean b3=list.stream().allMatch(p2);
		System.out.println("p2 with allMatch : "+b3);
		boolean b4 =list.stream().anyMatch(p1);
		System.out.println("p1 with anyMatch : "+b4);
		boolean b5=list.stream().noneMatch(p1);
		System.out.println("p1 with nonMatch : "+b5);
		boolean b6=list.stream().allMatch(p1);
		System.out.println("p1 with allMatch : "+b6);
	}

}
