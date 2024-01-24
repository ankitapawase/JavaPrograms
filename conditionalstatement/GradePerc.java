package conditionalstatement;

import java.util.Scanner;

//Accept marks of 3 subjects and calculate total,percentage and grade

public class GradePerc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub1,sub2,sub3;
		float per,total;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 3 Subjects Marks:");
		sub1=scanner.nextInt();
		sub2=scanner.nextInt();
		sub3=scanner.nextInt();
		total=sub1+sub2+sub3;
		per=total/300*100;
		System.out.println("Total of 3 Subjects are :"+total);
		System.out.println("Percentage of 3 subject are :"+per);
		if(per>=75)
		{
			System.out.println("Grade is A+");
		}else if(per>=70 && per<75)
		{
			System.out.println("Grade is A");
		}
		if(per>=65 && per<70 )
		{
			System.out.println("Grade is B+");
		}else if(per>=60 && per<65)
		{
			System.out.println("Grade is B");
		}
		if(per>40 && per<60)
		{
			System.out.println("Grade is c");
		}else if(per<=40)
		{
			System.out.println("Grade is Fail");
		}
		scanner.close();
	}

}
