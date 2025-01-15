import java.util.*;

// Create a class to calculate and display student grades based on scores
public class StudentGradeManager {

    // Create a method to generate random scores for Physics, Chemistry, and Mathematics for all students
    public static int[][] generateStudentScores(int totalStudents) {
        Random random = new Random();
        int[][] studentScores = new int[totalStudents][3]; 
        for (int i = 0; i < totalStudents; i++) {
		
			// Random score for Physics
            studentScores[i][0] = random.nextInt(101);

			// Random score for Chemistry
            studentScores[i][1] = random.nextInt(101); 
			
			// Random score for Mathematics
            studentScores[i][2] = random.nextInt(101); 
        }
        return studentScores;
    }

    // Create a method to calculate total marks, average marks, and percentage for each student
    public static double[][] computeStudentStatistics(int[][] studentScores) {
        double[][] statistics = new double[studentScores.length][3]; 
            int totalMarks = studentScores[i][0] + studentScores[i][1] + studentScores[i][2];
            double averageMarks = totalMarks / 3.0;
            double percentage = (totalMarks / 300.0) * 100;

            // Storing calculated values
            statistics[i][0] = totalMarks;
            statistics[i][1] = Math.round(averageMarks * 100.0) / 100.0; 
            statistics[i][2] = Math.round(percentage * 100.0) / 100.0;   
        }
        return statistics;
    }

    // Create a method to assign grades based on the percentage
    public static String[] determineStudentGrades(double[][] statistics) {
        String[] studentGrades = new String[statistics.length];
        for (int i = 0; i < statistics.length; i++) {
            double percentage = statistics[i][2];
            if (percentage >= 80) {
                studentGrades[i] = "A";
            } 
			
			else if (percentage >= 70) {
                studentGrades[i] = "B";
            } 
			
			else if (percentage >= 60) {
                studentGrades[i] = "C";
            } 
			
			else if (percentage >= 50) {
                studentGrades[i] = "D";
            } 
			
			else if (percentage >= 40) {
                studentGrades[i] = "E";
            } 
			
			else {
                studentGrades[i] = "F"; // Fail
            }
        }
        return studentGrades;
    }

    // Method to display the scorecard for all students
    public static void displayStudentScorecard(int[][] studentScores, double[][] statistics, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < studentScores.length; i++) {
            System.out.println((i + 1) + "\t" + studentScores[i][0] + "\t" + studentScores[i][1] + "\t\t" + studentScores[i][2] 
                               + "\t" + (int)statistics[i][0] + "\t" + statistics[i][1] + "\t" + statistics[i][2] + "\t\t" + grades[i]);
        }
    }

    public static void main(String[] args) {
	
        // Create a Scanner object to take input from the user
        Scanner s = new Scanner(System.in);

        // Ask the user for the number of students
        System.out.print("Enter the number of students: ");
        int totalStudents = s.nextInt();

        // Generate random scores for students
        int[][] studentScores = generateStudentScores(totalStudents);

        // Calculate total, average, and percentage for each student
        double[][] statistics = computeStudentStatistics(studentScores);

        // Determine grades for students
        String[] grades = determineStudentGrades(statistics);

        // Display the complete scorecard
        displayStudentScorecard(studentScores, statistics, grades);

        // Close the Scanner object
        s.close();
    }
}
