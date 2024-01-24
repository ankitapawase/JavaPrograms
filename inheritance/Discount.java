package inheritance;

public class Discount extends Customer {
	double discount,finalBill;

	public Discount() {
		super();
	}

	public Discount(int id, String name, MyDate dob,String prodName, double quantity,double price) {
		super(id,name, dob,prodName, quantity,price);
	}
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
		if(billAmount>=20000)
		{
			discount=0.15f;
		}
		else if(billAmount>=15000 && billAmount<20000)
		{
			discount=0.1f;
		}
		else if(billAmount>=10000 && billAmount<15000)
		{
			discount=0.07f;
		}
		else
			discount=0.0f;
		
		finalBill=billAmount-discount;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Discount : "+String.format("%.2f",discount));
		System.out.println("Final Bill : "+String.format("%.2f",finalBill));
	}
	
}
