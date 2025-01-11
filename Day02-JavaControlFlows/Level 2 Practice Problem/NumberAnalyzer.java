// Here import all classes so that we can use their inbuilt functions
import java.util.*;

// Create a class NumberAnalyzer to perform number checks and comparisons
public class NumberAnalyzer {

    // Create a method to check whether a number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0; // Positive if the number is 0 or greater
    }

    // Create a method to check whether a number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0; // Even if the remainder when divided by 2 is 0
    }

    // Create a method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; 
        } 
		
		else if (number1 == number2) {
            return 0; 
        } 
		
		else {
            return -1; 
        }
    }

    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Input 5 numbers from the user
        System.out.println("Enter 5 numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = s.nextInt();
        }

        // Loop through the array and check each number
        for (int number : numbers) {
            if (isPositive(number)) {
                System.out.print(number + " is positive and ");
                
				if (isEven(number)) {
                    System.out.println("even.");
                } 
				
				else {
                    System.out.println("odd.");
                }
            } 
			
			else {
                System.out.println(number + " is negative.");
            }
        }

        // Compare the first and last elements of the array
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) {
            System.out.println("The first number is greater than the last number.");
        } 
		
		else if (result == 0) {
            System.out.println("The first number is equal to the last number.");
        } 
		
		else {
            System.out.println("The first number is less than the last number.");
        }

	// Close the scanner
        s.close(); 
    }
}
