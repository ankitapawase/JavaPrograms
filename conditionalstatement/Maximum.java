package conditionalstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Accept 3 Numbers from user and display greatest Number. 

public class Maximum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int a,b,c;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enetr 3 Numbers :");
		a=Integer.parseInt(reader.readLine());
		b=Integer.parseInt(reader.readLine());
		c=Integer.parseInt(reader.readLine());
		if(a>b && a>c) {
			System.out.println(a+" is Maximum Number.");
		}else if(b>a && b>c)
		{
		System.out.println(b+" is Maximum Number");
		}
		else
		{
			System.out.println(c+" is Maximum Number");
		}
	}

}
