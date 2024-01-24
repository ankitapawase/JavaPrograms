package classandobject;

import java.util.Scanner;

//Write a program to input a no from user and using a function called prime(), check and print whether the no. is prime number or not?
public class PrimeNumber {
          public void prime() {
        	Scanner sc=new Scanner(System.in);
        	int n,flag=1;
        	System.out.println("Enetr Number:");
        	n=sc.nextInt();
        	if(n==0 && n==1)
        	{
        		flag=0;
        	}
        	for(int i=2;i<n;i++)
        	{
        		if(n%i==0)
        		{
        			flag=0;
        		}
        	}
        	if(flag==1)
        	{
        		System.out.println(n+" Number is Prime");
        	}
        	else
        		System.out.println(n+" Number is Not Prime");
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber obj=new PrimeNumber();
		obj.prime();
	}

}
