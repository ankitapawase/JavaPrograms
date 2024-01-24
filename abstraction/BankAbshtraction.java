package abstraction;

import java.util.Scanner;

abstract class Bank
 {
	 public abstract float getRateOfInterest();
 }

 class BIO extends Bank
 {

	@Override
	public float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 8.7f;
	}
	 
 }
 class TJSB extends Bank
 {

	@Override
	public float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 6.6f;
	}
	 
 }
public class BankAbshtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float principleAmount,year,rateBIO,rateTJSB;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle amount : ");
		principleAmount=sc.nextFloat();
		System.out.println("Enetr Number of Year : ");
		year=sc.nextFloat();
		
		Bank bBOI=new BIO();
		rateBIO=bBOI.getRateOfInterest();
		
		Bank bTJSB=new TJSB();
		rateTJSB=bTJSB.getRateOfInterest();
		
		 float intrestBIO= (principleAmount *year*rateBIO)/100;
		 
		 float intrestTJSB= (principleAmount *year*rateTJSB)/100;
		
		System.out.println("Sample Interest of BOI is : "+intrestBIO);
		System.out.println("Sample Interest of TJSB is : "+intrestTJSB);
	}

}
