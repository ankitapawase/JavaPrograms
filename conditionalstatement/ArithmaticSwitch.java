package conditionalstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmaticSwitch {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		char choice;
		int n1,n2;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Two Number:");
		n1=Integer.parseInt(reader.readLine());
		n2=Integer.parseInt(reader.readLine());
		System.out.println("Enter your choice...press \n +for Addition \n - for Sbustraction.\n * For Multiplication \n / for Division.");
		choice=(char)reader.read();
		switch(choice) {
		case '+': System.out.println("Addition is :"+(n1+n2));
		break;
		case '-': System.out.println("Substraction is :"+(n1-n2));
		break;
		case '*': System.out.println("Multiplication is :"+(n1*n2));
		break;
		case '/': System.out.println("Division is :"+ (n1/n2));
		break;
		default : System.out.println("Invalid Choice");
		}

	}

}
