package series;

import java.util.Scanner;

public class Series11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Number : ");
		int n=sc.nextInt();
		double sum=0;
		for(double i=1;i<=n;i++)
		{
			if(i%2==0)
			{
			System.out.print("1/"+(int)i);
			if(i<n)
			{
				System.out.print("+");
			}
			sum=sum+(1/i);
			}
//			System.out.println(sum);
		}
		System.out.println("="+String.format("%.2f", sum));

	}

}
