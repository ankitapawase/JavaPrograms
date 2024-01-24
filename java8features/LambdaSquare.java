package java8features;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Create a functional interface with a method square(int n) 
 * and implement the lambda expression 
 */
@FunctionalInterface
interface AreaSquare{
	int area(int n);
}
public class LambdaSquare {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enetr Value : ");
		int side =Integer.parseInt(reader.readLine());
		AreaSquare a = (n) ->{
			return n*n;
		};
		System.out.println("Area Of Square : " + a.area(side));
	}

}
