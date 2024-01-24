package classandobject;

import java.util.Scanner;

// Create a class Employee with following data members and member function
// Data members: empName,empcode,basicSalary,allowance,grosssalary,tax,netSalary
// Member Functions :
//void accept() : to input empName, empCode, basicSalary
//void allow() : to calc and store allowance as 55% of basicSalary. 
//void gross() : to calc and store grossSalary as sum of basicSalary and allowance
//void tax() : to calc and store tax as 12% of grossSalary
//void net() : to calc and store netSalary as grossSalary less tax.
//void display() : to display salary slip containing empCode, empName,
//basicSalary, tax and netSalary
//void main() : create an object of a class and execute all methods in logical order.
//



public class Employee {
	double basicSalary,grossSalary,tax,netSalary,allowance;
	String empName,empCode;
	public void accept()
	{
		//void accept() : to input empName, empCode, basicSalary
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Employee Name:");
		empName=sc.next();
		System.out.println("Enetr Employee Code:");
		empCode=sc.next();
		System.out.println("Enetr basic Salary:");
		basicSalary=sc.nextDouble();
	}
	public void allow()
	{
		allowance=basicSalary*0.55;
	}
	public void gross()
	{
		 grossSalary = basicSalary + allowance;
	}
	public void tax()
	{
		 tax = 0.12 * grossSalary;
	}
	public void net()
	{
		netSalary = grossSalary - tax;
	}
	public void display()
	{
		
	       System.out.println("Employee Code: " + empCode);
	       System.out.println("Employee Name: " + empName);
	       System.out.println("Basic Salary: " + basicSalary);
	       System.out.println("Tax: " + tax);
	       System.out.println("Net Salary: " + netSalary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		obj.accept();
		obj.allow();
		obj.gross();
		obj.tax();
		obj.net();
		obj.display();
	}

}
