package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapImple {

	public static void main(String[] args) {
		Map<String , String> hashMap =new HashMap<String, String>();
		hashMap.put("In", "India");
		hashMap.put("Br", "Brazil");
		hashMap.put("De", "Germany");
		hashMap.put("fr", "France");
		hashMap.put("Us", "America");
		hashMap.put(null, null);
		
		System.out.println("Hashmap Implementation : ");
		for (Map.Entry<String, String> entry : hashMap.entrySet()) {
			System.out.println("Country Code : "+entry.getKey() + "	||	County Name :  "+entry.getValue());
		}

		Map<String , String> treeMap =new TreeMap<>();
		treeMap.put("BR101", "Coffee");
		treeMap.put("L202", "Tea");
		treeMap.put("D303", "Pasta");
		treeMap.put("BR102", "Biryani");
		treeMap.put("L203", "Chole-Puri");
//		hashMap.put(null, null);
		
		System.out.println("\nTreeMap Implementation : ");
		for (Map.Entry<String, String> entry : treeMap.entrySet()) {
			System.out.println("Menu Code : "+entry.getKey() + "	||	Menu Name :  "+entry.getValue());
		}
		
		Map<String , String> hashTable =new Hashtable<String, String>();
		hashTable.put("Roll101", "Ankita");
		hashTable.put("Roll102", "Ashwini");
		hashTable.put("Roll103", "Rutuja");
		hashTable.put("Roll104", "Priyanka");
		hashTable.put("Roll105", "Rajj");
//		hashMap.put(null, null);
		
		System.out.println("\nHashtable Implementation : ");
		for (Map.Entry<String, String> entry : hashTable.entrySet()) {
			System.out.println(" Roll Number : "+entry.getKey() + "	||	Name :  "+entry.getValue());
		}
	}

}
