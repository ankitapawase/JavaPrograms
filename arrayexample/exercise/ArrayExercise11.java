package arrayexample.exercise;
/*
 * Write a program to merge two arrays elements to store third array
	Sample Output
	First Array = {1, 2, 3, 4, 5}
	First Array = {6, 7, 8, 9, 10}
	Merge two Array Elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
 */
public class ArrayExercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1, 2, 3, 4, 5};
		int b[]={6, 7, 8, 9, 10};
		int a1=a.length;
		int b1=b.length;
		int c1=a1+b1;
		int c[]=new int[c1];
		
//		for(int i=0;i<a.length;i++)
//		{
//			c[i]=a[i];
//		}
//		for(int i=0;i<b.length;i++)
//		{
//			c[a1+i]=b[i];
//		}
		
		// using function System.arraycopy()
		
		System.arraycopy(a, 0, c, 0, a1);
		System.arraycopy(b, 0, c, a1, b1);
		System.out.print("Merge two Array Elements =");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}

}
