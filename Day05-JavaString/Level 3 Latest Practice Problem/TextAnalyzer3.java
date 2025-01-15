import java.util.Scanner;

// Create a class TextAnalyzer3 to handle the operations
public class TextAnalyzer3 {

    // Create a method to split the text into words using charAt()
    public static String[] splitTextIntoWords(String text) {
        int len = calculateStringLength(text);
        StringBuilder word = new StringBuilder();
        StringBuilder wordsList = new StringBuilder();

        for (int i = 0; i < len; i++) {
            char currentChar = text.charAt(i);
            if (currentChar != ' ') {
                word.append(currentChar);
            } else if (word.length() > 0) {
                wordsList.append(word).append(",");
                word.setLength(0);
            }
        }

        if (word.length() > 0) {
            wordsList.append(word);
        }

        return wordsList.toString().split(",");
    }

    // Create a method to calculate the length of a string without using the length() method
    public static int calculateStringLength(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            count++;
        }
        return count;
    }

    // Create a method to create a 2D array with words and their corresponding lengths
    public static String[][] generateWordLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(calculateStringLength(words[i]));
        }

        return wordLengths;
    }

    // Create a method to find the shortest and longest strings
    public static String[] findShortestAndLongest(String[][] wordLengths) {
        String shortest = wordLengths[0][0];
        String longest = wordLengths[0][0];

        for (String[] wordLength : wordLengths) {
            String word = wordLength[0];
            if (calculateStringLength(word) < calculateStringLength(shortest)) {
                shortest = word;
            }
            if (calculateStringLength(word) > calculateStringLength(longest)) {
                longest = word;
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string : ");
        String text = s.nextLine();

        // Split the text into words
        String[] words = splitTextIntoWords(text);

        // Generate 2D array of words and their lengths
        String[][] wordLengths = generateWordLengths(words);

        // Find the shortest and longest words
        String[] shortestAndLongest = findShortestAndLongest(wordLengths);

        // Display the results
        System.out.println("Shortest Word : " + shortestAndLongest[0]);
        System.out.println("Longest Word : " + shortestAndLongest[1]);

        // Close the Scanner
        s.close();
    }
}
