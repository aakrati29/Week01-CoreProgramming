//here import all classes so that we can use their inbuilt functions
import java.util.Scanner;

public class GenerateMultiplicationTable{
    public static void main(String[] args) {
	
        // Create a object of scanner class
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a number to generate its multiplication table : ");
        int number = s.nextInt(); // Store the entered number in the variable 'number'

        // Define an integer array to store the results of multiplication from 1 to 10
        int[] multiplicationTable = new int[10];

        // Loop to calculate the multiplication results and store them in the array
        for (int i = 0; i < multiplicationTable.length; i++) {
            multiplicationTable[i] = number * (i + 1); // Multiply the number with (i + 1) and store the result
        }

        // Display the multiplication table by looping through the array
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 0; i < multiplicationTable.length; i++) {
            // Print the result in the format: number * (i + 1) = result
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }

        // Close the scanner
        s.close();
    }
}
