// here import all classes so that we can use their inbuilt functions
import java.util.Scanner;

// create a class NumberAndTheSum to calculate the sun of all the numbers
public class NumberAndTheSum {

    public static void main(String[] args) {
	
        // Create a variable to store an array of 10 elements of type double
        double[] numbers = new double[10];
        
        // Create Variable to store the total of all numbers and initialized to 0.0
        double total = 0.0;

        // Index variable to track the position in the array and initialized to 0
        int index = 0;

        // Create a Scanner object to take user input
        Scanner s = new Scanner(System.in);

        // Infinite while loop to keep taking user input until the conditions are met
        while (true) {
            System.out.print("Enter a number (0 or negative number to stop): ");
            double input = s.nextDouble(); // Get user input

            // Check if the input is 0 or a negative number to exit the loop
            if (input <= 0) {
                break; // Exit the loop if input is 0 or negative
            }

            // Check if the array is already full (index reaches 10)
            if (index >= 10) {
                System.out.println("The array is full. You cannot enter more numbers.");
                break; // Exit the loop if the array size limit (10) is reached
            }

            // Store the valid number in the array at the current index
            numbers[index] = input;
            index++; // Increment the index for the next number
        }

        // Variable to store the sum of all numbers
        total = 0.0;

        // Calculate the sum of all stored numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i]; // Add each element to the total
        }

        // Display all the entered numbers
        System.out.println("The numbers you entered are : ");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]); // Print each number stored in the array
        }

        // Display the sum of all entered numbers
        System.out.println("The total sum of the entered numbers is : " + total);

        // Close the scanner
        s.close();
    }
}
