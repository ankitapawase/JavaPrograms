package inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Person person1=new Person();
//	person1.display();
//	Person person2=new Person(102,"Meera",new MyDate(24,4,2000));
//	person2.display();
		
		Employee e1=new Employee();
		e1.calculate();
		e1.display();
		Employee e2=new Employee(102,"Shri",new MyDate(24,4,2000),20,2300);
		e2.calculate();
		e2.display();
		System.out.println();
		Student1 s1=new Student1();
		s1.calculate();
		s1.display();
		Student1 s2=new Student1(102,"Shri",new MyDate(24,4,2000),60,70,88);
		s2.calculate();
		s2.display();
		
	/*	SalesPerson e1=new SalesPerson();
		e1.calculate();
		e1.display();
		
		System.out.println();
		SalesPerson e2=new SalesPerson(102, "Shri" , new MyDate(24,4,2000), 21, 1670, 92);
		e2.calculate();
		e2.display();
		
		*/
		
		
		
	}

}


/*  
  	Output
Id : 101
Name : Riya
Date : 12-8-1990
Salary : 44000
Id : 102
Name : Shri
Date : 24-4-2000
Salary : 46000
 
 
 */
