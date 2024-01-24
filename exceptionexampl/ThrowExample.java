package exceptionexampl;
public class ThrowExample {
	public static void checkAge(int age)
	{
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
			throw new ArithmeticException("Age not valid");
	}
	public static void main(String[] args) {
		try {
			checkAge(12);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Rest of code.....");
	}
}
