package conditionalstatement;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0,sum=0,temp;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number :");
		int n=scanner.nextInt();
		temp=n;
		while(n!=0)
		{
			rev=n%10;
			sum=(sum*10)+rev;
			n=n/10;
		}
		if(temp==sum)
		System.out.println("Palindrome Number .");
		else
			System.out.println("Not Palindrome Number .");
		scanner.close();
	}

}
