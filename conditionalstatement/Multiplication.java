package conditionalstatement;

import java.util.Scanner;

//  5.print multiplication table of a given number
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,result; 
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the Number:");
		n=scanner.nextInt();
		
		for(int i=1;i<=10;i++) {
			result=i*n;
			System.out.print(result+" ");
		}
		scanner.close();
	}

}
