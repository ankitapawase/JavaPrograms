package conditionalstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Accept a Number from user and check whether it is Positive Negative or zero

public class PositivenegativeZero {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int n;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter Number :");
		n=Integer.parseInt(reader.readLine());
		if(n>0) {
			System.out.println(n+" is Positive .");
		}
		else if(n<0) {
			System.out.println(n+" is Negative");
		}
		else {
			System.out.println(n+" is Zero");
		}
	}

}
