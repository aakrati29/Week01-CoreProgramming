// Here import all classes so that we can use their inbuilt functions
import java.util.*; 

// Class to calculate the sum of n natural numbers using recursion and formula
public class NaturalNumberSum {

    // Create method to calculate the sum of n natural numbers using recursion
    public static int findSumUsingRecursion(int n) {
	
		// Base case: if n is 1, return 1
        if (n == 1) {
            return 1; 
        }
		
		// Recursive call to calculate sum
        return n + findSumUsingRecursion(n - 1); 
    }

    //Method to calculate the sum of n natural numbers using the formula n * (n + 1) / 2
    public static int findSumUsingFormula(int n) {
        return (n * (n + 1)) / 2; // Formula to calculate the sum
    }

    public static void main(String[] args) {
		
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in); 

        // Prompt the user to enter a number
        System.out.println("Enter a positive integer to find the sum of natural numbers : ");
        
		// Ask the user to input a number
		int n = s.nextInt(); 

        // Check if the input number is a natural number
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
            return; 
        }

        // Calculate the sum using recursion
        int sumRecursion = findSumUsingRecursion(n);

        // Calculate the sum using the formula
        int sumFormula = findSumUsingFormula(n);

        // Display the results
        System.out.println("Sum of first " + n + " natural numbers using recursion : " + sumRecursion);
        System.out.println("Sum of first " + n + " natural numbers using formula : " + sumFormula);

        // Compare the results and display if they are equal
        if (sumRecursion == sumFormula) {
            System.out.println("Both computations match and the result is correct.");
        } 
		
		else {
            System.out.println("The computations do not match. Please check the logic.");
        }

		// Close the scanner
        s.close(); 
    }
}
