package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//2.Create list of Strings and display strings which starts with character 's'

public class StreamStartWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> names= Arrays.asList("Shubham","Sameer","Ankita","Rutuja","Priyanka");
		List<String> name = names.stream().filter(str ->str.startsWith("S")).collect(Collectors.toList()); 
		name.forEach(System.out::println);
	}

}
