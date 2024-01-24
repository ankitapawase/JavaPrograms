package assessment;

import java.util.Scanner;

/*
 * Q.1
Second Smallest:
Your task here is to implement a Java code based on the following specifications.
 Note that your code should match the specifications in a precise manner. 
 Consider default visibility of classes, data fields and methods unless mentioned 
 otherwise.

Specifications:
class definitions:
class Source:
visibility: public
method definitons:
getSecondSmallest(int []arr): accept an array of integer elements and return
the second smallest element in the arrayreturn type: int
visibility: public

Task
Create a Source class and implement below given method:
� getSecondSmallest(int []arr): accept an array of integer elements and return the second
smallest element in the array

Sample Input:
23, 45, 32, 22, 20, 96
Sample Output:
22
 * 
 */


public class Source {
	public int getSecondSmallest(int a[])
	{
		int secmin=0,i,j,temp;
		for(i=0;i<a.length-1;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
//		for(i=0;i<a.length-1;i++)
//		{
//			secmin=a[1];
//		}
		secmin=a[1];
		return secmin;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		size=sc.nextInt();
		int a[]=new int[size];
//		System.out.println("Enter Array Elements :");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Source d=new Source();
		int result=d.getSecondSmallest(a);
		System.out.println(result);
	}

	

}
