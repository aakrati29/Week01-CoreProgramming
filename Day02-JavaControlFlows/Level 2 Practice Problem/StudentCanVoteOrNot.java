// Here import all classes so that we can use their inbuilt functions
import java.util.*;

// Create a class StudentCanVoteOrNot to check voting eligibility for students
public class StudentCanVoteOrNot {

    // Create a method to check if a student can vote based on age
    public boolean canStudentVote(int age) {
	
        // Check for invalid age it means negative value
        if (age < 0) {
            return false;
        }
		
        // Check if age is 18 or above then Eligible to vote
        if (age >= 18) {
            return true; 
        }
		
		// Not eligible to vote
        return false; 
    }

    public static void main(String[] args) {
	
        // Create an object of StudentCanVoteOrNot to call its methods
        StudentCanVoteOrNot checker = new StudentCanVoteOrNot();

        // Create array to store the ages of 10 students
        int[] studentAges = new int[10];
		
		// Create a object of Scanner class to take user input
		Scanner s = new Scanner(System.in);

        // Loop to take input from the user for the ages of all 10 students
        for (int i = 0; i < studentAges.length; i++) {
            System.out.println("Enter the age of student " + (i + 1) + " : ");
            studentAges[i] = s.nextInt(); 
        }

        // Loop to check voting eligibility for each student and display the result
        for (int i = 0; i < studentAges.length; i++) {
            boolean isEligible = checker.canStudentVote(studentAges[i]); // Check eligibility
            if (isEligible) {
                System.out.println("Student " + (i + 1) + " with age " + studentAges[i] + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + studentAges[i] + " is not eligible to vote.");
            }
        }

        // Close the scanner 
        s.close();
    }
}
