// Here import all classes so that we can use their inbuilt functions
import java.util.*;

// Create a class MultiDimensionalArray to find the height, weight, BMI and status of each person
public class MultiDimensionalArray {

    public static void main(String[] args) {
	
        // Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons : ");
        int number = s.nextInt();

        // Validate the number of persons (it should be positive)
        if (number <= 0) {
            System.out.println("Invalid input. The number of persons must be greater than 0.");
            return;
        }

        // Create a 2D array to store weight, height, and BMI for each person
        double[][] personData = new double[number][3]; 

        // Create a String array to store weight status for each person
        String[] weight = new String[number];

        // To take input for weight and height using for loop for each person
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1) + " : ");

            // Take input for weight and validate
            do {
                System.out.print("Weight in kg : ");
                personData[i][0] = s.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be positive. Please re-enter.");
                }
            } while (personData[i][0] <= 0);

            // Take input for height and validate
            do {
                System.out.print("Height im meter: ");
                personData[i][1] = s.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Height must be positive. Please re-enter.");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI and store in the 2D array
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status based on BMI
            if (personData[i][2] < 18.5) {
                weight[i] = "Underweight";
            } 
			else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weight[i] = "Normal weight";
            } 
			else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
                weight[i] = "Overweight";
            } 
			else {
                weight[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and status for each person
        System.out.println("\nDetails of all persons : ");
		System.out.println("Weight(kg) Height(m) BMI Weight Status");

       // To display each person's data using for loop
       for (int i = 0; i < number; i++) {
       System.out.println(personData[i][0] + "," + personData[i][1] + "," + personData[i][2] + "," + weight[i]

        // Close the scanner
        s.close();
    }
	}