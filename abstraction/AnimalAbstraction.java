package abstraction;

abstract class Animal 
{
	public abstract void cats();
	public abstract void dogs();
}

class Cats extends Animal
{
	
	@Override
	public void dogs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cats() {
		// TODO Auto-generated method stub
	System.out.println("Catss Maowwww.");	
	}

	
}
class Dogs extends Animal
{
	
	@Override
	public void dogs() {
		// TODO Auto-generated method stub
		System.out.println("Dogs Bark.");
	}

	@Override
	public void cats() {
		// TODO Auto-generated method stub
		
	}

	
}
public class AnimalAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cats c=new Cats();
		c.cats();
		Dogs c1=new Dogs();
		c1.dogs();
	}

}
