package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeue {

	public static void main(String[] args) {
		Deque<String> queue =new ArrayDeque<String>();
		queue.add("Ankita");
		queue.offer("Ashu");
		queue.add("Shweta");
		queue.add("Priyanka");
		queue.offerFirst("Rutuja");
		queue.offerLast("Sakshi");
		System.out.println("Array Deueue : "+queue);
		System.out.println("Remove Elements : "+queue.poll());
	}

}
