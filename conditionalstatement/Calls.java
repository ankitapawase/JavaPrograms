package conditionalstatement;

import java.util.Scanner;

//Accept no. of calls from user and print bill amout rs. 1 per call should be charged if no.of calls is less than 200 o.w rs.3 per call 

public class Calls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cell,bill;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number of Cells :");
		cell=scanner.nextInt();
		if(cell<200) {
			bill=cell*1;
		}
		else
		{
			bill=cell*3;
			
		}
		System.out.println("Ammount of bill is "+bill);
		scanner.close();
	}

}
