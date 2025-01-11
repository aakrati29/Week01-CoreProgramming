// Here import all classes so that we can use their inbuilt functions
import java.util.*;

// Create a class NumberChecker to perform some task
public class NumberChecker {

    // Create a method to find the count of digits in the number
    public static int countDigits(int number) {
	
		// Convert number to string and return length
        return String.valueOf(number).length(); 
    }

    // Create a method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
	
	    // Convert the number to a string
        String numberStr = String.valueOf(number); 
        int[] digits = new int[numberStr.length()]; 
		
		// Create an array to store the digits
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        return digits;
    }

    // Create a method to check if the number is a Duck number it has at least one non-zero digit
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
			
			// If there's any non-zero digit, it's a Duck number
                return true; 
            }
        }
		
		// If all digits are zero, it's not a Duck number
        return false; 
    }

    // Create a method to check if the number is an Armstrong number
    public static boolean isArmstrong(int[] digits, int number) {
        int sum = 0;
        int numDigits = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, numDigits); 
        }
        return sum == number; 
    }

    // Create a method to find the largest and second largest digits
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } 
			
			else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest digits
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } 
			
			else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153; 
		
		// Get the digits of the number
        int[] digits = storeDigits(number); 

        // Print count of digits
        System.out.println("Count of digits: " + countDigits(number));

        // Print digits of the number
        System.out.println("Digits: " + Arrays.toString(digits));

        // Check if it's a Duck number
        if (isDuckNumber(digits)) {
            System.out.println(number + " is a Duck number.");
        } 
		
		else {
            System.out.println(number + " is not a Duck number.");
        }

        // Check if it's an Armstrong number
        if (isArmstrong(digits, number)) {
            System.out.println(number + " is an Armstrong number.");
        } 
		
		else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Find and print largest and second largest digits
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestAndSecondLargest[0]);
        System.out.println("Second largest digit: " + largestAndSecondLargest[1]);

        // Find and print smallest and second smallest digits
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestAndSecondSmallest[0]);
        System.out.println("Second smallest digit: " + smallestAndSecondSmallest[1]);
    }
}
