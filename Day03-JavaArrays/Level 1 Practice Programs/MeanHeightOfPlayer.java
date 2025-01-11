// here import all classes so that we can use their inbuilt functions
import java.util.Scanner;

// create a class MeanHeightOfPlayer to calculate the mean height of players present in a football team
public class MeanHeightOfPlayer {

    public static void main(String[] args) {
	
        // Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Define a double array to store the heights of the players of size 11
        double[] heights = new double[11];

        // Variable to store the sum of all heights, initialized to 0.0
        double sum = 0.0;

        // Prompt the user to enter the heights of all 11 players
        System.out.println("Enter the heights of 11 football players : ");

        // Use a for loop to get input for each player's height
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + " : ");
			
			// Store the height in the array
            heights[i] = s.nextDouble(); 
			
			// Add the height to the sum
            sum += heights[i]; 
        }

        // Calculate the mean height by dividing the sum by the number of players 11
        double meanHeight = sum / heights.length;

        // Display the mean height of the football team
        System.out.println("The mean height of the football team is : " + meanHeight);

        // Close the scanner 
        s.close();
    }
}
