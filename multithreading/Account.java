package multithreading;

public class Account {
	private int balance = 50000;
	public int getBalance() {
		return balance;
	}
	public void withdraw(int amount) {
		balance=balance-amount;
	}
}
