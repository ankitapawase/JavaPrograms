package arrayexample;

// Addition of Array Elements
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,sum=0;
		System.out.println("Enter size of Array:");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter "+size+" element :");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Addition of array elements are: "+sum);
	}

}
