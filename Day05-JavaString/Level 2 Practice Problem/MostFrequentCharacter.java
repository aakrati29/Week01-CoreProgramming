import java.util.*;

public class MostFrequentCharacter {

    // Method to find the most frequent character in a string
    public static char findMostFrequentCharacter(String str) {
        int maxCount = 0; 
        char mostFrequentCharacter = '\0'; 
        str = str.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentCh = str.charAt(i);
            int count = 0;

            // Count the occurrences of the current character
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentCh) {
                    count++;
                }
            }

            // Update the most frequent character if a higher frequency is found
            if (count > maxCount) {
                maxCount = count;
                mostFrequentCharacter = currentCh;
            }
        }

        return mostFrequentCharacter;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Take input from user
        String input = s.nextLine();

        // Find the most frequent character
        char result = findMostFrequentCharacter(input);

        // Display the result
        System.out.println("Most Frequent Character is : '" + result + "'");
    }
}
