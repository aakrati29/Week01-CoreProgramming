import java.util.*;

public class TxtToLowerCase{

    // Method for convert each character to uppercase using ASCII values
    public static String convertToLowerCase(String str) {
        StringBuilder sb = new StringBuilder();

        // Looping through each character in the text
        for (int i = 0; i < str.length(); i++) {
            char currentCh = str.charAt(i);

            // Checking if the character is lowercase and convert it to uppercase using ASCII values
            if (currentCh >= 'A' && currentCh <= 'Z') {
			
				// ASCII difference between lowercase and uppercase
                char lowerCaseCharacter = (char) (currentCh + 32); 
                sb.append(lowerCaseCharacter);
            } 
			
			else {
                sb.append(currentCh);
            }
        }

        return sb.toString();
    }

    // Method for comparing two strings and return boolean result
    public static boolean compareStrings(String originalText, String lowerCaseText) {
	
		// Compare the original text with the upper case version
        return originalText.equals(lowerCaseText);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the text : ");
        String input = s.nextLine();

        // Converting the user input to lowercase using custom method
        String customUpperCaseTxt = convertToLowerCase(input);

        // Converting the user input to lowercase using the built-in toUpperCase() method
        String builtInUpperCaseTxt = input.toLowerCase();

        // Comparing the results using the user-defined method
        boolean isEqual = compareStrings(customUpperCaseTxt, builtInUpperCaseTxt);

        System.out.println("\nOriginal Text : " + input);
        System.out.println("Lowercase Text by Custom Method : " + customUpperCaseTxt);
        System.out.println("Lowercase Text by Built-in Method : " + builtInUpperCaseTxt);
        System.out.println("Compare the result " + isEqual);
    }
}
