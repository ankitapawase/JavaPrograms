package arrayexample;

import java.util.Scanner;

public class RollNoMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5,i,temp,j,temp1;
		Scanner sc=new Scanner(System.in);

		int rollno[]=new int[size];
		int marks[]=new int[size];

		for(i=0;i<rollno.length;i++)
		{
			System.out.println("Enetr "+(i+1)+ " Student Roll Number :");
			rollno[i]=sc.nextInt();
			System.out.println("Enetr "+(i+1)+ " Student Marks  :");
			marks[i]=sc.nextInt();
		}

		for(i=0;i<marks.length-1;i++)
		{
			for(j=i+1;j<marks.length;j++)
			{
				if(marks[i]<marks[j])
				{
					temp=marks[i];
					marks[i]=marks[j];
					marks[j]=temp;
					temp1=rollno[i];
					rollno[i]=rollno[j];
					rollno[j]=temp1;
				}
				
			}
		}
		System.out.println("After sorting an ascending order:");
		for(i=0;i<rollno.length;i++)
		{
		System.out.print(rollno[i]+"  ");
		}
		System.out.println();
		for(i=0;i<marks.length;i++)
		{
		System.out.print(marks[i]+"  ");
		}
		
	}

}
