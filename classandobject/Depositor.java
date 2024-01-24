package classandobject;

import java.util.Scanner;

/*Write a program to accept depositor's name, principle amount and number of years from the user.
Using function amount(), calculate the accumulated amount using the below formula,
a=p*(1+r/100)raise to n Hint: Math.pow()
a=accumulated amount, p=principle amount, r=rate of interest, n=no. of years
value of p and n to be taken from the user, and depending on the value n, r to be
 calculated as per the following table-
No. of years Rate of Interest
<1 9
>=1 but <=3 9.25
>3 but <=5 9.5
above 5 9.75
Hint:
p = 1+r/100
a=p*Math.pow(p,n);
*/
public class Depositor {
	
	public void amount(float amount,float rate,int n)
	{
		double a;
		a= amount * Math.pow((1 + rate / 100), n);
		System.out.println("accumulated amount is : "+String.format("%.2f", a));
	}
	
	public float calcRate(int n)
	{
		
		 if (n < 1) {
	            return 9;
	        } else if (n >= 1 && n <= 3) {
	            return (float) 9.25;
	        } else if (n > 3 && n <= 5) {
	            return (float) 9.5;
	        } else {
	            return (float) 9.75;
	        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		String name;
		float amount,a;
		System.out.println("Enter Depositor Name :");
		name=sc.next();
		System.out.println("Enter Principle amount :");
		amount=sc.nextFloat();
		System.out.println("Enter Number of Year :");
		n=sc.nextInt();
		Depositor obj=new Depositor();
		float rate=obj.calcRate(n);
		obj.amount(amount,rate,n);
		sc.close();
	}

}
