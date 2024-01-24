package arrayexample.exercise;
/*
 * Write a program to Delete Duplicate Elements from an Array
 Sample Output
 Array = {10, 10, 20, 20, 30}
 After Remove Duplicate Array Elements = {3,23,10,,7, 20, 30 }
 */
public class ArrayExercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10, 10, 20, 20, 30,30,30,40};	//sorted array
		int temp[]=new int[a.length];
		int j=0,count=0,i=0;
		// for sorting Array
		//Using Temp array
		/*
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j]=a[i];
				j++;
			}
		}
		temp[j]=a[a.length-1];// to print last elements of an array.
		*/
		//using j variable
		
		for( i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j]=a[i];
				j++;
			}
		}
		a[j]=a[a.length-1];
		
	
		 
	
		
		System.out.print("After Remove Duplicate Array Elements : ");
		for(i=0;i<j+1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
