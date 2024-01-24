package arrayexample.exercise;

/* 
 		4. Write a program to calculate the average value of array elements
		Sample Output
		Array = {1, 2, 3, 4, 5}
		Sum of Array Value : 15
		Average of Array Value : 3.0
 */

public class ArrayExercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={1, 7, 3, 4, 5};
		int sum=0;
		double Average;
		for(int i=0;i<array.length;i++)
		{
			 sum=sum+array[i];
		}
		Average=(double)sum/array.length;
		System.out.println("Sum Values of Array ="+sum);
		System.out.println("Average of Array Value : "+Average);
	}

}
