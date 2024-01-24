package arrayexample.exercise;

import java.util.Scanner;

/*
 	11. Write a program to array elements print all Odd number
	Sample Output
	Array = {23, 45, 67, 34, 78}
	Odd Array Elements = 23 45 67
	
	Write a program to array elements print all Even number
	Sample Output
	Array = {23, 45, 89, 34, 12}
	Even Array Elements = 34 12
	13. Write a program to array elements to print sum of Odd Numbers
	Sample Output
	Array = {12, 34, 59, 45, 22}
	Sum of Odd Array Elements = 104

	14. Write a program to array elements to print sum of Even Numbers
	Sample Output
	Array = {56, 78, 45, 79, 34}
	Sum of Even Array Elements = 168


 */

public class ArrayExercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size=sc.nextInt();
		int a[]=new int[size];
		int sumEven=0,sumOdd=0;
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Odd Array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+" ");
				sumOdd=sumOdd+a[i];
			}
		}
		System.out.println();
		System.out.println("Sum of Odd Array Elements : "+sumOdd);
		
		System.out.print("Even Array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]%2==0)
			{
				System.out.print(+a[i]+" ");
				
				sumEven=sumEven+a[i];
			}
		}
		System.out.println();
		System.out.println("Sum of Even Array Elements : "+sumEven);
			
	
	}

}
