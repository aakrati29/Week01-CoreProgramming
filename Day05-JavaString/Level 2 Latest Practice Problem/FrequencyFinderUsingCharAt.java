import java.util.*;

// Class to calculate the frequency of characters in a string
public class FrequencyFinderUsingCharAt {

    // Create a method to find the frequency of characters in a string
    public static String[][] calculateCharacterFrequency(String str) {
        int[] frequencyArray = new int[256]; 

        // Iterating the string to calculate the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char currentCharacter = str.charAt(i);
            frequencyArray[currentCharacter]++;
        }

        // Count the number of unique characters in the string
        int uniqueCharacterCount = 0;
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > 0) {
                uniqueCharacterCount++;
            }
        }

        // Create a 2D array to store the characters and their frequencies
        String[][] resultArray = new String[uniqueCharacterCount][2];
        int index = 0;

        // Store the characters and their frequencies in the 2D array
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > 0) {
                resultArray[index][0] = String.valueOf((char) i);
                resultArray[index][1] = String.valueOf(frequencyArray[i]); 
                index++;
            }
        }

        return resultArray;
    }

    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = s.nextLine();

        // Call the method to calculate character frequency
        String[][] frequencyData = calculateCharacterFrequency(str);

        // Display the frequency of each character
        System.out.println("Character\tFrequency");
        for (String[] row : frequencyData) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }

        // Close the Scanner object
        s.close();
    }
}
