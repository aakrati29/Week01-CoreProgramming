// Here import all classes so that we can use their inbuilt functions
import java.util.*; 

// Class to calculate maximum handshakes
public class MaximumHandshakes {

    //Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        // Formula to calculate the number of handshakes : (n * (n - 1)) / 2
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
		
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in); 

        // Taking input for the number of students
        System.out.println("Enter the number of students:");
        int numberOfStudents = s.nextInt(); // Store the number of students

        // Ensure the number of students is valid (at least 2 for a handshake to happen)
        if (numberOfStudents < 2) {
            System.out.println("At least 2 students are needed for handshakes.");
        } 
		
		else {
            // Call the method to calculate the maximum number of handshakes
            int maxHandshakes = calculateHandshakes(numberOfStudents);

            // Display the result
            System.out.println("The maximum number of handshakes among " + numberOfStudents +
                    " students is " + maxHandshakes + ".");
        }

		// Close the Scanner
        s.close();
    }
}
