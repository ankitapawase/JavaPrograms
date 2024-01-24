package assessment;

import java.util.Scanner;
import java.util.stream.Collectors;

/*
 Coding Challenge:
Your task here is to implement a Java code based on the following specifications. Note that your code should match the specifications in a precise manner. Consider default visibility of classes, data fields and methods unless mentioned otherwise.
Specifications:
class definitions:class Source:
visibility: public
method definition:
insertSpace(String s): method that uses lambda expression to format a given string, where a space is inserted between each character of string.
return type: String
Task
Create a Source class and implement below given method:
• insertSpace(String s): Use lambda expression to format a given string, where a space is inserted between each character of string
Implement using Lambda expressions.
Sample Input:
capgemini

Sample Output:
c a p g e m i n i
 */
public class Source3 {
	public String insertSpace(String s)
	{
		// s.chars() - Converting into characters.
		//mapToObj(ch ->(char)ch+" ") - Adding Space for each
		//collect(Collectors.joining() - Joining CHaracters
		return s.chars().mapToObj(ch ->(char)ch+" ").collect(Collectors.joining());
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Without Using Lambda Expression :");
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i)+" ");
		}
		Source3 s3= new Source3();
		
		System.out.println("\nUsing Java 8 Features :");
		String result=s3.insertSpace(str);
		System.out.println(result);
	}

}
