import java.util.*;

// Class to find and display unique characters in a string
public class UniqueCharacterFinder {

    // Create a method to calculate the length of a string without using built-in length() method
    public static int calculateStringLength(String str1) {
        int count = 0;
        for (char ch : str1.toCharArray()) {
            count++; 
        }
        return count;
    }

    // Create a method to identify and return unique characters from a string
    public static char[] extractUniqueCharacters(String str1) {
        int strLength = calculateStringLength(str1); 
		
		// Temporary array to store unique characters
        char[] tempUniqueCharacters = new char[strLength]; 
		
        int uniqueCharIndex = 0; 

        // Loop through the string to find unique characters
        for (int i = 0; i < strLength; i++) {
            char currentChar = str1.charAt(i);
            boolean isUnique = true; 

            // Check if the character is repeated in the previous part of the string
            for (int j = 0; j < i; j++) {
                if (str1.charAt(j) == currentChar) {
                    isUnique = false; 
                    break;
                }
            }

            // If unique, add to the array
            if (isUnique) {
                tempUniqueCharacters[uniqueCharIndex++] = currentChar;
            }
        }

        char[] finalUniqueCharacters = new char[uniqueCharIndex];
        System.arraycopy(tempUniqueCharacters, 0, finalUniqueCharacters, 0, uniqueCharIndex);

		// Return the final array of unique characters
        return finalUniqueCharacters; 
    }

    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str1 = s.nextLine();

        // Call the method to extract unique characters
        char[] uniqueCharacters = extractUniqueCharacters(str1);

        // Display the unique characters
        System.out.println("Unique characters in the input string :");
        for (char character : uniqueCharacters) {
            System.out.print(character + " ");
        }

        // Close the Scanner object
        s.close();
    }
}
