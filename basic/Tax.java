package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Tax {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		float salary,tax;
		float rate=12;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter salary :");
		salary=Float.parseFloat(reader.readLine());
		float taxRate=rate/100;
		tax=salary+(salary*taxRate);
		System.out.println("Tax ammount at12% of "+salary+" is :"+tax);
	}

}
