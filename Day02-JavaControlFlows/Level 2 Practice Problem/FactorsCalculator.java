// Here import all classes so that we can use their inbuilt functions
import java.util.*; 

// Create a class FactorsCalculator to find factors of a number and perform operations on them
public class FactorsCalculator {

    //Create method to find the factors of a number
    public static int[] findFactors(int number) {
		
		// Create variable to count the number of factors
        int count = 0; 

        // First loop to count the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

		// Create an array to store the factors
        int[] factors = new int[count]; 
        int index = 0; 

        // Second loop to store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

		// Return the array of factors
        return factors; 
    }

    // Create method to calculate the sum of the factors
    public static int calculateSum(int[] factors) {
        int sum = 0; 
        for (int factor : factors) {
            sum += factor; 
        }
		// Return the sum
        return sum; 
    }

    // Create method to calculate the product of the factors
    public static int calculateProduct(int[] factors) {
        int product = 1; // Initialize product to 1
        for (int factor : factors) {
            product *= factor; 
        }
		
		// Return the product
        return product; 
    }

    // Create method to calculate the sum of the squares of the factors
    public static int calculateSumOfSquares(int[] factors) {
        int sumOfSquares = 0; // Initialize sum of squares to 0
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
		
		// Return the sum of squares
        return sumOfSquares; 
    }

    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in); 

        // Ask the user to input a number
        System.out.println("Enter a number to find its factors : ");
        int number = s.nextInt(); 

        // Call the method to find factors
        int[] factors = findFactors(number);

        // Display the factors
        System.out.println("Factors of " + number + " are : ");
        for (int factor : factors) {
            System.out.print(factor + " "); 
        }
        System.out.println();

        // Calculate and display the sum of factors
        int sum = calculateSum(factors);
        System.out.println("Sum of the factors : " + sum);

        // Calculate and display the product of factors
        int product = calculateProduct(factors);
        System.out.println("Product of the factors : " + product);

        // Calculate and display the sum of squares of the factors
        int sumOfSquares = calculateSumOfSquares(factors);
        System.out.println("Sum of the squares of the factors : " + sumOfSquares);

		// Close the scanner
        s.close(); 
    }
}
