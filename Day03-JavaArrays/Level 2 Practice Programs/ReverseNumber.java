// Here import all classes so that we can use their inbuilt functions
import java.util.*;

// Create a class ReverseNumber to reverse the number
public class ReverseNumber {

    public static void main(String[] args) {
	
        // Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a positive integer : ");
        int number = s.nextInt();

        // Check if the number is valid
        if (number <= 0) {
            System.out.println("Invalid input please enter a positive integer.");
            return;
        }

        // Create variable to temporarily store number for digit counting
        int temp = number;

        // Count the number of digits in the number
        int digitCount = 0;
        while (temp > 0) {
            digitCount++;
            temp /= 10; // Remove the last digit
        }

        // Create an array to store the digits of the number
        int[] digits = new int[digitCount];

        // Extract digits of the number and store them in the array
        for (int i = 0; i < digitCount; i++) {
            digits[i] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
        }

        // Display the reversed number using the array
        System.out.print("Reversed number: ");
		
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }

        // Close the scanner
        s.close();
    }
}
