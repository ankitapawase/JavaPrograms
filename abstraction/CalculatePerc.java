package abstraction;

/* WE have to calculate percentage of marks obtain in 3 subject by student A and
 *  4 subject by student B.Create an abstract  class 'Marks ' with an abstract method
 *  'getPercentage'.It is inherited by other two classes 'A' and 'B' each having a method
 *  with same name which returns percentage of the student. the constructor of student A
 *  takes the marks in three subjects as its parameters and the marks in four subjects as its
 *  parameters for student B. create an object for each of the two classes and print the 
 *  percentage of marks of both of student.

*/

 abstract class Marks
{
	public abstract void getPercentage();
}
 class StudentA extends Marks{
	 double phy,chem,maths,pers;

	public StudentA(double phy, double chem, double maths) {
		this.phy = phy;
		this.chem = chem;
		this.maths = maths;
	}

	@Override
	public void getPercentage() {
		// TODO Auto-generated method stub
		pers=(phy+chem+maths)/3;
		System.out.println("Percentage of Student A is : "+pers);
	}
	 
 }
 class StudentB extends Marks{
	 double phy,chem,maths,bio,pers;

	public StudentB(double phy, double chem, double maths ,double bio) {
		this.phy = phy;
		this.chem = chem;
		this.maths = maths;
		this.bio = bio;
	}

	@Override
	public void getPercentage() {
		// TODO Auto-generated method stub
		pers=(phy+chem+maths+bio)/4;
		System.out.println("Percentage of Student B is : "+pers);
	}
	 
 }
public class CalculatePerc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentA obj1=new StudentA(78, 60, 90);
		obj1.getPercentage();
		StudentB obj2=new StudentB(80, 50, 40,60);
		obj2.getPercentage();
	}

}
