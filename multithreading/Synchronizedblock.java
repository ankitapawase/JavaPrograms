package multithreading;

class PrintTable{
	public void print(int n)
	{
		synchronized (this) {
			for(int i=1;i<=10;i++)
			{
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(n*i);
			}
		}
	}
}
class Thread1 extends Thread{
	PrintTable printTable;

	public Thread1(PrintTable printTable) {
		super();
		this.printTable = printTable;
	}
	@Override
	public void run() {
		printTable.print(2);
	}
	
}
class Thread2 extends Thread{
	PrintTable printTable;

	public Thread2(PrintTable printTable) {
		super();
		this.printTable = printTable;
	}
	@Override
	public void run() {
		printTable.print(4);
	}
	
}
public class Synchronizedblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTable printTable =new PrintTable();
		Thread1 t1=new Thread1(printTable);
		Thread2 t2=new Thread2(printTable);
		t1.setName("Raj");
		t2.setName("kavi");
		t1.start();
		t2.start();
		
	}

}
