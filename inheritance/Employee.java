package inheritance;

public class Employee extends Person {
	float workingdays,perDay,salary;
	public Employee() {
		// TODO Auto-generated constructor stub
		super();
		workingdays=20;
		perDay=2200;
	}
	public Employee(int id,String name,MyDate dob,float workingdays, float perDay) {
		super(id,name,dob);
		this.workingdays = workingdays;
		this.perDay = perDay;
	}
	public void calculate()
	{
		salary=workingdays*perDay;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Salary : "+salary);
	}
	
}
