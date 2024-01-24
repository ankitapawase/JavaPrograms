package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <String> vector =new Vector<>();
		vector.addElement("Ankita");
		vector.addElement("Ashu");
		vector.add("Shweta");
		vector.add(null);
		System.out.println("Vector Elements : "+vector);
		
		//in vector enumeration interface is used
		
		Enumeration <String> e = vector.elements() ;
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement() + ", ");
		}
	}

}
