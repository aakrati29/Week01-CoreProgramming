import java.util.*;

// Class to find the frequency of unique characters in a string
public class UniqueCharacterFrequency {

    // Create a method to extract unique characters from a string
    public static char[] getUniqueCharacters(String str) {
        int stringLength = str.length();
        char[] uniqueCharacters = new char[stringLength];
        int indexForUnique = 0;

        for (int i = 0; i < stringLength; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Check if the character is unique by comparing with previous characters
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the array
            if (isUnique) {
                uniqueCharacters[indexForUnique++] = currentChar;
            }
        }

        // Trim the array to include only unique characters
        char[] trimmedResult = new char[indexForUnique];
        System.arraycopy(uniqueCharacters, 0, trimmedResult, 0, indexForUnique);
        return trimmedResult;
    }

    // Create a method to calculate the frequency of each unique character in the string
    public static String[][] calculateCharacterFrequency(String str) {
        char[] uniqueChars = getUniqueCharacters(str);
        String[][] frequencyResult = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i];
            int count = 0;

            // Count occurrences of the current character in the string
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }

            // Store the character and its frequency in the result array
            frequencyResult[i][0] = String.valueOf(currentChar);
            frequencyResult[i][1] = String.valueOf(count);
        }

        return frequencyResult;
    }

    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = s.nextLine();

        // Call the method to calculate character frequency
        String[][] frequencyData = calculateCharacterFrequency(str);

        // Display the frequency of each unique character
        System.out.println("Character\tFrequency");
        for (String[] row : frequencyData) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }

        // Close the Scanner object
        s.close();
    }
}
