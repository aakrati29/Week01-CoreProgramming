// Here import all classes so that we can use their inbuilt functions
import java.util.*; 

// Create class to calculate Simple Interest
public class SimpleInterestCalculator {

    // Method to calculate simple interest
    // Takes principal, rate, and time as parameters and returns the calculated interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
	
	    // Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in); 

        // Taking input for Principal amount
        System.out.println("Enter the Principal amount : ");
        double principal = s.nextDouble(); 

        // Taking input for Rate of Interest
        System.out.println("Enter the Rate of Interest in % :");
        double rate = s.nextDouble(); // Store the rate of interest

        // Taking input for Time period
        System.out.println("Enter the Time period in years :");
        double time = s.nextDouble(); // Store the time period in years

        // Calling the method to calculate Simple Interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Displaying the result using println
        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate + "%, and Time " + time + " years.");

        s.close(); // Close the Scanner 
    }
}
