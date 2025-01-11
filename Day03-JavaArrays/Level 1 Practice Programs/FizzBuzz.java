// Here import all classes so that we can use their inbuilt functions
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
	
        // Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer : ");
        int number = s.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Create a String array to store the results for each index
            String[] results = new String[number + 1];

            // Loop from 0 to the input number
            for (int i = 0; i <= number; i++) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
				
					// Store "FizzBuzz" if divisible by both
                    results[i] = "FizzBuzz";  3 and 5
                }
				
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
				
					// Store "Fizz" if divisible by 3
                    results[i] = "Fizz"; 
                }
				
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
				
					// Store "Buzz" if divisible by 5
                    results[i] = "Buzz"; 
                } 
				
				else {
					// Otherwise, store the number itself
                    results[i] = String.valueOf(i); 
                }
            }

            // print each position's value
            for (int i = 0; i <= number; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }
        }

        // Close the scanner
        s.close();
    }
}
