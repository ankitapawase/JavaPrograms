package arrayexample.exercise;
/*
 * 16. Write a program in to copy the elements of one array into another array
	Sample Output
	Array = {1, 2, 3, 4, 5}
	Copy Array Elements one to Another Array = {1, 2, 3, 4, 5}
 */
public class ArrayExercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1, 2, 3, 4, 5};
		int b[]= {0,0,0,0,0};
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
