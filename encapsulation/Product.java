package encapsulation;

public class Product {

	private int id;
	private  String  productName;
	private double prize;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public double getPrize() {
		return prize;
	}



	public void setPrize(double prize) {
		this.prize = prize;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		p.setId(101);
		p.setProductName("Mobile");
		p.setPrize(25000);
		System.out.println("Product ID : "+p.getId());
		System.out.println("Product Name : "+p.getProductName());
		System.out.println("Product Prize : "+p.getPrize());
	}

}
