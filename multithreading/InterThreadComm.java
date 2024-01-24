package multithreading;

 class Customer {
	private int balance=5000;
	synchronized void withdrow(int amount)
	{
		System.out.println("going to withdrow Rs. "+amount);
		if(balance<amount)
		{
			System.out.println("Not enough balance in account .waiting for deposite.....");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance=balance - amount;
		System.out.println("Rs. "+amount+"withdrow. Balance : "+balance);
	}
	
	synchronized void deposite(int amount)
	{
		System.out.println("Going to deposite Rs ."+amount);
		balance=balance+amount;
		System.out.println("Deposite Rs ." + amount+ " Balance : "+balance);
		notify();
	}
 }
public class InterThreadComm{
		
	
	public static void main(String[] args) {
		Customer customer =new Customer();
		new Thread("Paras")
		{
			public void run() {
				customer.withdrow(15000);
			}
		}.start();
		new Thread("Manas")
		{
			public void run() {
				customer.deposite(20000);
			}
		}.start();
	}
	
}
