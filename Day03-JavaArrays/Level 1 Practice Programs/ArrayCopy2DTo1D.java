// Here import all classes so that we can use their inbuilt functions
import java.util.Scanner;

//Create a class ArrayCopy2DTo1D to create a 2D Array and Copy the 2D Array
public class ArrayCopy2DTo1D {

    public static void main(String[] args) {
	
        // Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter the number of rows and columns
        System.out.print("Enter the number of rows : ");
        int rows = s.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = s.nextInt();

        // Create a 2D array matrix based on the user input
        int[][] matrix = new int[rows][columns];

        // Prompt the user to enter elements for the matrix
        System.out.println("Enter the elements of the matrix:");

        // Use nested loops to fill the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        // Create a 1D array to store the elements of the 2D array
        int[] array = new int[rows * columns];

        // Define an index variable to keep track of the position in the 1D array
        int index = 0;

        // Copy the elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j]; // Copy element to 1D array
                index++; // Increment the index for the 1D array
            }
        }

        // Display the 2D array (matrix)
        System.out.println("\n2D Array (Matrix) : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
			
				// Print element of matrix
                System.out.print(matrix[i][j] + " "); 
            }
            System.out.println(); 
        }

        // Display the 1D array
        System.out.println("\n1D Array after copying the 2D Array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // Print each element of the 1D array
        }
        System.out.println(); // Print a new line after displaying the 1D array

        // Close the scanner 
        s.close();
    }
}
