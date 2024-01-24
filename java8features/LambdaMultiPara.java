package java8features;

@FunctionalInterface
interface Addable{
	int add(int a,int b);
}
public class LambdaMultiPara {

	public static void main(String[] args) {
		Addable a1=(x,y) ->x+y;
		System.out.println("Add : "+a1.add(12,34));
		Addable a2=(int x,int y) ->{
			return x+y;
		};
		System.out.println("Add : "+a2.add(2, 4));
	}

}
