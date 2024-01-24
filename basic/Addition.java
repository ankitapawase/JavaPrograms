package basic;
import java.util.Scanner;
public class Addition {
public static void main(String[] arg) {
	int a,b,c;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enetr 2 Numbers:");
	a=scanner.nextInt();
	b=scanner.nextInt();
	c=a+b;
	System.out.println("Addition of "+a+" and "+b+" :" +c);
}
}
