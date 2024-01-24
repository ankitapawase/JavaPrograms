package conditionalstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Accept age from user and check if she is eligible for licence or not.
public class Eligible {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int age;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Age :");
		age=Integer.parseInt(reader.readLine());
		if(age>18) {
			System.out.println("Eligible ");
		}
		else {
			System.out.println("Not Eligible");
		}
		
	}

}
