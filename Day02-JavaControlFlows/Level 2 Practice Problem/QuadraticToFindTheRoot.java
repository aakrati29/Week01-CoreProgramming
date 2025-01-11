// Here import all classes so that we can use their inbuilt functions
import java.util.*;

// Create a class QuadraticToFindTheRoot to calculate the roots of a quadratic equation
public class QuadraticToFindTheRoot {

    // Create a method to calculate the roots of a quadratic equation ax^2 + bx + c
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - (4 * a * c); 
		
        if (delta > 0) {
            // Two distinct roots if delta is positive
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } 
		
		else if (delta == 0) {
            // One root if delta is zero
            double root = -b / (2 * a);
            return new double[]{root};
        } 
		
		else {
            // Return an empty array
            return new double[0]; 
        }
    }

    public static void main(String[] args) {
		
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Take coefficients a, b, and c as input
        System.out.println("Enter the coefficient a : ");
        double a = s.nextDouble();
		
        System.out.println("Enter the coefficient b : ");
        double b = s.nextDouble();
		
        System.out.println("Enter the coefficient c : ");
        double c = s.nextDouble();

        // Find the roots of the quadratic equation
        double[] roots = findRoots(a, b, c);

        // Display the results
        if (roots.length == 2) {
            System.out.println("The equation has two distinct roots :");
            System.out.println("Root 1 : " + roots[0]);
            System.out.println("Root 2 : " + roots[1]);
        } 
		
		else if (roots.length == 1) {
            System.out.println("The equation has one root :");
            System.out.println("Root : " + roots[0]);
        } 
		
		else {
            System.out.println("The equation has no real roots.");
        }

	// Close the scanner
        s.close(); 
    }
}
