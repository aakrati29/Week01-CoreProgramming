// Import random class to generate random number
import java.util.Random;

// Class to generate random 4-digit numbers and calculate average, min, and max
public class GenerateRandomNumber {

    // Create a method to generate an array of 4-digit random numbers.
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        Random random = new Random();

        // Generate random 4-digit numbers and store them in the array
        for (int i = 0; i < size; i++) {
		
		// Generate numbers between 1000 and 9999
            randomNumbers[i] = 1000 + random.nextInt(9000); 
        }

        return randomNumbers;
    }

    // Create a method to calculate the average, minimum, and maximum of an array of integers.
    public double[] findAverageMinMax(int[] numbers) {
	
	    // Initialize min with the first element
        int min = numbers[0]; 
		
		// Initialize max with the first element
        int max = numbers[0]; 
		
		// Initialize sum to calculate average
        int sum = 0; 

        for (int num : numbers) {
		
			// Find the maximum value
            sum += num; 
			
			// Find the minimum value
            min = Math.min(min, num); 
			
			// Find the maximum value
            max = Math.max(max, num); 
        }

        double average = (double) sum / numbers.length; // Calculate the average
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        GenerateRandomNumber random = new GenerateRandomNumber();

        // Generate 5 random 4-digit numbers
        int[] randomNumbers = random.generate4DigitRandomArray(5);

        // Display the generated numbers
        System.out.println("Generated 4-digit random numbers : ");
        for (int num : randomNumbers) {
            System.out.println(num);
        }

        // Find the average, minimum, and maximum values
        double[] results = random.findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("Average of the numbers : " + results[0]);
        System.out.println("Minimum value : " + results[1]);
        System.out.println("Maximum value : " + results[2]);
    }
}
