// Here import Random and Scanner to use their inbuilt functions
import java.util.Random;
import java.util.Scanner;

//Create a class ScoreCardOfStudents for create and display scorecard
public class ScoreCardOfStudents {

    // Create a method to generate random 2-digit scores for PCM
    public static int[][] generateScores(int numberOfStudents) {
        Random random = new Random();
        int[][] marks = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
		
			// Random score for Physics (60-100)
            marks[i][0] = random.nextInt(41) + 60; 
			
			// Random score for Chemistry (60-100)
            marks[i][1] = random.nextInt(41) + 60; 
			
			// Random score for Math (60-100)
            marks[i][2] = random.nextInt(41) + 60; 
        }
        return marks;
    }

    // Create a method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] marks) {
        int numberOfStudents = marks.length;
        double[][] results = new double[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Create a method to display the scorecard
    public static void displayScoreCard(int[][] marks, double[][] results) {
        System.out.println("\nScorecard : ");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");

        for (int i = 0; i < marks.length; i++) {
            System.out.print((i + 1) + "\t\t" + marks[i][0] + "\t\t" + marks[i][1] + "\t\t" + marks[i][2] + "\t" + (int) results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2] + "%\n");
        }
    }

    public static void main(String[] args) {
	
        // Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

		// Ask the user to input a number
        System.out.print("Enter the number of students : ");
        int numberOfStudents = s.nextInt();

        // Generate random marks for students
        int[][] marks = generateScores(numberOfStudents);

        // Calculate total, average, and percentage
        double[][] results = calculateResults(marks);

        // Display the scorecard
        displayScoreCard(marks, results);
		
		//closing scanner class
        s.close();
    }
}