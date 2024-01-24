package arrayexample.exercise;

import java.util.Arrays;

/*
 * 28. Write a program to find the common elements between two arrays of integers
Sample Output
First Array = {10, 20, 30, 40, 50}
Second Array = {10, 30, 60, 50, 70}
Common Array Elements = {10, 30, 50}
 */
public class CommerElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10, 20, 30, 40, 50};
		int b[]={10, 30, 60, 50, 70,20};
		
		int i,j;
		 int n = a.length;
			int uniqueIndex = 1;

	        for (i = 1; i < n; i++) {
	            int currentElement = a[i];
	            boolean isDuplicate = false;

	            // Check if the current element is not seen before
	            for (j = 0; j < b.length; j++) {
	                if (b[j] == currentElement) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            
	            // If not a duplicate, add to the result array
	            if (isDuplicate) {
	                a[uniqueIndex++] = currentElement;
	            }
	        }
	       
	        
	       int aaa[]= Arrays.copyOf(a, uniqueIndex);
			System.out.println("Array Elements : " +Arrays.toString(aaa));
			
	}

}
