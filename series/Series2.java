package series;
//1 + 3 + 5.....n = ?
import java.util.Scanner;
public class Series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number:");
		n=scanner.nextInt();
		for(int i=1;i<=n;i++){
			if(i%2!=0)
			{
		System.out.print(i);
		if(i<n)
		{
			System.out.print(" + ");
		}
		sum=sum+i;
			}
		}
		System.out.print(" = "+sum);
	}

}
