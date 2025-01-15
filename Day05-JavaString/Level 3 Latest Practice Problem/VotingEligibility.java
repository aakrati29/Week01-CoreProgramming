import java.util.*;

//Create a Class VotingEligibility for checking
public class VotingEligibility {

    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(50);
        }
        return ages;
    }

    // Create a method to determine voting eligibility
    public static String[][] votingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Invalid Age";
            } 
			
			else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } 
			
			else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Create a method to display results in a tabular format
    public static void displayTable(String[][] table) {
        System.out.println("Age\tStatus");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);
		
		//Taking input from user
        System.out.print("Enter the number of students: ");
        int n = s.nextInt();

        int[] ages = generateAges(n);
        String[][] results = votingEligibility(ages);
		
		//Display the result
        displayTable(results);
		
		//Closing Scanner class object
        s.close();
    }
}