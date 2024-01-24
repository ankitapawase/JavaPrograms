package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExa {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream outputStream =new FileOutputStream("C:\\Java\\abc.txt",true);
		String str=" We are Learners";
		byte bArray[]=str.getBytes();
		outputStream.write(bArray);
		outputStream.close();
		System.out.println("File Created..");
	}

}
