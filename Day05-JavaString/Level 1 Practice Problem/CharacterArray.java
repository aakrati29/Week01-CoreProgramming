import java.util.*;

public class CharacterArray{

    // Method to return characters in a string without using toCharArray()
    public static char[] getCharactersUsingLoop(String text) {
        
		char[] charactersArray = new char[text.length()];
        
		for (int i = 0; i < text.length(); i++) {
            charactersArray[i] = text.charAt(i);
        }
        
		return charactersArray;
    }

    // Method to compare two character arrays
    public static boolean compareCharacterArrays(char[] firstArray, char[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }
        
		for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }
        
		return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Taking user input for the string
        String userInputString = s.next();

        // Take characters using user-defined method
        char[] charactersUsingLoop = getCharactersUsingLoop(userInputString);

        // Take characters using built-in toCharArray() method
        char[] charactersUsingBuiltInMethod = userInputString.toCharArray();

        // Comparing the two character arrays
        boolean areArraysEqual = compareCharacterArrays(charactersUsingLoop, charactersUsingBuiltInMethod);

        // Display the results
        System.out.println("Characters using user-defined method: " + String.valueOf(charactersUsingLoop));
        System.out.println("Characters using built-in toCharArray() method: " + String.valueOf(charactersUsingBuiltInMethod));
        System.out.println("Comparison result: " + areArraysEqual);

        if (areArraysEqual) {
            System.out.println("Both methods produce the same result");
        } 
		
		else {
            System.out.println("Methods produce different results");
        }

    }
}
