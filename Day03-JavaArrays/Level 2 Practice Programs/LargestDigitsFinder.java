// Here import all classes so that we can use their inbuilt functions
import java.util.*;

// Create a class LargestDigitsFinder to find largest and second largest element of the array
public class LargestDigitsFinder {

    public static void main(String[] args) {
	
        // Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int number = s.nextInt();

        // Check if the number is valid
        if (number <= 0) {
            System.out.println("Invalid input please enter a positive integer.");
            return;
        }

        // Define the maximum size for the array
        int maxDigit = 10;

        // Create an array to store the digits of the number
        int[] digits = new int[maxDigit];

        // Create an integer variable index with the value 0
        int index = 0;

        // Extract digits of the number and store them in the array
        while (number != 0) {
            // Get the last digit of the number
            int digit = number % 10;

            // Add the digit to the array
            digits[index] = digit;

            // Increment the index
            index++;

            // Check if the array limit is reached
            if (index == maxDigit) {
                System.out.println("Max digit capacity reached. Remaining digits are not added.");
                break;
            }

            // Remove the last digit from the number
            number /= 10;
        }

        // Variables to store the largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        // Find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
			
			else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("Largest digit : " + largest);
        System.out.println("Second largest digit : " + secondLargest);

        // Close the scanner
        s.close();
    }
}
