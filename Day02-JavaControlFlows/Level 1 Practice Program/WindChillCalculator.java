// Here import all classes so that we can use their inbuilt functions
import java.util.*; 

// Class to calculate wind chill temperature
public class WindChillCalculator {

    //Method to calculate the wind chill temperature using the formula
    public double calculateWindChill(double temperature, double windSpeed) {
	
        // Calculate the wind chill temperature using the given formula
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
		
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in); 

        // Ask the user to enter the temperature
        System.out.println("Enter the temperature in Fahrenheit :");
        double temperature = s.nextDouble();

        // Ask the user to enter the wind speed
        System.out.println("Enter the wind speed in miles per hour :");
        double windSpeed = s.nextDouble();

        // Create an instance of WindChillCalculator to call the method
        WindChillCalculator calculator = new WindChillCalculator();

        // Calculate the wind chill using the method
        double windChill = calculator.calculateWindChill(temperature, windSpeed);

        // Print the result
        System.out.println("The wind chill temperature is : " + windChill);
	
		// Close the scanner
        s.close(); 
}
