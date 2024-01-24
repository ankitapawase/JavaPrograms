package series;
// 1 3 5 7
import java.util.Scanner;

public class Series12 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enetr Number : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}
		

	}

}
