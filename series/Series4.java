package series;
//1/1 + 2/4 + 3/9 + 4/16 + 5/25 =?
import java.util.Scanner;

public class Series4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n,sum=0,temp;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr Number :");
		n=scanner.nextInt();
		for(double i=1;i<=n;i++)
		{
			System.out.print((int)i+"/"+(int)i * (int)i);
			if(i<n) {
				System.out.print(" + ");
			}
			sum=sum+i/(i*i);
		}
		System.out.print(" = "+sum);
		
	}

}
