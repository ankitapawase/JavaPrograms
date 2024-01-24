package series;
// 1/1+1/2+1/3+1/4+1/5......=?
import java.util.Scanner;

public class Series5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr Number :");
		n=scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i*i+"  ");
			}
		}
	}

}
