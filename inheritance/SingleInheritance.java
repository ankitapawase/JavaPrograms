package inheritance;

	class vehical
		{
			String vehical_name;
			int speed;
			public void displaySpeed(String vehical_name,int speed)
			{
				System.out.println("Vehical Name is: "+vehical_name+ "and Speed is : "+speed);
			}
		}
			//child class
			class Car extends vehical
			{
				String brand;
				public void displayBrand(String brand)
				{
					System.out.println("Brand is : "+brand);
				}
			}
		

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car();
		obj.displaySpeed("tataSuzuki",50);
		obj.displayBrand("tata");
	}

}
