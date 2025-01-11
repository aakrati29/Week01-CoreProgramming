// Create a class SpringSeason to determine if a given date is in the Spring season
public class SpringSeason {

    // Method to check if the given month and day fall in the Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Check if the date falls between March 20 and June 20
        if ((month == 3 && day >= 20 && day <= 31) || 
            (month == 4 && day >= 1 && day <= 30) ||  
            (month == 5 && day >= 1 && day <= 31) ||  
            (month == 6 && day >= 1 && day <= 20)) { 
            return true; // Date is in Spring season
        }
        return false; // Date is not in Spring season
    }

    public static void main(String[] args) {
        // Check if correct number of arguments is provided (month and day)
        if (args.length != 2) {
            System.out.println("Please provide both month and day as command-line arguments.");
            return; // Exit the program if inputs are not correct
        }

        // Parse month and day from command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the given month and day are within valid ranges
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid input. Please provide a valid month (1-12) and day (1-31).");
            return;
        }

        // Call the method to check if it's Spring season
        boolean isSpring = isSpringSeason(month, day);

        // Print the result
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } 
		
		else {
            System.out.println("Not a Spring Season.");
        }
    }
}
