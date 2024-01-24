package collection;

import java.util.Collections;
import java.util.LinkedList;
//Created by Ankita Pawase
public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedlist= new LinkedList<>();
		linkedlist.add("Apple");
		linkedlist.add("Mango");
		linkedlist.add("Banana");
		linkedlist.add("Grapes");
		linkedlist.add("Apple");
//		linkedlist.add(null);
		for (String string : linkedlist) {
			System.out.println(string );
		}
		
		LinkedList<String> linkedlist2= new LinkedList<>();
		linkedlist2.add("Lilly");
		linkedlist2.add("Rose");
		System.out.println();
		System.out.println("second List");
		for(String str:linkedlist2)
		{
			System.out.println(str);
		}
		linkedlist.addAll(linkedlist2);
		System.out.println("Adding list2 in list1 : \n"+linkedlist);
		
		
		// Using Collections.sort()
		System.out.println("After Sorting : ");
		Collections.sort(linkedlist);
		for(String str:linkedlist)
		{
			System.out.println(str);
		}
	}

}
