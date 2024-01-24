package classandobject;

import java.util.Scanner;

// Create a class Area And 4 methods circle,square,rectangle,Triangle and calculate area.
public class Area {
	Scanner sc=new Scanner(System.in);
	public void circle()
	{
		double r,area;
		
		System.out.println("Please Enter Radius: ");
		r=sc.nextDouble();
		area=3.14f*r*r;
		System.out.println("Area of Circle :"+String.format("%.2f",area));
	}
	public double square()
	{
		double side;
		
		System.out.println("Please Enter side: ");
		side=sc.nextDouble();
		return side*side;
	}
	public double triangle(double height,double width)
	{
		return (height*width)/2;
	}
	public void rectangle(double lenght,double width)
	{
		System.out.println("Area of Rectangle is "+String.format("%.2f",(lenght*width)));
	}
	public static void add(int a,int b)
	{
		System.out.println("Addition is : "+(a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area obj=new Area();
		double width,height,lenght,width1;
		obj.circle();
		
		double area1=obj.square();
		System.out.println("Area of Square is "+area1);
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter height: ");
		height=sc.nextDouble();
		System.out.println("Please Enter width: ");
		width=sc.nextDouble();
		double area=obj.triangle(height,width);
		System.out.println("Area of Triangle is "+String.format("%.2f",area));
		System.out.println("Please Enter lenght: ");
		lenght=sc.nextDouble();
		System.out.println("Please Enter width: ");
		width1=sc.nextDouble();
		obj.rectangle(lenght, width1);
		add(12,24);
	}

}
