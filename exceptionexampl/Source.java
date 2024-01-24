package exceptionexampl;

import java.util.Scanner;

public class Source {
	public static void checkAge(int age) throws MyException
	{
		if(age>=15)
		{
			System.out.println("Valid");
		}
		else
			throw new MyException("Not valid");
	}
	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
			checkAge(a);
		sc.close();
	}

}
