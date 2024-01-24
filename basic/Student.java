package basic;

public class Student {

	int id;
	String name;
	static String clgName="D.Y.Patil";
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	public void display() {
		System.out.println("Student ID :"+id);
		System.out.println("Student name :"+name);
		System.out.println("Collage  Name :"+clgName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student student1=new Student(101,"Ravi");
	Student student2=new Student(102,"Riya");
	student1.display();
	student2.display();
	}

}
