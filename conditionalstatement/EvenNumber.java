package conditionalstatement;
 // sum of even number bet 50-100
public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=50;i<=100;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum is :"+sum);
	}

}
