// Here import all classes so that we can use their inbuilt functions
import java.util.*;

//Create class EuclideanDistance for calculate something
public class EuclideanDistance {

    // Create a class to find the Euclidean distance between two points
    public static double euclideanDistanceCalculate(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance; 
    }

    // Create a class to find the slope and y-intercept of a line
    public static double[] lineEquationCalculate(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1); 
        double yIntercept = y1 - slope * x1; 
        return new double[]{slope, yIntercept}; 
    }

    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Take inputs for two points
        System.out.print("Enter x1 : ");
        double x1 = s.nextDouble();
		
        System.out.print("Enter y1 : ");
        double y1 = s.nextDouble();
		
        System.out.print("Enter x2 : ");
        double x2 = s.nextDouble();
		
        System.out.print("Enter y2 : ");
        double y2 = s.nextDouble();

        // Calculate Euclidean distance
        double distance = euclideanDistanceCalculator(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        // Calculate line equation
        double[] lineEquation = lineEquationCalculator(x1, y1, x2, y2);
        System.out.println("Slope (m): " + lineEquation[0]);
        System.out.println("Y-Intercept (b): " + lineEquation[1]);

        // Close the scanner class object
        s.close();
    }
}