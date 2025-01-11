// Here import all classes so that we can use their inbuilt functions
import java.util.*; 

// Create a class NaturalNumberSum to calculate the sum of first n natural numbers
public class NaturalNumberSum {

    //Method to find the sum of first n natural numbers
    public static int findSum(int n) {
        int sum = 0; // Variable to hold the sum of numbers

        // Loop to calculate the sum from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i; // Add the current number to the sum
        }

        return sum; // Return the total sum
    }

    public static void main(String[] args) {
		
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in); 

        // Ask the user to enter a number
        System.out.println("Enter a positive integer :");

        // Read the number entered by the user
        int n = s.nextInt();

        // Check if the user entered a valid positive number
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } 
		
		else {
            // Call the method to find the sum of the first n natural numbers
            int result = findSum(n);

            // Print the result
            System.out.println("The sum of the first " + n + " natural numbers is : " + result);
        }
		
		// Close the scanner
        s.close(); 
    }
}
