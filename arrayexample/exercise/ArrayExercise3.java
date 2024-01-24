package arrayexample.exercise;

/*
  	 Write a program to print sum values of an array
	Sample Output
	Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
	Sum Values of Array = 55
 */

public class ArrayExercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			 sum=sum+array[i];
		}
		System.out.println("Sum Values of Array ="+sum);
	}

}
