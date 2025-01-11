// Here import all classes so that we can use their inbuilt functions
import java.util.*; 

// Create a class CalculateStudentGrades to calculate the grade of students
public class CalculateStudentGrades {
    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Prompting user for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = s.nextInt();

        // 2D array to store marks of students in Physics, Chemistry, and Maths
        int[][] marks = new int[numStudents][3]; 

        // Array to store the total marks of each student
        int[] totalMarks = new int[numStudents]; 

        // Array to store the percentage of each student
        double[] percentages = new double[numStudents];

        // Array to store the grade of each student
        char[] grades = new char[numStudents];

        // Taking input for marks of each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = s.nextInt(); // Storing Physics marks in column 0

            System.out.print("Chemistry: ");
            marks[i][1] = s.nextInt(); // Storing Chemistry marks in column 1

            System.out.print("Maths: ");
            marks[i][2] = s.nextInt(); // Storing Maths marks in column 2
        }

        // Calculating total marks, percentage, and grade for each student
        for (int i = 0; i < numStudents; i++) {
            // Calculating total marks by adding of all subjects marks
            totalMarks[i] = marks[i][0] + marks[i][1] + marks[i][2];

            // Calculating percentage
            percentages[i] = (totalMarks[i] / 3.0); 

            // Determining grade based on percentage
            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } 
			
			else if (percentages[i] >= 75) {
                grades[i] = 'B';
            } 
			
			else if (percentages[i] >= 50) {
                grades[i] = 'C';
            } 
			
			else {
				// Grade D for percentages below 50
                grades[i] = 'D'; 
            }
        }

        // Displaying results for all students
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + " : ");
            System.out.println("Physics : " + marks[i][0]);
            System.out.println("Chemistry : " + marks[i][1]);
            System.out.println("Maths : " + marks[i][2]);
            System.out.println("Total Marks : " + totalMarks[i]);
            System.out.println("Percentage : " + percentages[i] + "%");
            System.out.println("Grade : " + grades[i]);
            System.out.println();
        }

		// Closing the Scanner
        s.close(); 
    }
}
