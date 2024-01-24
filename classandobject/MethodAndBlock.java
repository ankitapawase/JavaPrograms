package classandobject;

public class MethodAndBlock {
	
	public MethodAndBlock()
	{
		System.out.println("Inside Constuctor ");
	}
	{
		System.out.println("Inside instance Block ");
	}
	static {
		System.out.println("Inside static Block");
	}
	public void print()
	{
		System.out.println("Inside method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodAndBlock obj=new MethodAndBlock();
		obj.print();
	}

}
