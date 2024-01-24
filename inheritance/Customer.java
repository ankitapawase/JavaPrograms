package inheritance;

/*
 	Q2. Person <- Customer(prodName,quantity, price, billAmount) <- Discount 

	if billAmount is 20000 or greater than then 15% discount on billAmount,
				15000 or more then 10% discount on billAmount,
				10000 or more then 7% discount on billAmount,
				below 10000 no discount.
				
	calculate discount and final bill.
 */

	public class Customer extends Person {
		String prodName;
		double quantity, price, billAmount;

	public Customer() {
		super();
		prodName="phones";
		quantity=3;
		price=3000;
		
	}

	public Customer(int id, String name, MyDate dob,String prodName, double quantity,double price) {
		super(id,name,dob);
		this.prodName = prodName;
		this.quantity = quantity;
		this.price = price;
	}
	public void calculate()
	{
		billAmount=quantity*price;
	}
	@Override
		public void display() {
			// TODO Auto-generated method stub
			super.display();
			System.out.println("Product Name : "+prodName+" \nQuantity : "+quantity+" \nPrice : "+price+" \nTotal Amount: "+billAmount);
		}

}
