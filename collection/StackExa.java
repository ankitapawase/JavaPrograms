package collection;

import java.util.Stack;

public class StackExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <String> stack =new Stack <>();
		stack.push("Apple");
		stack.push("Mango");
		stack.push("Banana");
		stack.push(null);
		
		System.out.println("Stack elements : "+stack);
		System.out.println("Removing Elements : "+stack.pop());
		System.out.println("Stack After remove elements : "+stack);
		System.out.println("Search Elements : "+stack.search("Mango"));
	}

}
