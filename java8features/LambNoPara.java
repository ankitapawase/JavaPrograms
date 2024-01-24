package java8features;
@FunctionalInterface
interface Sayable 
{
	String sayHello();
	
}
public class LambNoPara {

	public static void main(String[] args) {
		Sayable s1= () ->{
			return "Hello User";
		};
		System.out.println(s1.sayHello());
	}

}
