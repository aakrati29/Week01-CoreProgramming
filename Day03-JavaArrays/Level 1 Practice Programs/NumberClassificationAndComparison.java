//here import all classes so that we can use their inbuilt functions
import java.util.Scanner;

public class NumberClassificationAndComparison{
    public static void main(String[] args) {
        // Define an integer array to store 5 elements entered by the user
        int[] numbers = new int[5];

        // Create a object of scanner class
        Scanner s = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");

        // Loop to take input for the 5 elements of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
			
			// Store the entered number in the array
            numbers[i] = s.nextInt(); 
        }

        // Loop to analyze each number in the array
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i]; // Access the current number in the array

            // Check if the number is positive
            if (num > 0) {
                // Further check if the positive number is even or odd
                if (num % 2 == 0) {
                    System.out.println("The number " + num + " is positive and even.");
                } 
				else {
                    System.out.println("The number " + num + " is positive and odd.");
                }
            }
            // Check if the number is negative
            else if (num < 0) {
                System.out.println("The number " + num + " is negative.");
            }
            // Check if the number is zero
            else {
                System.out.println("The number " + num + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        int firstNumber = numbers[0]; // First element of the array
        int lastNumber = numbers[numbers.length - 1]; // Last element of the array

        // Display the comparison result
        if (firstNumber == lastNumber) {
            System.out.println("The first number (" + firstNumber + ") and last number (" + lastNumber + ") are equal.");
        } 
		else if (firstNumber > lastNumber) {
            System.out.println("The first number (" + firstNumber + ") is greater than the last number (" + lastNumber + ").");
        } 
		else {
            System.out.println("The first number (" + firstNumber + ") is less than the last number (" + lastNumber + ").");
        }

        // Close the scanner
        s.close();
    }
}
