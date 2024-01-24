package java8features;

import java.util.Scanner;

/*
 * Create a functional Interface with a method cirlce(float r) and implements
 * the lambda expression
 */
@FunctionalInterface

interface CircleArea{
	float area(float r);
}
public class LambdaCircle {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Radius : ");
		float radius=sc.nextFloat();
		CircleArea c1 = r ->
		{
			return 3.14f*r*r;
		};
		System.out.println("Area Of Circle : "+c1.area(radius));
	}

}
