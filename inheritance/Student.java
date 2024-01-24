package inheritance;

public class Student extends Person1 {

	int phy,chem,maths;
	double percent,total;
	public Student()
	{
		super();
		phy=90;
		chem=90;
		maths=89;
		}
	public Student(int rollno,String name,Address addr,int phy,int chem,int maths)
	{
		super(rollno,name,addr);
		this.phy = phy;
		this.chem = chem;
		this.maths = maths;
		this.addr = addr;
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
