package conditionalstatement;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rem,sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number:");
		n=scanner.nextInt();
		int temp=n;
		while(n>0) {
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Number is Palindrome.");
		else {
			System.out.println("Number is Not Palindrome.");
		}
		scanner.close();
	}

}
