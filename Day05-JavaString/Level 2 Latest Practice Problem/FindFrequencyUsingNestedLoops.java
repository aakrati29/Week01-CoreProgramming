import java.util.*;

//Creating class FindFrequencyUsingNestedLoops for finding
public class FindFrequencyUsingNestedLoops {

    // Create a method to find character frequency using nested loops
    public static String[][] characterFrequencyUsingNestedLoop(String str) {
        int StringLength = str.length();
        char[] characters = str.toCharArray();
        int[] frequency = new int[StringLength];
        boolean[] seen = new boolean[StringLength];

        for (int i = 0; i < StringLength; i++) {
            if (!seen[i]) {
                frequency[i] = 1;
                for (int j = i + 1; j < StringLength; j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++;
                        seen[j] = true;
                    }
                }
            }
        }

        int uniqueCount = 0;
        for (boolean nowvisit : seen) {
            if (!nowvisit) uniqueCount++;
        }

        String[][] ans = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < StringLength; i++) {
            if (!seen[i]) {
                ans[index][0] = String.valueOf(characters[i]);
                ans[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);
		
		//Taking input from user
        System.out.print("Enter a string: ");
        String str = s.nextLine();
		
		//call method to find frequency
        String[][] ans = characterFrequencyUsingNestedLoop(str);

        System.out.println("Character\tFrequency");
        for (String[] st : ans) {
            System.out.println(st[0] + "\t\t" + st[1]);
        }
		
		// Closing Scanner class object
        s.close();
    }
}