package arrayexample;

import java.util.Scanner;

// Multi dimentional Array
public class MultiDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,rowsize,colsize;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row Size :");
		rowsize=sc.nextInt();
		System.out.println("Enter Column Size :");
		colsize=sc.nextInt();
		int[][]a=new int[rowsize][colsize];
		System.out.println("Enetr Array Elements: ");
		for(i=0;i<rowsize;i++)
		{
			for(j=0;j<colsize;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}	
		for(i=0;i<rowsize;i++)
		{
			for(j=0;j<colsize;j++)
			{
				System.out.print(a[i][j]+"	");
			}
			System.out.println();
		}
	}

}
