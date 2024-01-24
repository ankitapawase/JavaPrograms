package conditionalstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Calculate Area of circle ,rectange,triangle 
public class AreaSwitch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String choice;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Choice......Enter \n  Enter Circle for Calculate Area of Circle \n Enter Rectangle for Area of Rectangle \n Enter Triangle for calculate Area of Triangle. ");
		choice=reader.readLine();
		switch(choice) {
		case "Circle" :
			float r,area;
			System.out.println("Enter Radius :");
			r=Integer.parseInt(reader.readLine());
			area=3.14f*r*r;
			System.out.println("Area of circle is :"+area);
			break;
		case "Rectangle" :
			float length,width;
			System.out.println("Enter length :");
			length=Float.parseFloat(reader.readLine());
			System.out.println("Enter width :");
			width=Float.parseFloat(reader.readLine());
			area=length*width;
			System.out.println("Area of Rectangle:"+area);

			break;
		case "Triangle" :
			float base,length1;
			System.out.println("Enter base :");
			base=Float.parseFloat(reader.readLine());
			System.out.println("Enter length :");
			length1=Float.parseFloat(reader.readLine());
			area=base*length1/2;
			System.out.println("Area of Triangle:"+area);
			break;
		}
		
		
	}

}
