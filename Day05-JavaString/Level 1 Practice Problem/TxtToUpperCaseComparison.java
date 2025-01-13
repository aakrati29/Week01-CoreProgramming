import java.util.*;

public class TxtToUpperCaseComparison{

    // Method for converting each character to uppercase using ASCII values
    public static String convertToUpperCase(String str) {
        StringBuilder upperCaseText = new StringBuilder();

        // Looping through each character in the text
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Checking if the character is lowercase and convert it to uppercase using ASCII values
            if (currentChar >= 'a' && currentChar <= 'z') {
			
				// ASCII difference between lowercase and uppercase
                char upperCaseChar = (char) (currentChar - 32); 
                upperCaseText.append(upperCaseChar);
            } 
			
			else {
                upperCaseText.append(currentChar); 
            }
        }

        return upperCaseText.toString();
    }

    // Method for comparing two strings and return boolean result
    public static boolean compareStrings(String originalText, String upperCaseText) {
		// Compareing the original text with the upper case version
        return originalText.equals(upperCaseText);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input; 

        // Taking user input
        System.out.print("Enter the text: ");
        input = s.nextLine();

        // Converting the user input to uppercase using custom method
        String customUpperCaseTxt = convertToUpperCase(input);

        // Converting the user input to uppercase using the built-in toUpperCase() method
        String builtInUpperCaseTxt = input.toUpperCase();

        // Comparing the results using the user-defined method
        boolean isEqual = compareStrings(customUpperCaseTxt, builtInUpperCaseTxt);

        System.out.println("\nOriginal Text: " + input);
        System.out.println("Uppercase Text by Custom Method : " + customUpperCaseTxt);
        System.out.println("Uppercase Text by Built-in Method : " + builtInUpperCaseTxt);
        System.out.println("Compare : " + isEqual);
    }
}
