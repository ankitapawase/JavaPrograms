package multithreading;

public class PriorityExa extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityExa p1=new PriorityExa();
		PriorityExa p2=new PriorityExa();
		p1.setName("Thread1");
		p2.setName("Thread2");
		p1.setPriority(MIN_PRIORITY);
		p2.setPriority(MAX_PRIORITY);
		p2.setPriority(6);
		p1.start();
		p2.start();
	}
		@Override
		public void run() {
			System.out.println("Thread Name : "+getName()+ " Thread Priority "+ getPriority());
		}
}
