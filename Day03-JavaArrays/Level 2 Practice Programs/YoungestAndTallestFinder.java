// Here import all classes so that we can use their inbuilt functions
import java.util.*;

// Create a class YoungestAndTallestFinder to find the youngest and tallest among 3 friends
public class YoungestAndTallestFinder {

    public static void main(String[] args) {
	
        // Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Define arrays to store ages and heights for Amar, Akbar, and Anthony
        int[] ages = new int[3];       
        double[] heights = new double[3]; 

        // Create Array to store the names of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Input ages and heights for the three friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + " : ");
            ages[i] = s.nextInt();

            System.out.print("Enter the height of " + names[i] + " (in cm) : ");
            heights[i] = s.nextDouble();
        }

        // Create variables to store the index of the youngest and tallest friend
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Find the youngest and tallest friend using for loop
        for (int i = 1; i < 3; i++) {
			
            // Check if the current friend's age is less than the youngest found so far
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            // Check the current friend's height is greater than the tallest then
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the youngest and tallest friend
        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");

        // Close the scanner
        s.close();
    }
}