package multithreading;

public class AccountSychroExa implements Runnable {
	private Account account =new Account();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountSychroExa accountSychroExa=new AccountSychroExa();
		Thread thread1=new Thread(accountSychroExa);
		Thread thread2=new Thread(accountSychroExa);
		thread1.setName("Riya");
		thread2.setName("Kavi");
		thread1.start();
		thread2.start();
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			makeWithdrawal(1000);
		}
		
	}
	
	synchronized void makeWithdrawal(int amount)
	{
		if(account.getBalance()>=amount)
		{
			
			System.out.println(Thread.currentThread().getName()+ " is going to withdraw ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName()+" Complete withdraw. Balance : "+account.getBalance());
			
		}
		else
		{
			System.out.println("Not Engough balance in account for "+Thread.currentThread().getName()+" Balance : "+account.getBalance());
		}
	}
}
