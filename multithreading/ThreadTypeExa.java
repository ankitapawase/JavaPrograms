package multithreading;

public class ThreadTypeExa extends Thread {

	public static void main(String[] args) {
		ThreadTypeExa t1=new ThreadTypeExa();
		ThreadTypeExa t2=new ThreadTypeExa();
		ThreadTypeExa t3=new ThreadTypeExa();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();

	}
	@Override
	public void run() {
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Functionalities of Daemon thread : "+getName());
			
		}
		else
		{
			System.out.println("Functionalities of user thread : "+getName());
			
		}
			
	}
}
