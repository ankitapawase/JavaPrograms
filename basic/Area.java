package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Area {
public static void main(String[] args) throws NumberFormatException,IOException {
	float radius,area;
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter radious :");
	radius=Float.parseFloat(reader.readLine());
	area=3.14f*radius*radius;
	System.out.println("Area of circle:"+area);

}
}
