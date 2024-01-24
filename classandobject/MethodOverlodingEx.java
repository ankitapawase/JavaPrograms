package classandobject;

public class MethodOverlodingEx {

		public void add(int a,int b,int c)
		{
			System.out.println("Addition of 3 Integer is : "+(a+b+c));
		}
		public void add(double a,double b)
		{
			System.out.println("Addition of 2 decimal : "+(a+b));
		}
		public double add(int a,double b)
		{
			return (a+b);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverlodingEx obj=new MethodOverlodingEx();
		obj.add(12.2, 12.4);
		obj.add(2, 4, 6);
		System.out.println("Addtion is: "+obj.add(12, 12.3));
	}

}
