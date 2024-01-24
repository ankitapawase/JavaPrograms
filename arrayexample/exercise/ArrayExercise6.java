package arrayexample.exercise;

import java.util.Scanner;

/*
 	8. Write a program in to read n number of values in an array and display it in 
 	reverse order
	Sample Output
	Enter the Array Size = 5Element of a[0] = 1Element of a[1] = 2Element of a[2] = 3
	Element of a[3] = 4Element of a[4] = 5
	Display Reverse Order54321
 */

public class ArrayExercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size :");
		size=sc.nextInt();
		int a[]=new int[size];
//		System.out.println("Enetr Array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Element of a["+i+"] ");
			a[i]=sc.nextInt();
		}
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
	}

}
