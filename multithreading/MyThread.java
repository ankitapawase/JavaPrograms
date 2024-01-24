package multithreading;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		for (int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Current executing thread : "+getName());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1= new MyThread();
		t1.setName("Ankita");
		t1.start();
		MyThread t2= new MyThread();
		t2.setName("Shweta");
		t2.start();
//		t2.stop();
		MyThread t3= new MyThread();
		t3.setName("Ashu");
		t3.start();
	}

}
