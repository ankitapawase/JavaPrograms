package arrayexample;

import java.util.Scanner;

//Freq. of +ve,-ve and zero

public class ArrayFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pcount=0,ncount=0,zcount=0,n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Size:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+"elements :");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]>0)
				pcount++;
			else if(a[i]<0)
				ncount++;
			else
				zcount++;
		}
		System.out.println("Frequecy of Positive Number is "+pcount+" Frequecy of Negative Number is "+ncount+" Frequecy of Zero Number is "+zcount);
	}

}
