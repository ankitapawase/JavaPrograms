package inheritance;

public class Student1 extends Person {

	int phy,chem,maths;
	double percent,total;
	public Student1()
	{
		super();
		phy=90;
		chem=90;
		maths=89;
		}
	public Student1(int rollno,String name,MyDate dob,int phy,int chem,int maths)
	{
		super(rollno,name,dob);
		this.phy = phy;
		this.chem = chem;
		this.maths = maths;
		this.dob = dob;
	}
	public void calculate()
	{    
		total=phy+chem+maths;
		percent=total/300*100;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Total : "+total);
		System.out.println("Percentage : "+String.format("%.2f", percent));
	}
}

