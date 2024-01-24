package inheritance;

public class Person1 {
	int rollno;
	String name;
	Address addr;
	public Person1()
	{
	rollno=101;
	name="Riya";
	addr=new Address();
	}
	public Person1(int rollno, String name,Address addr) {
		this.rollno = rollno;
		this.name = name;
		this.addr=addr;
	}
	public void display()
	{
		System.out.println("Rollno : "+rollno);
		System.out.println("Name : "+name);
		addr.display();
	}
}
