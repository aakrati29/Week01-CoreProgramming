// Create a class UnitConverter for unit conversions
public class UnitConverter {

    // Create a Method to convert kilometers to miles
    public static double convertKmToMiles(double kilometers) {
        double kmToMilesFactor = 0.621371; 
        return kilometers * kmToMilesFactor; 
    }

    // Create a Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double milesToKmFactor = 1.60934; 
        return miles * milesToKmFactor; 
    }

    // Create a method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double metersToFeetFactor = 3.28084; 
        return meters * metersToFeetFactor; 
    }

    // Create a method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feetToMetersFactor = 0.3048; 
        return feet * feetToMetersFactor; 
    }

    public static void main(String[] args) {
	
        // Take example for testing the unit conversion methods
        double kilometers = 10.0;
        double miles = 6.2;
        double meters = 100.0;
        double feet = 328.08;

        // Convert kilometers to miles and display the result
        double milesResult = convertKmToMiles(kilometers);
        System.out.println(kilometers + " kilometers is equal to " + milesResult + " miles.");

        // Convert miles to kilometers and display the result
        double kilometersResult = convertMilesToKm(miles);
        System.out.println(miles + " miles is equal to " + kilometersResult + " kilometers.");

        // Convert meters to feet and display the result
        double feetResult = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feetResult + " feet.");

        // Convert feet to meters and display the result
        double metersResult = convertFeetToMeters(feet);
        System.out.println(feet + " feet is equal to " + metersResult + " meters.");
    }
}
