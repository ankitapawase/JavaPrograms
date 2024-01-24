package designpattern;

class SingleObject {
	private static SingleObject instance= new SingleObject();
	private SingleObject() {}
	public static SingleObject getInstance() {
		return instance;
	}
	public void show() {
		System.out.println("accessing method using single object ");
	}
}
public class SingletonePatternEx {

	public static void main(String[] args) {
		SingleObject obj=SingleObject.getInstance();
		obj.show();
	}

}
