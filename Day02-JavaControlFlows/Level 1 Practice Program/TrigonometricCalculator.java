// Here import all classes so that we can use their inbuilt functions
import java.util.*; 

// Create a class to calculate trigonometric functions
public class TrigonometricCalculator {

    //Method to calculate sine, cosine, and tangent of an angle
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians); 
        double cosine = Math.cos(radians); 
        double tangent = Math.tan(radians);

        // Return the values in an array: [0] = sine, [1] = cosine, [2] = tangent
        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {
		
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in); 

        // Ask the user to input an angle in degrees
        System.out.println("Enter the angle in degrees : ");
        double angle = s.nextDouble();

        // Create an instance of TrigonometricCalculator to call the method
        TrigonometricCalculator calculator = new TrigonometricCalculator();

        // Call the method to calculate the trigonometric functions
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        // Print the results sine, cosine, and tangent of the angle
        System.out.println("Sine of the angle : " + results[0]);
        System.out.println("Cosine of the angle : " + results[1]);
        System.out.println("Tangent of the angle : " + results[2]);

		// Close the scanner
        s.close(); 
    }
}
