package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Rectangle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		float length,width,area;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length :");
		length=Float.parseFloat(reader.readLine());
		System.out.println("Enter width :");
		width=Float.parseFloat(reader.readLine());
		area=length*width;
		System.out.println("Area of Rectangle:"+area);

	}

}
