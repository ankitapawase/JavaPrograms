package arrayexample;

import java.util.Scanner;

//Matrix Addition
public class MultiDAddi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rowsize,colsize,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row Size :");
		rowsize=sc.nextInt();
		System.out.println("Enter Column Size :");
		colsize=sc.nextInt();
		int[][]a=new int[rowsize][colsize];
		int[][]b=new int[rowsize][colsize];
		int[][]add=new int[rowsize][colsize];
		System.out.println("Enetr 1st  Array Elements: ");
		for(i=0;i<rowsize;i++)
		{
			for(j=0;j<colsize;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}	
		System.out.println("Enetr 2nd  Array Elements: ");
		for(i=0;i<rowsize;i++)
		{
			for(j=0;j<colsize;j++)
			{
				b[i][j]=sc.nextInt();	
			}
		}
		for(i=0;i<rowsize;i++)
		{
			for(j=0;j<colsize;j++)
			{
				add[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Addition is :");
		for(i=0;i<rowsize;i++)
		{
			for(j=0;j<colsize;j++)
			{
				System.out.print(add[i][j]+"	");
			}
			System.out.println();
		}
	}

}
