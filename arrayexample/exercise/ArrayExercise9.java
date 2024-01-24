package arrayexample.exercise;

import java.util.Scanner;

/*
  15. Write a program to array elements to print sum of Cubic Values
	Sample Output
	Array = {1, 2, 3, 4, 5}
	Sum of Cubic Array Elements = 225
 */

public class ArrayExercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr size : ");
		size=sc.nextInt();
		int a[]=new int [size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i]*a[i]*a[i];
		}
		System.out.println("Sum of Cubic Array Elements : "+sum);
	}

}
