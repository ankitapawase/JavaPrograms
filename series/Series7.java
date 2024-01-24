package series;

import java.util.Scanner;

// 1-2+3-4+5-+6....n=?
public class Series7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number :");
		n=scanner.nextInt();
		for(int i=1;i<=n;i=i+2)
		{
			System.out.print(i+" - "+(i+1));
			if(i<n)
			{
				System.out.print(" + ");
			}

			 sum=sum+(i-(i+1));
		}
		System.out.print(" = "+sum);
	}

}
