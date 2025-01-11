// Here import all classes so that we can use their inbuilt functions
import java.util.*;

// Create a class to check whether a year is a leap year
public class LeapYearOrNot {

    //Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
	
        // Check if the year is divisible by 4 and not divisible by 100 or divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
	    
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in); 

        // Prompt the user to enter a year
        System.out.println("Enter a year must be >= 1582 : ");
		
		// Read the year input
        int year = s.nextInt(); 

        // Validate that the year is greater than or equal to 1582
        if (year < 1582) {
            System.out.println("Invalid year! Please enter a year greater than or equal to 1582.");
        } else {
            // Call the method to check if the year is a leap year
            boolean isLeap = isLeapYear(year);

            // Display the result based on the method's output
            if (isLeap) {
                System.out.println("The year " + year + " is a Leap Year.");
            } 
			
			else {
                System.out.println("The year " + year + " is NOT a Leap Year.");
            }
        }

	// Close the scanner 
        s.close(); 
    }
}
