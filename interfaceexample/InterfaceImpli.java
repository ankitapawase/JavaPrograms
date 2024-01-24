package interfaceexample;

public class InterfaceImpli implements Adable,Printable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImpli impl= new InterfaceImpli();
		impl.print();
		Adable.add(12, 5);
		impl.mul(5,8);
		impl.div(45.5, 4);
		impl.show();
	}

	@Override
	public void div(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("Div : "+ (a/b));
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		float r=10;
		System.out.println("Area : "+(PI*r*r));
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Adable.super.show();
	}
	
	
}
