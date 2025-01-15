import java.util.*;

// Create a class TextAnalyzer1 to handle operations
public class TextAnalyzer1 {

    // Create a method to calculate the length of a string without using the length() method
    public static int calculateLength(String str1) {
        int count = 0;
        for (char c : str1.toCharArray()) {
            count++;
        }
        return count;
    }

    // Create a method to split the text into words using charAt() without using the split() method
    public static String[] splitTextIntoWords(String str1) {
        int length = calculateLength(str1);
        int wordCount = 0;

        // Count words by identifying spaces
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) == ' ' || (i == length - 1 && str1.charAt(i) != ' ')) {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder currentWord = new StringBuilder();

        // Extract words using spaces
        for (int i = 0; i < length; i++) {
            char currentChar = str1.charAt(i);
            if (currentChar != ' ') {
                currentWord.append(currentChar);
            } else if (currentWord.length() > 0) {
                words[wordIndex++] = currentWord.toString();
                currentWord.setLength(0);
            }
        }

        // Add the last word
        if (currentWord.length() > 0) {
            words[wordIndex] = currentWord.toString();
        }

        return words;
    }

    // Create a method to compare two String arrays and return a boolean
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Take user input from user
        System.out.print("Enter a sentence : ");
        String str1 = s.nextLine();

        // Split text using user-defined method
        String[] customSplitWords = splitTextIntoWords(str1);

        // Split text using built-in split() method
        String[] builtInSplitWords = str1.split(" ");

        // Compare the results
        boolean areEqual = compareStringArrays(customSplitWords, builtInSplitWords);

        // Display the results
        System.out.println("Words using custom method:");
        for (String word : customSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split() method:");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nComparison Result : " + (areEqual ? "Both methods produce the same result" : "Results are different"));

        // Close Scanner
        s.close();
    }
}
