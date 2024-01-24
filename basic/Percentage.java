package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Percentage {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int sub1,sub2,sub3;
		float per;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any 3 Subjects Marks out of 100 :");
		sub1=Integer.parseInt(reader.readLine());
		sub2=Integer.parseInt(reader.readLine());
		sub3=Integer.parseInt(reader.readLine());
		float total=sub1+sub2+sub3;
		per=(total/300)*100;
//		System.out.println(total);
		System.out.println("Percentage of 3 Subjects are :"+per);
	}

}
