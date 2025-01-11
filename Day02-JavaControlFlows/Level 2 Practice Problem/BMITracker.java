// Here import all classes so that we can use their inbuilt functions
import java.util.*;

// Create a class BMITracker to track the BMI of a person
public class BMITracker {

    // Create a method to calculate BMI for each person
    public double calculateBMI(double weight, double height) {
	
        // Convert height from cm to meters
        double heightInMeters = height / 100;
		
        // Calculate BMI using the formula: BMI = weight / (height^2)
        return weight / (heightInMeters * heightInMeters);
    }

    // Create a method to determine BMI status based on the calculated BMI
    public String determineBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } 
		
		else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } 
		
		else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } 
		
		else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        BMITracker tracker = new BMITracker();
        Scanner s = new Scanner(System.in);

        // Create a 2D array to store weight, height, and BMI for 10 people
        double[][] peopleData = new double[10][3]; 

        // Take input for weight and height of 10 people
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight in kg and height in cm for person " + (i + 1));

            System.out.print("Weight (kg): ");
            double weight = s.nextDouble();

            System.out.print("Height (cm): ");
            double height = s.nextDouble();

            // Calculate BMI and populate the 2D array
            double bmi = tracker.calculateBMI(weight, height);
            peopleData[i][0] = weight; 
            peopleData[i][1] = height; 
            peopleData[i][2] = bmi;    
        }

        // Display the BMI and status for each person
        System.out.println("\nBMI Status for each person : ");
        for (int i = 0; i < 10; i++) {
            double bmi = peopleData[i][2];
            String status = tracker.determineBMIStatus(bmi);

            System.out.println("Person " + (i + 1) + " : ");
            System.out.println("Weight : " + peopleData[i][0] + " kg");
            System.out.println("Height : " + peopleData[i][1] + " cm");
            System.out.println("BMI : " + bmi);
            System.out.println("Status : " + status);
            System.out.println();
        }
		
		// Close the scanner
        s.close();
    }
}
