// here import all classes so that we can use their inbuilt functions
import java.util.Scanner;

public class MultiplicationTableForRange {

    public static void main(String[] args) {
	
        // Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);
		
        System.out.print("Enter a number between 6 and 9 to generate its multiplication table : ");
		
		// Store the user input in the number variable
        int number = s.nextInt(); 

        // Check if the entered number is within the range 6 to 9
        if (number < 6 || number > 9) {
            System.out.println("Please enter a number between 6 and 9.");
        } 
		else {
            // Define an integer array to store the multiplication results
            int[] multiplicationResult = new int[10];

            // Use a for loop to generate the multiplication table from 1 to 10
            for (int i = 1; i <= 10; i++) {
                multiplicationResult[i - 1] = number * i; // Store the result of number * i in the array
            }

            // Display the multiplication table from the array
            System.out.println("Multiplication table of " + number + ":");
            for (int i = 0; i < multiplicationResult.length; i++) {
			
                // Print each result in the format number * i = result
                System.out.println(number + " * " + (i + 1) + " = " + multiplicationResult[i]);
            }
        }

        // Close the scanner object
        s.close();
    }
}
