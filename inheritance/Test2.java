package inheritance;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Customer c1=new Customer();
		c1.calculate();
		c1.display();
		Customer c2=new Customer(102,"Raaj",new MyDate(27,04,2000),"Computer",4,4000);
		c2.calculate();
		c2.display();
		*/
		Discount d1=new Discount();
		d1.calculate();
		d1.display();
		System.out.println();
		Discount d2=new Discount(102,"Raaj",new MyDate(27,04,2000),"Computer",4,4000);
		d2.calculate();
		d2.display();
	}

}
