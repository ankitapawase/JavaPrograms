package exceptionexampl;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			int a[]=new int[10];
			a[12]=12/0;
			}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		// java 7
		try {
			int a[]=new int[10];
			a[12]=12/0;
			}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
