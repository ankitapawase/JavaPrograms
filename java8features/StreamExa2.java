package java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExa2 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Raj","Sakshi","Rincy","Hemalatha","Darshini");
		
		//create Stream
		Stream<String> allNames = names.stream();
		
		//perform intermediate operation
		Stream<String> longNames =allNames.filter(str->str.length()>7);
		
		//perform terminal operation
		System.out.println("Using forEach() : ");
		longNames.forEach(str->System.out.println(str));
		
		//single line
		//collect(Collectors.toList()) : used to convert Stream into list
		List<String> namesCollect=names.stream().filter(str->str.length()>7).collect(Collectors.toList());
		System.out.println("\nusing collect() : ");
		namesCollect.forEach(System.out::println);
	}

}
