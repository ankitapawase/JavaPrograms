package abstraction;

public abstract class Drawable {
	
	public Drawable()
	{
		System.out.println("Constructor inside Abstract class .");
	}

	public abstract void area();
	public void print()
	{
		System.out.println("Inside non-Static Method in abstract class.");
	}

}
