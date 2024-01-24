package arrayexample;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,temp,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Size:");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter "+size+"elements :");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length-1;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array Elements after Ascending:");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
	}

}
