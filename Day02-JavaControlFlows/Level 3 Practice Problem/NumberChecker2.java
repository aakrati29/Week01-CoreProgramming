// Here import all classes so that we can use their inbuilt functions
import java.util.*;

// Create a class NumberChecker2 to perform some task
public class NumberChecker2 {

    // Create a method to count the number of digits in the given number
    public static int countDigits(int number) {
	
        // Convert number to string to find the length
        return Integer.toString(number).length();
    }

    // Create a method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
	
        // Count the number of digits
        int digitsCount = countDigits(number);
        int[] digitsArray = new int[digitsCount];
        
        // Extract digits and store in the array
        for (int i = digitsCount - 1; i >= 0; i--) {
		
			// Get the last digit
            digitsArray[i] = number % 10;  
			
			// Remove the last digit
            number /= 10;  
        }
        
        return digitsArray;
    }

    // Create a method to find the sum of digits using the digits array
    public static int sumOfDigits(int[] digitsArray) {
        int sum = 0;
        
        for (int digit : digitsArray) {
            sum += digit;  
        }
        
        return sum;
    }

    // Create a method to find the sum of squares of digits using the digits array
    public static double sumOfSquaresOfDigits(int[] digitsArray) {
        double sumOfSquares = 0;
        
        for (int digit : digitsArray) {
		
		// Here square the digit and add it to the sum
            sumOfSquares += Math.pow(digit, 2);  
        }
        
        return sumOfSquares;
    }

    // Create a method to check if the number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int[] digitsArray = storeDigits(number);
        int sumOfDigits = sumOfDigits(digitsArray);
        
        return number % sumOfDigits == 0;
    }

    // Create a method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int[] digitsArray) {
        int[][] frequency = new int[10][2];  // Array to store digit and its frequency
        
        // Initialize the first column with digit values (0 to 9)
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        // Count the frequency of each digit
        for (int digit : digitsArray) {
            frequency[digit][1]++;  
        }
        
        return frequency;
    }

    public static void main(String[] args) {
        // Input number
        int number = 12321;

        // Count the digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits in " + number + " : " + digitCount);

        // Store digits in an array
        int[] digitsArray = storeDigits(number);
        System.out.print("Digits of the number: ");
        System.out.println(Arrays.toString(digitsArray));

        // Get sum of digits
        int sum = sumOfDigits(digitsArray);
        System.out.println("Sum of digits: " + sum);

        // Get sum of squares of digits
        double sumOfSquares = sumOfSquaresOfDigits(digitsArray);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Check if it's a Harshad number
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is " + number + " a Harshad number? " + isHarshad);

        // Find the frequency of digits
        int[][] frequency = findDigitFrequency(digitsArray);
        System.out.println("Frequency of each digit: ");
        for (int[] freq : frequency) {
            if (freq[1] > 0) {
                System.out.println("Digit " + freq[0] + " : " + freq[1] + " times");
            }
        }
    }
}
