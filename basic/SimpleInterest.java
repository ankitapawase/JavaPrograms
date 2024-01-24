package basic;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Formula of simple interest is: (P*r*t)/100
		//WHere p=Principal ammount,r=Rate,t=Time
		
		float p,r,t,simpleInterest;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr Principal ammount:");
		p=scanner.nextFloat();
		System.out.println("Enetr Rate:");
		r=scanner.nextFloat();
		System.out.println("Enetr Time:");
		t=scanner.nextFloat();
		simpleInterest=(p*r*t)/100;
		System.out.println("simple Interest is:"+simpleInterest);
	}

}
