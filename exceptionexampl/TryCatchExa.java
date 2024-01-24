package exceptionexampl;

public class TryCatchExa {

	public static void main(String[] args) {
		
		try {
			int a=12/0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.err.println(e);
			e.printStackTrace();
		}

	}

}
