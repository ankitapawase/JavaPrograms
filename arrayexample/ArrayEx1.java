package arrayexample;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr size");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enetr "+size+"elements :");
		for( i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array :");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
	}

}
