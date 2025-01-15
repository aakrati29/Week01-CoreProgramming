import java.util.*;

// Class to find the first non-repeating character in a string
public class NonRepeatingCharacterFinder {

    // Method to identify the first non-repeating character in a given string
    public static char getFirstUniqueCharacter(String str) {
        int[] charFrequency = new int[256];

        // Count the frequency
        for (int i = 0; i < str.length(); i++) {
            charFrequency[str.charAt(i)]++;
        }

        // Iterateing on string to find the first unique character
        for (int i = 0; i < str.length(); i++) {
            if (charFrequency[str.charAt(i)] == 1) {
                return str.charAt(i); 
            }
        }

        return '\0'; 
    }

    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = s.nextLine();

        // Call the method to find the first non-repeating character
        char uniqueCharacter = getFirstUniqueCharacter(str);

        // Display the result
        if (uniqueCharacter != '\0') {
            System.out.println("The first non-repeating character is : " + uniqueCharacter);
        } 
		
		else {
            System.out.println("No unique character found in the string.");
        }

        // Close the Scanner object
        s.close();
    }
}
