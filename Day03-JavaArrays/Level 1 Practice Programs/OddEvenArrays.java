// here import all classes so that we can use their inbuilt functions
import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
	
        // Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number : ");
        int number = s.nextInt();

        // Check if the entered number is a natural number (greater than 0)
        if (number <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
            return; // Exit the program if the input is not valid
        }

        // Calculate the size for the odd and even number arrays
        int size = number / 2 + 1;

        // Create integer arrays for even and odd numbers
        int[] oddNumbers = new int[size];
        int[] evenNumbers = new int[size];

        // Initialize index variables for odd and even numbers
        int oddIdx = 0;
        int evenIdx = 0;

        // Use a for loop to iterate from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // If the number is even, add it to the evenNumbers array
                evenNumbers[evenIdx] = i;
                evenIdx++; // Increment the even index
            } 
			
			else {
                // If the number is odd, add it to the oddNumbers array
                oddNumbers[oddIdx] = i;
                oddIdx++; // Increment the odd index
            }
        }

        // Display the even numbers array
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIdx; i++) {
		
		    // Print each even number
            System.out.print(evenNumbers[i] + " "); 
        }
		
		// Print a new line after even numbers
        System.out.println(); 

        // Display the odd numbers array
        System.out.print("Odd numbers : ");
        for (int i = 0; i < oddIdx; i++) {
		
		    // Print each odd number
            System.out.print(oddNumbers[i] + " "); 
        }
		
		// Print a new line after odd numbers
        System.out.println(); 

        // Close the scanner
        s.close();
    }
}
