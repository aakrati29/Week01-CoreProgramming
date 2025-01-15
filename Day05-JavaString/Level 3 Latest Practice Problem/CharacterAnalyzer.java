import java.util.*;

// Create a class to handle the vowel and consonant logic
public class CharacterAnalyzer {

    // Create a method to determine the type of character
    public static String checkCharacterType(char ch) {
	
        // Convert character to lowercase for uniform comparison
        char lowerChar = Character.toLowerCase(ch);

        // Check if the character is a letter
        if (lowerChar >= 'a' && lowerChar <= 'z') {
		
            // Check if the character is a vowel
            if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
                return "Vowel";
            } 
			
			else {
                return "Consonant";
            }
        } 
		
		else {
            return "Not a Letter";
        }
    }

    // Create a method to analyze the string and return character types in a 2D array
    public static String[][] analyzeString(String text) {
        int len = text.length();
        String[][] analysis = new String[len][2];

        for (int i = 0; i < len; i++) {
            char currentChar = text.charAt(i);
            analysis[i][0] = String.valueOf(currentChar);
            analysis[i][1] = checkCharacterType(currentChar);
        }

        return analysis;
    }

    // Create a method to display the 2D array in a tabular format
    public static void displayAnalysis(String[][] analysis) {
        System.out.println("Character\tType");
        for (String[] row : analysis) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string : ");
        String text = s.nextLine();

        // Analyzing the string
        String[][] result = analyzeString(text);

        // Display the result
        displayAnalysis(result);

        // Close the scanner
        s.close();
    }
}
