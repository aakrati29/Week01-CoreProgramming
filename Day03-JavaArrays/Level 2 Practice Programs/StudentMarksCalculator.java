// Here import all classes so that we can use their inbuilt functions
import java.util.*;

//Creating class StudentMarksCalculator for Student Marks Calculate
public class StudentMarksCalculator {

    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Input the number of students
        System.out.println("Enter the number of students : ");
        int totalStudent = s.nextInt();

        // Arrays to store marks, percentages, and grades
        int[] physicsMarks = new int[totalStudent];
        int[] chemistryMarks = new int[totalStudent];
        int[] mathsMarks = new int[totalStudent];
        double[] percentages = new double[totalStudent];
        char[] grades = new char[totalStudent];

        // Input marks for each student
        for (int i = 0; i < totalStudent; i++) {
            System.out.println("Enter marks for student " + (i + 1) + " : ");

            System.out.print("Physics : ");
            physicsMarks[i] = s.nextInt();
            if (physicsMarks[i] < 0) {
                System.out.println("Please enter a positive value.");
                i--;
                continue;
            }

            System.out.print("Chemistry: ");
            chemistryMarks[i] = s.nextInt();
            if (chemistryMarks[i] < 0) {
                System.out.println("Please enter a positive value.");
                i--;
                continue;
            }

            System.out.print("Maths: ");
            mathsMarks[i] = s.nextInt();
            if (mathsMarks[i] < 0) {
                System.out.println("Please enter a positive value.");
                i--;
            }
        }

        // Calculate percentage and grade for each student
        for (int i = 0; i < totalStudent; i++) {
            int totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks / 300.0) * 100;

            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } 
			
			else if (percentages[i] >= 75) {
                grades[i] = 'B';
            } 
			
			else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } 
			
			else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } 
			
			else {
                grades[i] = 'F';
            }
        }

        // Display the results
		System.out.println("\nResults : ");
		for (int i = 0; i < totalStudent; i++) {
			System.out.println("Student " + (i + 1) + " : ");
			System.out.println("Physics : " + physicsMarks[i] + ", Chemistry : " + chemistryMarks[i] + 
                       ", Maths : " + mathsMarks[i]);
			System.out.println("Percentage : " + String.format("%.2f", percentages[i]) + "%, Grade : " + grades[i] + "\n");
		}

		//closing the scanner object
        s.close();
    }
}