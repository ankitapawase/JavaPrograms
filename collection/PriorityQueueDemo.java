package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue <String> queue = new PriorityQueue<String>();
		queue.add("Apple");
//		queue.element();
		queue.offer("Banana");
		queue.add("Guaga");
		queue.add("Watermellon");
		queue.add("Apple");
		System.out.println("Priority Queue is : \n "+queue);
		System.out.println("Head of Element : "+queue.element());
		System.out.println("Remove Elements : "+queue.remove());
		System.out.println("Priority Queue After Remove : \n "+queue);
		System.out.println("Retrival of Elements : "+queue.peek());
	}

}
