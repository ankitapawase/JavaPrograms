package basic;
import java.util.Scanner;
public class Arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,add,sub,multi;
		float div;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr 2 Numbers:");
		a=scanner.nextInt();
		b=scanner.nextInt();
		add=a+b;
		sub=a-b;
		multi=a*b;
		div=a/b;
		System.out.println("Addition of "+a+" and "+b+" :" +add);
		System.out.println("Substraction of "+a+" and "+b+" :" +sub);
		System.out.println("Multiplication of "+a+" and "+b+" :" +multi);
		System.out.println("Division of "+a+" and "+b+" :" +div);
	}

}
