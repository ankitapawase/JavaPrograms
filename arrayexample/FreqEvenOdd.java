package arrayexample;

import java.util.Scanner;

// Accept array elements form user and calculate avg of even and odd no.
public class FreqEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,ecount=0,ocount=0;
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
				ecount++;
			}
			else
				ocount++;
		}
		System.out.println("Frequency of even Number is "+ecount+" Frequency of odd Number is "+ocount);
	}

}
