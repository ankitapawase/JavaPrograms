package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Triangle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		float base,length,area;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter base :");
		base=Float.parseFloat(reader.readLine());
		System.out.println("Enter length :");
		length=Float.parseFloat(reader.readLine());
		area=base*length/2;
		System.out.println("Area of Triangle:"+area);

	}

}
