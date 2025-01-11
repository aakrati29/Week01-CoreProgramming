// Here import all classes so that we can use their inbuilt functions
import java.util.Scanner;

// Create class FindFactors to find the factors of a number
public class FindFactors {

    public static void main(String[] args) {
	
        // Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to find its factors: ");
        int number = s.nextInt();

        // Initialize maxFactor and an index variable
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Loop to find the factors of the number
        for (int i = 1; i <= number; i++) {
		
            // Check if 'i' is a factor of 'number'
            if (number % i == 0) {
			
                // Add the factor to the array
                factors[index] = i;
                index++;

                // If the index reaches the max size, increase the array size
                if (index == maxFactor) {
                    maxFactor *= 2; // Double the size of the array
					
                    // Create a temporary array to hold the existing values
                    int[] temp = new int[maxFactor];
					
                    // Copy the elements from factors array to temp array
                    System.arraycopy(factors, 0, temp, 0, factors.length);
					
                    // Assign the temp array back to factors array
                    factors = temp;
                }
            }
        }

        // Display the factors of the number
        System.out.print("Factors of " + number + " are : ");
        for (int i = 0; i < index; i++) {
		
		    // Print each factor
            System.out.print(factors[i] + " "); 
        }
        System.out.println(); 

        // Close the scanner
        s.close();
    }
}
