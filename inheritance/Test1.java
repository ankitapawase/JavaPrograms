package inheritance;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student obj=new Student();
//		obj.display();
//		Student obj1=new Student(102,"Raj",new Address("Janata Raja","Navin Nagar Road","Sangamner","Maharashtra","India",424605));
//		obj1.display();
		/*
		Student s1=new Student();
		s1.calculate();
		s1.display();
		System.out.println();
		Student s2=new Student(102,"Raj",new Address("Janata Raja","Navin Nagar Road","Sangamner","Maharashtra","India",424605),78,98,50);
		s2.calculate();
		s2.display();
		*/
		Grade s1=new Grade();
		s1.calculate();
		s1.display();
		System.out.println();
		Grade s2=new Grade(102,"Raj",new Address("Janata Raja","Navin Nagar Road","Sangamner","Maharashtra","India",424605),58,58,50);
		s2.calculate();
		s2.display();
		
	
		
	}

}

/*
	Output
	Id : 101
Name : Riya
Address : Arkhadi Vasti ,Hiwergoan Pawasa ,Sangamner ,Maharashtra ,India ,422605
Total : 246.0
Percentage : 82.0
Id : 102
Name : Raj
Address : Janata Raja ,Navin Nagar Road ,Sangamner ,Maharashtra ,India ,424605
Total : 226.0
Percentage : 75.33333333333333


*/