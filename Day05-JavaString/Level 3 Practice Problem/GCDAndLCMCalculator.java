import java.util.*;

public class GCDAndLCMCalculator {

    // Function to calculate the Greatest Common Divisor (GCD) using the Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate the Least Common Multiple (LCM) using GCD
    public static int calculateLCM(int a, int b) {
	
	    // LCM formula: (a * b) / GCD
        return (a * b) / calculateGCD(a, b); 
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = s.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = s.nextInt();

        // Calculate GCD and LCM
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

        // Display the results
        System.out.println("Greatest Common Divisor (GCD) of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("Least Common Multiple (LCM) of " + num1 + " and " + num2 + " is: " + lcm);

    }
}
