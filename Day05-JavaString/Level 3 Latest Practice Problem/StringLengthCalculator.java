import java.util.*;

public class StringLengthCalculator {

    // Create a method to calculate the length of a string without using the built-in length() method
    public static int findStringLength(String str) {
        int count = 0;

        while (true) {
		
            try {
                str.charAt(count);
                count++; 
            } 
			
			// Handle the exception when index exceeds the string length
			catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
	
       // Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = s.next();

        // Call the user-defined method to calculate the length of the string
        int customLength = findStringLength(str);

        // Display the length calculated by the user-defined method
        System.out.println("Length of the string by custom method : " + customLength);

        // Call the built-in length() method and display the result
        int builtInLength = str.length();
        System.out.println("Length of the string by built-in method : " + builtInLength);

        // Close the scanner object
        s.close();
    }
}
