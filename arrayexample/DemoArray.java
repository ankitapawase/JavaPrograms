package arrayexample;

import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// Define arrays to store roll numbers and marks
		int[] rollNumbers = new int[5];
		double[] marks = new double[5];

		// Read roll numbers and marks for 5 students
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter Roll Number for student " + (i + 1) + ": ");
			rollNumbers[i] = scanner.nextInt();

			System.out.print("Enter Marks for student " + (i + 1) + ": ");
			marks[i] = scanner.nextDouble();
		}

		// Create an array of indices
		int[] indices = new int[] { 0, 1, 2, 3, 4 };

		// Sort the indices based on corresponding marks in descending order
		for (int i = 0; i < 5 - 1; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (marks[indices[i]] < marks[indices[j]]) {
					// Swap indices
					int tempIndex = indices[i];
					indices[i] = indices[j];
					indices[j] = tempIndex;
				}
			}
		}

		// Print the student information in descending order of marks
		System.out.println("\nStudent Information in Descending Order of Marks:");
		System.out.println("Roll Number\tMarks");
		for (int i = 0; i < 5; i++) {
			int index = indices[i];
			System.out.println(rollNumbers[index] + "\t\t" + marks[index]);
		}

		// Close the scanner
		scanner.close();
	}

}
