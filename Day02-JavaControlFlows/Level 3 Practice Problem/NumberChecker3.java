// Here import all classes so that we can use their inbuilt functions
import java.util.*;

// Create a class NumberChecker3 to perform some task
public class NumberChecker3 {

    // Create a method to count the number of digits in the number
    public static int countDigits(int number) {
	
        // Convert the number to a string and return the length
        return Integer.toString(number).length();
    }

    // Create a method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
	
        // Get the count of digits in the number
        int digitsCount = countDigits(number);
        int[] digitsArray = new int[digitsCount];

        // Extract digits and store them in the array
        for (int i = digitsCount - 1; i >= 0; i--) {
            digitsArray[i] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
        }

        return digitsArray;
    }

    // Create a method to reverse the digits array
    public static int[] reverseDigits(int[] digitsArray) {
        int[] reversedArray = new int[digitsArray.length];
        
        // Reverse the array by copying elements in reverse order
        for (int i = 0; i < digitsArray.length; i++) {
            reversedArray[i] = digitsArray[digitsArray.length - 1 - i];
        }

        return reversedArray;
    }

    // Create a method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        // Check if the arrays have the same length and elements
        return Arrays.equals(array1, array2);
    }

    // Create a method to check if the number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digitsArray = storeDigits(number);
        int[] reversedArray = reverseDigits(digitsArray);
        
        // Check if the number is the same when reversed
        return areArraysEqual(digitsArray, reversedArray);
    }

    // Create a method to check if the number is a Duck number
    public static boolean isDuckNumber(int number) {
        int[] digitsArray = storeDigits(number);
        
        // A Duck number must have a non-zero digit in it
        for (int digit : digitsArray) {
            if (digit != 0) {
			
			// If a non-zero digit is found, it's a Duck number
                return true; 
            }
        }
        
		// No non-zero digit found, not a Duck number
        return false; 
    }

    public static void main(String[] args) {
	
        // Sample number for testing
        int number = 102;

        // Count digits in the number
        int digitCount = countDigits(number);
        System.out.println("Count of digits in " + number + " : " + digitCount);

        // Store digits in an array
        int[] digitsArray = storeDigits(number);
        System.out.print("Digits of the number : ");
        System.out.println(Arrays.toString(digitsArray));

        // Reverse the digits array
        int[] reversedArray = reverseDigits(digitsArray);
        System.out.print("Reversed digits of the number : ");
        System.out.println(Arrays.toString(reversedArray));

        // Check if the number is a palindrome
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is the number " + number + " a palindrome? " + isPalindrome);

        // Check if the number is a Duck number
        boolean isDuckNumber = isDuckNumber(number);
        System.out.println("Is the number " + number + " a Duck number? " + isDuckNumber);
    }
}
