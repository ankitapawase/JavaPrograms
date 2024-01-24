package conditionalstatement;

import java.util.Scanner;

//Accept salary of a person and print tax amount. Tax is 10% if income<25000, otherwise 15%

   
public class SalaryTax {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float salary,tax;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Salary :");
		salary=scanner.nextFloat();
		if(salary<25000)
		{
			tax=salary*0.1f;
			
		}
		else {
			tax=salary*0.15f;
		}
		System.out.println("Tax is :"+tax);
		scanner.close();
	}
	
}
