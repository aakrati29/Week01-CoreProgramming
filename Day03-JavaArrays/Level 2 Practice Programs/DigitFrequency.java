// Here import all classes so that we can use their inbuilt functions
import java.util.*; 

// Create a class DigitFrequency to find the frequency of each digit
public class DigitFrequency {

    public static void main(String[] args) {
		
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);
		
        // Take input for the number
        System.out.print("Enter a number : ");
        long number = s.nextLong(); 

        // Convert the number to a string to find the count of digits
        String numberString = Long.toString(number); 
        int digitCount = numberString.length(); 
		
        // Create an array to store the digits of the number
        int[] digits = new int[digitCount]; 

        for (int i = 0; i < digitCount; i++) {
            // Convert each character of the string back to an integer digit
            digits[i] = numberString.charAt(i) - '0';
        }

        // Define a frequency array to store the frequency of each digit from 0 to 9
        int[] frequency = new int[10];

        // Loop through the digits array and update the frequency array
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Display the frequency of each digit
        System.out.println("\nFrequency of each digit in the number : ");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) { 
                System.out.println("Digit " + i + " : " + frequency[i] + " time(s)");
            }
        }

		// Close the Scanner
        s.close(); 
    }
}
