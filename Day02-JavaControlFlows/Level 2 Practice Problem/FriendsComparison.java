// Here import all classes so that we can use their inbuilt functions
import java.util.*;

// Create a class FriendsComparison to find the youngest and tallest among friends
public class FriendsComparison {

    // Create a method to find the youngest friend based on ages
    public static int findYoungest(int[] ages) {
	
	// Assume the first friend is the youngest
        int youngestIndex = 0; 
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i; 
            }
        }
		
		// Return the index of the youngest friend
        return youngestIndex; 
    }

    // Create a method to find the tallest friend based on heights
    public static int findTallest(double[] heights) {
	
	// Assume the first friend is the tallest
        int tallestIndex = 0; 
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i; 
            }
        }
		
		// Return the index of the tallest friend
        return tallestIndex; 
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Scanner for user input

        // Arrays to store the ages and heights of the friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"}; 

        // Loop to take input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the age of " + names[i] + ": ");
            ages[i] = s.nextInt(); // Input age
            System.out.println("Enter the height of " + names[i] + " (in cm): ");
            heights[i] = s.nextDouble(); 
        }

        // Find the youngest friend
        int youngestIndex = findYoungest(ages);
        System.out.println("The youngest friend is " + names[youngestIndex] +
                " with an age of " + ages[youngestIndex] + " years.");

        // Find the tallest friend
        int tallestIndex = findTallest(heights);
        System.out.println("The tallest friend is " + names[tallestIndex] +
                " with a height of " + heights[tallestIndex] + " cm.");

        // Close the scanner
        s.close();
    }
}
