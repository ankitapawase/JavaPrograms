package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class SerializationExa {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Employee employye = new Employee(101, "Ankita", "Developer");
//		ObjectOutputStream objectOutputStream =new ObjectOutputStream(new FileOutputStream("C:\\Java\\ser.txt"));
		FileOutputStream outputStream =new FileOutputStream("C:\\Java\\ser.txt");
		ObjectOutputStream objectOutputStream =new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(employye);
		objectOutputStream.flush();
		System.out.println("Coverted employye object to byte Stream");
	}

}
