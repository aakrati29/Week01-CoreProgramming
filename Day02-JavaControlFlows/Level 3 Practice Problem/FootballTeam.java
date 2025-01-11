import java.util.Random;

// Create a class FootballTeam to find the shortest, tallest, and mean height of players present in a football team
public class FootballTeam {

    // Create a method to calculate the sum of all heights in the array
    public int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height; // Add each height to the sum
        }
        return sum;
    }

    // Create a method to calculate the mean height of the players
    public double calculateMean(int[] heights) {
        int sum = calculateSum(heights); // Get the sum of the heights
        return (double) sum / heights.length; // Calculate mean
    }

    // Create a method to find the shortest height from the array.
    public int findShortest(int[] heights) {
        int shortest = heights[0]; // Assume the first height is the shortest
        for (int height : heights) {
            if (height < shortest) {
                shortest = height; // Update if a smaller height is found
            }
        }
        return shortest;
    }

    // Create a method to find the tallest height from the array.
    public int findTallest(int[] heights) {
	
	// Assume the first height is the tallest
        int tallest = heights[0]; 
        for (int height : heights) {
		
		// Update if a larger height is found
            if (height > tallest) {
                tallest = height; 
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
	
        // Create an object of the FootballTeam class
        FootballTeam team = new FootballTeam();
        Random random = new Random();
        
        // Create an array to store the heights of 11 players
        int[] heights = new int[11];

        // Populate the array with random heights in the range of 150 to 250 cms
        for (int i = 0; i < heights.length; i++) {
		
		// Random height between 150 and 250 cms
            heights[i] = random.nextInt(101) + 150; 
        }

        // Calculate sum, mean, shortest, and tallest height
        int sum = team.calculateSum(heights);
        double mean = team.calculateMean(heights);
        int shortest = team.findShortest(heights);
        int tallest = team.findTallest(heights);

        // Display the results
        System.out.println("Heights of the players : ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        System.out.println("Sum of heights : " + sum);
        System.out.println("Mean height : " + mean);
        System.out.println("Shortest height : " + shortest);
        System.out.println("Tallest height : " + tallest);
    }
}
