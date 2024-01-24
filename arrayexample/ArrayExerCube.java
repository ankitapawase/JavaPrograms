package arrayexample;

import java.util.Scanner;

/*
 	 Write a program to array elements to print cubic values
	Sample Output
	Array = {1, 2, 3, 4, 5}
	Cubic Array Elements =1 8 27 64 125
 */

public class ArrayExerCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size=sc.nextInt();
		int a[]=new int[size];
		int cube[]=new int[size];
		System.out.println("Enter Array Elements :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			cube[i]=a[i]*a[i]*a[i];
		}
		System.out.print("Cubic Array Elements = ");
		for(int i=0;i<cube.length;i++)
		{
			System.out.print(cube[i]+" ");
		}
	}

}
