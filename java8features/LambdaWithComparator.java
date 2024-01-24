package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}

public class LambdaWithComparator {

	public static void main(String[] args) {
		List<Product> list= new ArrayList<Product>();
		list.add(new Product(101,"Camera",12000));
		list.add(new Product(102,"NoteBook",24000));
		list.add(new Product(103,"Pencil Box",500));
		list.add(new Product(121,"KeyBoard",3435));
		list.add(new Product(134,"Monitor",4546));
		list.add(new Product(345,"Laptop",45444));
		Collections.sort(list, (p1,p2) ->
		{
			return p1.name.compareTo(p2.name);
		});
		for (Product product : list) {
			System.out.println(product);
		}
		
		System.out.println();
		list.forEach(p -> System.out.println(p));
	}

}
