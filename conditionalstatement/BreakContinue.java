package conditionalstatement;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=1;j<=10;j++) {
			if(j==5) {
				break;
			}
			System.out.print(j+" ");
		}
		System.out.println(" ");
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i+" ");
		}
		
	}

}
