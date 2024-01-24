package abstraction;
// Create an abstract class 'Parent' with a method 'message'. It has Two subclasses each having a
// method  with the same name 'message' that prints "This is first subclass ".and "This is secong subclass"
// call the method 'message' by creating an object for each subclass.

	 abstract class Parent{
		public abstract void  message();
	}
	  class subChild1 extends Parent
		{
		 @Override
		public void message() {
			// TODO Auto-generated method stub
			 System.out.println("This is First SubClass .");
			
		}
		}
	 class subChild2 extends Parent
	 {
		 @Override
		public void message() {
			// TODO Auto-generated method stub
			System.out.println("This is Secound Subclass . ");
		}
	 }
public class ParentAbstract {
	public static void main(String[] args) {
		

	Parent s1= new subChild1();
	s1.message();
	subChild2 s2= new subChild2();
	s2.message();
	
	}
	
}
