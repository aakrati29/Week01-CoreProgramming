import java.util.Scanner;

// Create a class TextAnalyzer2 for handling operations
public class TextAnalyzer2 {

    // Create a method to split the text into words using charAt()
    public static String[] splitIntoWords(String str) {
        int strLength = calculateLength(str);
        StringBuilder word = new StringBuilder();
        StringBuilder wordsList = new StringBuilder();

        for (int i = 0; i < strLength; i++) {
            char currentChar = str.charAt(i);
            if (currentChar != ' ') {
                word.append(currentChar);
            } 
			
			else if (word.length() > 0) {
                wordsList.append(word).append(",");
                word.setLength(0);
            }
        }

        if (word.length() > 0) {
            wordsList.append(word); 
        }

        return wordsList.toString().split(",");
    }

    // Create a method to calculate the length of a string without using length()
    public static int calculateLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method to create a 2D array with words and their corresponding lengths
    public static String[][] generateWordLengthArray(String[] words) {
        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(calculateLength(words[i]));
        }

        return wordLengths;
    }

    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Take user input from user
        System.out.print("Enter a sentence : ");
        String str = s.nextLine();

        // Split text into words
        String[] words = splitIntoWords(str);

        // Generate 2D array with words and their lengths
        String[][] wordLengthArray = generateWordLengthArray(words);

        // Display the result in a tabular format
        System.out.println("Word\t\tLength");
        for (String[] wordData : wordLengthArray) {
            String word = wordData[0];
            int length = Integer.parseInt(wordData[1]); 
            System.out.println(word + "\t\t" + length);
        }

        // Close Scanner
        s.close();
    }
}
