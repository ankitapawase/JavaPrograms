package java8features;
@FunctionalInterface
interface Sayable1{
	String SayHello(String name);
}

public class LambdaSinglePara {

	public static void main(String[] args) {
		Sayable1 s1=name ->{
			return "Hello "+name;
		};
		System.out.println(s1.SayHello("Raj"));
	}

}
