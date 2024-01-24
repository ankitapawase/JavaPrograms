package conditionalstatement;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fno=0,sno=1,tno;
		System.out.print(fno+" "+sno);
		for(int i=0;i<=6;i++)
		{
			tno=fno+sno;
			System.out.print(" "+tno);
			fno=sno;
			sno=tno;
		}
	}

}
