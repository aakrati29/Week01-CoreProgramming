//import scanner class so that we can use their inbuilt function
import java.util.Scanner;

public class SumOfNaturalNumbersUsingForLoop{
    public static void main(String[] args) {
	
        Scanner s = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int number = s.nextInt();

        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number");
        } else {
            // Compute the sum using a for loop
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }

            // Computing the sum using the formula
            int sumUsingFormula = number * (number + 1) / 2;

            System.out.println("Sum using for loop: " + sum);
            System.out.println("Sum using formula: " + sumUsingFormula);

            // Comparing the results
            if (sum == sumUsingFormula) {
                System.out.println("Both computations are correct and produce the same result");
            } else {
                System.out.println("Results are different");
            }
        }

        s.close();
    }
}
