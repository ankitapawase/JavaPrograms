package conditionalstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Accept the number from user and check whether it is even or odd.

public class EvenOdd {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int n;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter The Number:");
		n=Integer.parseInt(reader.readLine());
		if(n%2 ==0)
		{
			System.out.println(n+" is Even Number .");
		}
		else {
			System.out.println(n+ " is Odd Number.");
		}
	}

}
