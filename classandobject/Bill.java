package classandobject;

import java.util.Scanner;

//create a class called Bill with the following data members and member functions.
//Data members : custName,phoneNo,number of calls, tax and bill.
//Member Functions :
//accept() : input custName, phoneNo and calls from user
//billing() : calc bill amount based on the following condition
//
//Number of calls Rate per call(Rs)
//up to 100 nill
//next 200 0.80
//next 200 1.25
//above 500 2.50

public class Bill {
	String custName;
	int calls;
	long  phoneNo;
	float tax,bill;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Name : ");
		custName=sc.next();
		System.out.println("Enter Customer Phone Number : ");
		phoneNo=sc.nextLong();
		System.out.println("Enetr Number of Calls from user: ");
		calls=sc.nextInt();
//		System.out.println(phoneNo);
	}
	public double billing()
	{
		if(calls<100)
		{
			bill=0;
		}
		else if(calls>100 && calls<=300)
		{
			bill=calls*0.80f;
		}
		else if(calls>300 && calls<=500)
		{
			bill=calls*1.25f;
		}
		else 
		{
			bill=calls*2.50f;
		}
		return bill;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bill obj=new Bill();
		obj.accept();
		double finalBill=obj.billing();
		System.out.println("Final Bill is: "+(0.12*finalBill));
	}

}
