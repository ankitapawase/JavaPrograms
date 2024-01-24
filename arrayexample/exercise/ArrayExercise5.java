package arrayexample.exercise;

import java.util.Scanner;

/*
 	5. Write a program to store elements in an array and print it
	Sample Output
	Array Size = 5Element of a[0] = 5Element of a[1] = 11Element of a[2] = 22
	Element of a[3] = 33Element of a[4] = 44
	Display Array Elements511223344
 */
public class ArrayExercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size :");
		size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Element of a["+(i)+"] :");
			a[i]=sc.nextInt();
		}
		System.out.print(size);
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]);
		}
	}

}
