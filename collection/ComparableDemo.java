package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> 
{
	int rollNo,age;
	String name;
	public Student(int rollNo, int age, String name) {
		super();
		this.rollNo = rollNo;
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", age=" + age + ", name=" + name + "]";
	}

		// for Ascending Order
	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}
	// for descending Order
//	@Override
//	public int compareTo(Student st) {
//		// TODO Auto-generated method stub
//		if(age==st.age)
//			return 0;
//		else if(age<st.age)
//			return 1;
//		else
//			return -1;
//	}
	
	
}

public class ComparableDemo {

	public static void main(String[] args) {
		List <Student> list = new ArrayList<Student>();
		list.add(new Student(101, 23, "Ankita"));
		list.add(new Student(102, 21, "Ashu"));
		list.add(new Student(103, 20, "Shweta"));
		list.add(new Student(104, 26, "Rutuja"));
		list.add(new Student(105, 20, "Priya"));
		
		Collections.sort(list);
		System.out.println("After Sorting : ");
		for (Student student : list) {
			System.out.println(student);
		}
	}

}
