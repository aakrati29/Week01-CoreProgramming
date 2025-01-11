// Here import all classes so that we can use their inbuilt functions
import java.util.*;

// Class to calculate the quotient and remainder of two numbers
public class QuotientAndRemainder {

    // Method to find the quotient and remainder of a division operation
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor; 
        int remainder = number % divisor; 

        // Return the result as an array where index 0 is quotient and index 1 is remainder
        return new int[] {quotient, remainder};
    }

    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Ask the user to enter two numbers
        System.out.println("Enter the dividend (number to be divided) :");
        int number = s.nextInt();

        System.out.println("Enter the divisor (number by which division is done) :");
        int divisor = s.nextInt();

        // Check if the divisor is not zero to avoid division by zero error
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } 
		
		else {
            // Call the method to find quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Print the quotient and remainder
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        s.close(); // Close the scanner to release resources
    }
}
