package designpattern;

import java.util.Scanner;

interface MobileShop{
	void modelNo();
	void price();
	
}

class IPhone implements MobileShop{

	@Override
	public void modelNo() {
	System.out.println("IPhone 15");
	}

	@Override
	public void price() {
	System.out.println("Rs.70000");
	}
}

class Samsung implements MobileShop{

	@Override
	public void modelNo() {
		System.out.println("Samsung Galaxy");
		}

	@Override
	public void price() {
		System.out.println("Rs.50000");
		}
	
}

class BlackBerry implements MobileShop{

	@Override
	public void modelNo() {
		System.out.println("BlackBerry Z10");
		}

	@Override
	public void price() {
		System.out.println("Rs.65000");
		}
	
}

class ShopKeeper{
	private IPhone iPhone;
	private Samsung samsung;
	private BlackBerry blackBerry;
	public ShopKeeper() {
		iPhone=new IPhone();
		samsung=new Samsung();
		blackBerry=new BlackBerry();
	}
	public void SaleIPhone() {
		iPhone.modelNo();
		iPhone.price();
	}
	public void SaleBlackBerry() {
		blackBerry.modelNo();
		blackBerry.price();
	}
	public void SaleSamsung() {
		samsung.modelNo();
		samsung.price();
	}
}

public class FacadeDesignPatternExa {

	public static void main(String[] args) {
		int choice;
		ShopKeeper shopKeeper=new ShopKeeper();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enetr your Choice.Press\n 1.IPone \n 2.Samsung\n 3.BlackBerry \n 4.Exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				shopKeeper.SaleIPhone();
				break;
			case 2:
				shopKeeper.SaleSamsung();
				break;
			case 3:
				shopKeeper.SaleBlackBerry();
				break;
				default : 
					System.out.println("Invalid Choice....");
			}
		}
		while(choice !=4);

	}

}
