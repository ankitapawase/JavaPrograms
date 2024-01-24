package multithreading;

public class MyThread1 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Currentln Executing Thread : "+ Thread.currentThread().getName());
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 myThread=new MyThread1();
		Thread t1 =new Thread(myThread);
		t1.setName("Ankita");
		t1.start();
		Thread t2 =new Thread(myThread);
		t2.setName("Raj");
		t2.start();
	}

}
