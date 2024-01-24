package classandobject;

public class Student {
	
	int rollNumber;
	String name;
	double phy,chem,maths,total,percent;
	
	public Student() {
		rollNumber=101;
		name="Raj";
		phy=89;
		chem=56;
		maths=78;
	}
	
	public Student(int rollNumber, String name, double phy, double chem, double maths) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.phy = phy;
		this.chem = chem;
		this.maths = maths;
	}
	public void calculate()
	{
		total=phy+chem+maths;
		percent=total/3;
		
	}
	public void display()
	{
		System.out.println("Roll Number : "+rollNumber);
		System.out.println("Name : "+name);
		System.out.println("Total : "+total);
		System.out.println("Percentage : "+String.format("%.2f", percent));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.calculate();
		s1.display();
		System.out.println();
		Student s2=new Student(102,"Anu",89,34,66);
		s2.calculate();
		s2.display();
	}

}
