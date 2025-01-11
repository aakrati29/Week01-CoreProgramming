// Here import all classes so that we can use their inbuilt functions
import java.util.Scanner; 

// Class to NumberChecker to check if a number is positive, negative, or zero
public class NumberChecker {

    //Method to check whether a number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1; // Return 1 for positive number
        } 
		
		else if (number < 0) {
            return -1; // Return -1 for negative number
        } 
		
		else {
            return 0; // Return 0 if the number is zero
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Create a Scanner object for input

        // Prompt the user to enter a number
        System.out.println("Enter a number:");
        int userInput = s.nextInt(); // Store the user input in the variable userInput

        // Call the method to check if the number is positive, negative, or zero
        int result = checkNumber(userInput);

        // Display the result based on the method's return value
        if (result == 1) {
            System.out.println("The number " + userInput + " is positive.");
        } 
		
		else if (result == -1) {
            System.out.println("The number " + userInput + " is negative.");
        } 
		
		else {
            System.out.println("The number is zero.");
        }

		// Close the Scanner
        s.close(); 
    }
}
