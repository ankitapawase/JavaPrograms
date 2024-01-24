package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEmpli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String > hashSet = new HashSet<String>();
		hashSet.add("Raj");
		hashSet.add("Rani");
		hashSet.add("Raj");
		hashSet.add("Ravi");
		hashSet.add(null);
		System.out.print("HashSet Implimentation : ");
		for (String string : hashSet) {
			System.out.print(string+", ");
		}
		System.out.println();
		Set <String> linkedHashSet =new LinkedHashSet<String>();
		linkedHashSet.add("Apple");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Guava");
		linkedHashSet.add("Mango");
		linkedHashSet.add("Apple");
		linkedHashSet.add(null);
		System.out.println("Linked Hash Set Implimentation : "+linkedHashSet);
		
		Set <String> treeSet =new TreeSet<String>();
		treeSet.add("Pizza");
		treeSet.add("Pav Bhaji");
		treeSet.add("Coffee");
		treeSet.add("Pizza");
		treeSet.add("Burgur");
		treeSet.add("COld Coffee");
		System.out.println("Tree Set Implimentation : "+treeSet);
	}
	

}
