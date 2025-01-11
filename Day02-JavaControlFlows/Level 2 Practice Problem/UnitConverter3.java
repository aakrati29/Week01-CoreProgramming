// Create a class UnitConverter3 for various unit conversions
public class UnitConverter3 {

    // Create a method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheitToCelsius = (fahrenheit - 32) * 5 / 9; 
        return fahrenheitToCelsius;
    }

    // Create a method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsiusToFahrenheit = (celsius * 9 / 5) + 32; 
        return celsiusToFahrenheit;
    }

    // Create a method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double poundsToKilograms = 0.453592; 
        return pounds * poundsToKilograms;
    }

    // Create a method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilogramsToPounds = 2.20462; 
        return kilograms * kilogramsToPounds;
    }

    // Create a method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallonsToLiters = 3.78541;
        return gallons * gallonsToLiters;
    }

    // Create a method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double litersToGallons = 0.264172; 
        return liters * litersToGallons;
    }

    public static void main(String[] args) {
	
        // Take example inputs for testing the unit conversion methods
        double fahrenheit = 98.6;
        double celsius = 37.0;
        double pounds = 150.0;
        double kilograms = 68.0;
        double gallons = 10.0;
        double liters = 3.5;

        // Convert Fahrenheit to Celsius and display the result
        double celsiusFromFahrenheit = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsiusFromFahrenheit + " Celsius.");

        // Convert Celsius to Fahrenheit and display the result
        double fahrenheitFromCelsius = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is equal to " + fahrenheitFromCelsius + " Fahrenheit.");

        // Convert pounds to kilograms and display the result
        double kilogramsFromPounds = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + kilogramsFromPounds + " kilograms.");

        // Convert kilograms to pounds and display the result
        double poundsFromKilograms = convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kilograms is equal to " + poundsFromKilograms + " pounds.");

        // Convert gallons to liters and display the result
        double litersFromGallons = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + litersFromGallons + " liters.");

        // Convert liters to gallons and display the result
        double gallonsFromLiters = convertLitersToGallons(liters);
        System.out.println(liters + " liters is equal to " + gallonsFromLiters + " gallons.");
    }
}
