package conditionalstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Accept purchase ammount from the user and print discount ammount 10%discount on purchase if ammount is greater than or equal to 10000 o.w 2% discount

public class PurchaseTax {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int amount;
		float discount;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Purchase Amount:");
		amount=Integer.parseInt(reader.readLine());
		if(amount>=10000)
		{
			discount=amount*0.1f;
		}else
		{
			discount=amount*0.02f;
		}
		System.out.println("Discount is:"+discount);
	}

}
