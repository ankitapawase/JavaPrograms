package series;

import java.util.Scanner;

//		1/1!+2/2!+3/3!=?
public class Series9 {

	public static void main(String[] args) {
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+"/"+i+"!");
			if(i<n)
			{
				System.out.print("+");
			}
			int fact=1;
			for(int j=1;j<=i;j++)
			{
				fact=fact*j;
			}
//			System.out.println(fact);
			sum=sum+(double)i/(double)fact;
//			System.out.println(sum);
		}
		System.out.print(" = "+String.format("%.2f",sum));
	}

}
