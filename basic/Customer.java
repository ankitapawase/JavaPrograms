package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int id;
		String name;
		double principleAmount,rate,year,total;
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Eneter Id : ");
		id=Integer.parseInt(reader.readLine());
		System.out.println("Enetr Name : ");
		name=reader.readLine();
		System.out.println("Enetr Principle Amount : ");
		principleAmount=Double.parseDouble(reader.readLine());
		System.out.println("Enetr Year : ");
		
		year=Double.parseDouble(reader.readLine());
		System.out.println("Enetr Rate : ");
		rate=Double.parseDouble(reader.readLine());
		total=(principleAmount*year*rate)/100;
		System.out.println("Simple Interest  : "+total);
	}

}
