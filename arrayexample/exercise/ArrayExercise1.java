package arrayexample.exercise;

import java.util.Scanner;

/*
 	1. Write a program to Sort Numeric Array In Ascending Order
	Sample Output
	Array = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2}
	Ascending Order = {2, 3, 3, 5, 20, 23, 30, 67, 70, 79}
	
 */

public class ArrayExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size=sc.nextInt();
		int a[]=new int[size];
		int temp;
		System.out.println("Enetr Array Elements :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				}
			}
			
			
	}
		System.out.println("Ascending Order :");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
		sc.close();
  }
}
