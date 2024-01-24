package arrayexample;

import java.util.Scanner;

// Print all even Number in Array
public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i;
		System.out.println("Enter size of Array:");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter "+size+" element :");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Even Elements Are:");
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0) {
				System.out.print(a[i]+"  ");
			}
		}
	}

}
