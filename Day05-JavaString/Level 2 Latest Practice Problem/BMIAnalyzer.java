import java.util.*;

// Class to calculate and analyze BMI
public class BMIAnalyzer {

    // Create a method to compute BMI for multiple individuals
    public static void computeBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
		
			// Convert height to meters
            double heightInMeters = personData[i][1] / 100; 
            personData[i][2] = personData[i][0] / (heightInMeters * heightInMeters);
        }
    }

    // Create a method to determine the BMI category based on the BMI value
    public static String determineBMIStatus(double bmiValue) {
        if (bmiValue < 18.5) return "Underweight";
        else if (bmiValue < 24.9) return "Normal weight";
        else if (bmiValue < 29.9) return "Overweight";
        else return "Obesity";
    }

    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Array to store weight, height, and BMI for 10 individuals
        double[][] individualsData = new double[10][3];

        // Taking input for weight and height of individuals
        for (int i = 0; i < individualsData.length; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            individualsData[i][0] = s.nextDouble();
			
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            individualsData[i][1] = s.nextDouble();
        }

        // Call the method to compute BMI
        computeBMI(individualsData);

        // Display the BMI and category for each individual
        for (int i = 0; i < individualsData.length; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + individualsData[i][1] + " cm, Weight = " + individualsData[i][0] + 
                " kg, BMI = " + individualsData[i][2] + ", Category = " + determineBMIStatus(individualsData[i][2]));
        }

        // Close the Scanner object
        s.close();
    }
}
