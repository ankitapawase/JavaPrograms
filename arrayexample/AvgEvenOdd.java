package arrayexample;

import java.util.Scanner;

// Accept array element from user and calculate avg of even and odd numbers
public class AvgEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,esum=0,osum=0;
		System.out.println("Enter size of Array:");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter "+size+" element :");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0) {
				esum=esum+a[i];
			}
			else
				osum=osum+a[i];
		}
		System.out.println("Sum of even Number is "+esum+" Sum of odd Number is "+osum);
	}

}
