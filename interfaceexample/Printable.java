package interfaceexample;

public interface Printable {
	void div(double a,double b);
	default void show()
	{
		System.out.println("Inside Show Printable");
	}
}
