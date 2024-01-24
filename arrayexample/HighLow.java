package arrayexample;

import java.util.Scanner;

//Accept the array elements from user and Display Highest and Lowest element
public class HighLow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,max,min;
		System.out.println("Enter size of Array:");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter "+size+" element :");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		max=a[0];
		min=a[0];
		for(i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}else if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Highest Element of array is "+max+" Lowest element of array is "+min);
	}

}
