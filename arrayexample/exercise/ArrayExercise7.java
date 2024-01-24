package arrayexample.exercise;

/*
 	10. Write a program to find the maximum and minimum element in an array
	Sample Output
	Array = {23, 4, 32, 5, 75}
	Maximum Element of Array = 75
	Minimum Element of Array = 4
 */

public class ArrayExercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={23, 1, 32, 5, 75};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			
			
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
			
			
		}
		System.out.println("Maximum Element of Array : "+max);
		System.out.println("Minimum Element of Array : "+min);
	}

}
