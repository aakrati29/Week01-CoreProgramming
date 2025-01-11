//here import all classes so that we can use their inbuilt functions
import java.util.s;

public class VotingEligibilityChecker {
    public static void main(String[] args) {
	
        //Define an array of 10 integer elements to store the ages of students
        int[] studentAges = new int[10];

        //Create a object of scanner class
        Scanner s = new Scanner(System.in);

        // Prompt the user to input the age of 10 students
        System.out.println("Enter the age of 10 students:");

        //Loop to get input for all 10 students
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = s.nextInt(); // Take input and store it in the array
        }

        //Loop through the array to check each student's eligibility to vote
        for (int i = 0; i < studentAges.length; i++) {
		
			//Get the current student's age
            int age = studentAges[i]; 

            //Check if the age is a negative number
            if (age < 0) {
                System.out.println("Invalid age entered for student " + (i + 1) + " : " + age);
            }
			
            //Check if the age is 18 or above
            else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            }
			
            //If the age is below 18
            else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        // Close the scanner object 
        s.close();
    }
}
