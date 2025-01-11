// Here import all classes so that we can use their inbuilt functions
import java.util.*;

//Create a class FindCollinearPoints to find the 3 points that are collinear
public class FindCollinearPoints {

    // to find the 3 points that are collinear to check collinearity using slope formula
    public static boolean collinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Check if slopes are equal and return it
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Create a method to check if three points are collinear using the area of triangle formula
    public static boolean collinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
		
		// If the area is zero then points are collinear
        return area == 0; 
    }

    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Take input for the three points
        System.out.print("Enter x1 and y1 for Point A : ");
        double x1 = s.nextDouble();
        double y1 = s.nextDouble();

        System.out.print("Enter x2 and y2 for Point B : ");
        double x2 = s.nextDouble();
        double y2 = s.nextDouble();

        System.out.print("Enter x3 and y3 for Point C : ");
        double x3 = s.nextDouble();
        double y3 = s.nextDouble();

        // Check collinearity using slope formula
        boolean collinearBySlope = collinearUsingSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using slope formula : " + collinearBySlope);

        // Check collinearity using area formula triangle formula
        boolean collinearByArea = collinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using area formula : " + collinearByArea);

        // Close the scanner object
        s.close();
    }
}