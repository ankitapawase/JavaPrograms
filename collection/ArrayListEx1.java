package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

//Created by Ankita Pawase
public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();  //non-generic list
		list.add("Ankita");
		list.add(101);
		list.add(55.78);
		list.add(true);
		list.add(null);
		list.add("Pawase");
		 
		System.out.println("List Elements : "+list);
		
		//get method
		System.out.println("Using Get method : "+list.get(0));
		
		//set method
		list.set(1, "Hello");
		System.out.println("Using Set method : "+list);
		
		// delete elememts
		list.remove(1);
		System.out.println("Using remove method : "+list);
		
		//size
		System.out.println("Size of List : "+list.size());
		
		//loop 
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+ ", ");
		}
		
		//sorting 
//		Collections.sort(list);
		ArrayList <String> list2 = new ArrayList<>();  //generic list
		list2.add("Rose");
		list2.add("Lilly");
		list2.add("Lotus");
		list2.add("Ziniya");
		list2.add("Jarbera");
		list2.add(null);
		System.out.println("Generic List  : "+list2);
		
		System.out.println("Iterating list using Iterator interface : ");
         Iterator<String> iterator = list2.iterator();
         while(iterator.hasNext())
         {
        	 System.out.print(iterator.next() + ", ");
         }
         
         System.out.println("Iterating list using foreach loop : ");
         for (String string : list2) {
			System.out.print(string + " ,");
		}
         for(int i=0;i<list2.size();i++)
 		{
 			System.out.print(list2.get(i) + ", ");
 		}
         
	}

}
