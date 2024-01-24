package series;

import java.util.Scanner;

// 1*2+2*3+3*4+4*5.....=?
public class Series10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enetr Size : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+"*"+(i+1));
			if(i<n)
			{
				System.out.print(" + ");
			}
			
			sum=sum+(i*(i+1));
		}
		System.out.print("="+sum);
	}

}
