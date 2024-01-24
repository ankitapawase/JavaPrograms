package arrayexample.exercise;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Sample unsorted array with duplicate elements
        int[] array = {5, 2, 7, 3, 2, 5, 8, 7};

        System.out.println("Original Array: " + Arrays.toString(array));

        // Remove duplicates in the array
        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }

    private static int[] removeDuplicates(int[] array) {
        int n = array.length;

        // Check if the array is empty or has only one element
        if (n == 0 || n == 1) {
            return array;
        }

        // Traverse the array and add unique elements to the result array
        int uniqueIndex = 1;

        for (int i = 1; i < n; i++) {
            int currentElement = array[i];
            boolean isDuplicate = false;

            // Check if the current element is not seen before
            for (int j = 0; j < uniqueIndex; j++) {
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

        // Trim the result array to remove unused elements
        return Arrays.copyOf(array, uniqueIndex);
    }
}
