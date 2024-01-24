package arrayexample.exercise;

import java.util.Arrays;

// In Unsorted Array Remove duplicates elements
public class RemoveDeblicateUnsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {12,3,3,45,6,6,12};	//i=0
//		int temp[]= new int[array.length];	//{ 12 	3	3	45	6	6	12}
										    //j=i
										    //{ 12	3	3	45	6	6	12}	
		int i,j;
		 int n = array.length;
		int uniqueIndex = 1;

        for (i = 1; i < n; i++) {
            int currentElement = array[i];
            boolean isDuplicate = false;
            	//{ 12	12	3	45	6	6	12}	
            // Check if the current element is not seen before
            for (j = 0; j < uniqueIndex; j++) {
                if (array[j] == currentElement) {
                    isDuplicate = true;
                    break;
                }
            }
            
            // If not a duplicate, add to the result array
            if (!isDuplicate) {
                array[uniqueIndex++] = currentElement;
            }
        }
       int aaa[]= Arrays.copyOf(array, uniqueIndex);
		System.out.println("Array Elements : " +Arrays.toString(aaa));
		
	}

}
