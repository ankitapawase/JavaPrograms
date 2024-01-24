package java8features;

import java.util.Scanner;

/*
 * Create a functional interface with a method 
 * simpleInterest(float p,float n,float r) and implements lambda expression
 */
@FunctionalInterface
interface Interest
{
	float simpleInterest(float p,float n,float r);
}
public class LambdaSimpleInterest {

	public static void main(String[] args) {
		float pamount,rate,time;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr Principal ammount:");
		pamount=scanner.nextFloat();
		System.out.println("Enetr Rate:");
		rate=scanner.nextFloat();
		System.out.println("Enetr Time:");
		time=scanner.nextFloat();
		Interest i=(p, n, r) -> (p*n*r)/100;
		System.out.println("Simple Interest : "+i.simpleInterest(pamount, rate, time) );
	}

}
