package series;
// 1+8+27+64+125+...=?
import java.util.Scanner;

public class Series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,temp;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr Number :");
		n=scanner.nextInt();
		for(int i=1;i<=n;i++){
			temp=i;
			i=i*i*i;
			System.out.print(i);
			
			if(temp<n) {
				System.out.print("+");
			}
			sum=sum+i;
			i=temp;
			}
		System.out.print(" = "+sum);
	}

}
