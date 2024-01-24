package series;

import java.util.Scanner;
//	1/1 + 2/2 + 3/3 + 4/4 + 5/5 = ?
public class Series6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,temp;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr Number :");
		n=scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+"/"+i);
			if(i<n)
			{
				System.out.print(" + ");
			}
			sum=sum+i/i;
		}
		System.out.print(" = "+sum);
	}

}
