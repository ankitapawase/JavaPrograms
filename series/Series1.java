package series;

import java.util.Scanner;

// 1/1+2/2+3/3+......+1/n=?
public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n,sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number:");
		n=scanner.nextDouble();
		for(double i=1;i<=n;i++) {
		System.out.print(1+"/"+(int)i);
		if(i<n)
		{
			System.out.print("+");
		}
		sum=sum+(1/i);
		}
		System.out.print(" = "+sum);
		scanner.close();
	}

}
