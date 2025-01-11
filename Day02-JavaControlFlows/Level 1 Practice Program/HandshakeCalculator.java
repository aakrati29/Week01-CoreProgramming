// Here import all classes so that we can use their inbuilt functions
import java.util.*;

// Class to calculate the maximum number of handshakes
public class HandshakeCalculator {

    //Method to calculate the maximum number of handshakes
    public static int findMaximumHandshakes(int numberOfStudents) {
        // Formula to calculate the number of handshakes: (n * (n - 1)) / 2
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Ask the user to input the number of students
        System.out.println("Enter the number of students : ");
        int numberOfStudents = s.nextInt(); // Store the input in the variable numberOfStudents

        // Check if the number of students is valid (at least 2 for handshakes to occur)
        if (numberOfStudents < 2) {
            System.out.println("Handshakes are not possible with less than 2 students.");
        } else {
            // Call the method to calculate the maximum number of handshakes
            int maximumHandshakes = findMaximumHandshakes(numberOfStudents);

            // Display the result
            System.out.println("The maximum number of handshakes among " + numberOfStudents +
                    " students is " + maximumHandshakes + ".");
        }
		
		// Close the Scanner 
        s.close(); 
    }
}
