package arrayexample.exercise;
/*
 	15. Write a program to array elements to print sum of Cubic Values
	Sample Output
	Array = {1, 2, 3, 4, 5}
	Sum of Cubic Array Elements = 225
 */
public class ArrayExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1, 2, 3, 4, 5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+(a[i]*a[i]*a[i]);
		}
		System.out.println("Sum of Cubic Array Elements : "+sum);
	}

}
