package java8features;

import java.util.ArrayList;
import java.util.List;

class Product1{
	int id;
	String name;
	float prize;
	public Product1(int id, String name, float prize) {
		super();
		this.id = id;
		this.name = name;
		this.prize = prize;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", prize=" + prize + "]";
	}
	
}
public class StreamExa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		List<Product1> list= new ArrayList<Product1>();
		list.add(new Product1(101, "Camera", 27000));
		list.add(new Product1(102, "Clock", 8700));
		list.add(new Product1(103, "Phone", 70000));
		list.add(new Product1(104, "Watch", 200));
		list.add(new Product1(105, "Laptop", 44700));
		
		for (Product1 product : list) {
			if(product.prize>20000)
			{
				count ++;
				System.out.println(product.name);
			}
		}
		System.out.println(count);
	}

}
