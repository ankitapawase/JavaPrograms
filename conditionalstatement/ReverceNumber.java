package conditionalstatement;

import java.util.Scanner;

public class ReverceNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number :");
		int n=scanner.nextInt();
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		scanner.close();
	}

}
