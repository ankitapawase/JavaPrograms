package arrayexample.exercise;

/*
 * 	18. Write a program to array elements print all Positive number
	Sample Output
	Array = {67, -4, 3, -5, 44}
	Positive Array Elements = {67, 3, 44}

	19. Write a program to array elements print all Negative number
	Sample Output
	Array = {-45, 32, -7, 3, -6}
	Negative Array Elements = {-45, -7, -6}

	20. Write a program to array elements to print sum of Positive Numbers
	Sample Output
	Array = {1, -2, 3, 3, 4}
	Sum of Positive Array Elements = 7

	21. Write a program to array elements to print sum of Negative Numbers
	Sample Output
	Array = {10, -23, 45, -10, 30}
	Sum of Negative Array Elements = -33
 */

public class ArrayExercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {67, -4, 3, -5, 44};
		int sumPositive=0,sumNegative=0;
		System.out.print("Positive Numbers Are : ");
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>=0)
			{
				System.out.print(array[i]+" ");
				sumPositive=sumPositive+array[i];
			}
		}
		System.out.println();
		System.out.println("Sum of Positive Array Elements : "+sumPositive);
		System.out.print("Negative Numbers Are : ");
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<=0)
			{
				System.out.print(array[i]+" ");
				sumNegative=sumNegative+array[i];
			}
		}
		System.out.println();
		System.out.println("Sum of Negative Array Elements : "+sumNegative);
	}

}
