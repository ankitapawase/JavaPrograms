package stringexample;
import java.io.*;


class InAmsterdam{
	public int countAm(String str)
	{
		int result=0;
		String count[]=str.split(" ");
		for(int i=0;i<count.length;i++)
		{
			if(count[i].equalsIgnoreCase("am"))
			{
				result++;
			}
		}
		return result;
	}
}
public class Source {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter String : ");
	String string=sc.readLine();
	InAmsterdam ele=new InAmsterdam();
	int result=ele.countAm(string);
	System.out.println("Count : "+result);
//	try {
//		int display=ele.countAm(string);
//		System.out.println(display);
//	}catch (Exception e) {
//		
//	}
//	}
	}
}
