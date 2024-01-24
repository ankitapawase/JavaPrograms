package classandobject;

import java.util.Scanner;

public class DefaultMethod {

		int a,b;
		public void accept()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 2 Numbers :");
			a=sc.nextInt();
			b=sc.nextInt();
		}
		public void add()
		{
			System.out.println("Addition is "+(a+b));
		}
		public int sub()
		{
			return a-b;
		}
		public double mul(double p,double q)
		{
		
			return p*q;
		}
		public double div(double x,double y)
		{
			return x/y;
		}
		public static void mod(double a,double b)
		{
			System.out.println("Reminder : "+(a%b));
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethod obj=new DefaultMethod();
		obj.accept();
		obj.add();
		int result=obj.sub();
		System.out.println("Substraction : "+result);
		double p,q;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number:");
		p=sc.nextDouble();
		q=sc.nextDouble();
		double Multiplication=obj.mul( p, q);
		double division=obj.div(p, q);
		System.out.println("Multiplication : "+Multiplication);
		System.out.println("Division : "+division);
		mod(12.5,12);
	}

}
