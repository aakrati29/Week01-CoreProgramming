// Here import all classes so that we can use their inbuilt functions
import java.util.*;


// Create a class LargestDigitsFinder2 to find largest and second largest number
public class LargestDigitsFinder2 {

    public static void main(String[] args) {
	
        // Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer : ");
        int number = s.nextInt();

        // Check if the number is valid
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        // Define the initial maximum size for the array
        int maxDigit = 10;

        // Create an array to store the digits of the number
        int[] digits = new int[maxDigit];

        // Create an integer variable index with the value 0
         int index = 0;

        // Extract digits of the number and store them in the array
        while (number != 0) {
            // Get the last digit of the number
            int digit = number % 10;

            // If the index reaches the current maxDigit, increase the size of the array
            if (index == maxDigit) {
                // Increase maxDigit by 10
                maxDigit += 10;

                // Create a temporary array with the new size
                int[] temp = new int[maxDigit];

                // Copy elements from the current digits array to the temp array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign the temp array to the digits array for temporary storage
                digits = temp;
            }

            // Add the digit to the array
            digits[index] = digit;

            // Increment the index
            index++;

            // Remove the last digit from the number
            number /= 10;
        }

        // Variables to store the largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        // Find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
			
			else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("Largest digit : " + largest);
        System.out.println("Second largest digit : " + secondLargest);

        // Close the scanner
        s.close();
    }
}
