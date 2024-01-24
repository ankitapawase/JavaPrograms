package arrayexample.exercise;

/*
 * 22. Write a program to search an element in an array
	Sample Output
	Array = {10, 20, 30, 40, 50}
	Search Array Elements = 30
	Element is Found in the Position = 3
	Element is Found in the Index = 2
 */

public class ArrayExercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10, 20, 30, 40, 50};
		int search=30,position=0,index=0;
		for(int i=0;i<a.length;i++)
		{
			if(search==a[i])
			{
				position=i+1;
				index=i;
			}
		}
		System.out.println("Index : "+index+" Position : "+position);
	}

}
