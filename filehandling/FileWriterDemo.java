package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer = new FileWriter("C:\\Java\\xyz.txt",true);
		String str= "How Are You ?";
		writer.write(str);
		writer.close();
		System.out.println("File Created");
	}

}
