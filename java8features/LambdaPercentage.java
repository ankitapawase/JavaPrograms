package java8features;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * create a functional interface with a method percentage(double m1,double m2,double m3)
 * and implements lambda expression.
 */
@FunctionalInterface
interface Percentage{
	double percentage(double m1,double m2,double m3);
}
public class LambdaPercentage {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enetr 3 Subjects Marks : ");
		int marks1=Integer.parseInt(reader.readLine());
		int marks2=Integer.parseInt(reader.readLine());
		int marks3=Integer.parseInt(reader.readLine());
		Percentage p = (double m1, double m2, double m3) ->
		{
			return (m1+m2+m3)/3;
		};
		System.out.println("Percentage is : "+p.percentage(marks1, marks2, marks3));
	}

}
