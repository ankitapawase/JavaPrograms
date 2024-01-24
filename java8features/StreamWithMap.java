package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithMap {

	public static void main(String[] args) {
		ArrayList<Integer> marks =new ArrayList<Integer>();
		marks.add(56);
		marks.add(50);
		marks.add(70);
		marks.add(86);
		marks.add(66);
		marks.add(46);
		System.out.println("Marks before updating : "+marks);
		
		List<Integer>updatedMarks = marks.stream().map(i->i+10).collect(Collectors.toList());
		System.out.println("Marks After updating : "+updatedMarks);
	}
}


	// H.w assignment to update marks based on condition 
	/*
	 * 1.create list of interger and display even numbers using Stream API
	 * 2.Create list of Strings and display strings which starts with character 's'
	 * 3.create list of Employee(id,name,age,salary)
	 * 		i) dispaly Employee whose salary >50000. And 
	 *  	ii) Add 5000 bonus whose salary <30000 display list
	 */
//}
