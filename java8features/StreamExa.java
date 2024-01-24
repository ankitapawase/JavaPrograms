package java8features;

import java.util.ArrayList;
import java.util.List;

public class StreamExa {

	public static void main(String[] args) {
		int count = 0;
		long count1=0;
		List<String> list=new ArrayList<String>();
		list.add("Ankita");
		list.add("Sakshi");
		list.add("KartikaDevi");
		list.add("Kanchaneshweri");
		list.add("Ankitawewe");
		
		//without Stream API
		for (String string : list) {
			if(string.length()<7)
			{
				 count++;
			}
		}
		System.out.println("There are "+count+ " String with less than 7");
		
		//with using API
		count1= list.stream().filter(str->str.length()<7).count();
		System.out.println("There are "+count1+ " String with less than 7");
	}

}
