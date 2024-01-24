package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 1.create list of interger and display even numbers using Stream API

public class StreamEven {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(34,44,67,78,99);
		List<Integer> evenNumber = number.stream().filter(i -> i % 2==0).collect(Collectors.toList());
		evenNumber.forEach(System.out::println);
	}

}
